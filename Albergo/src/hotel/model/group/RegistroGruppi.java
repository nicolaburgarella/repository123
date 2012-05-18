package hotel.model.group;

import java.util.*;
import java.io.*;

public class RegistroGruppi {
	private ArrayList<Gruppo> registroGruppi=new ArrayList<Gruppo>();

//Inizializza il registro gruppi rimuovendo tutti gli elementi della lista
	public RegistroGruppi(){
		//Removes all of the elements from this list.
		registroGruppi.clear();

	}

//Controlla se il gruppo passato come parametro esiste nella lista,se c'è viene inserito nella lista	
	public boolean inserisci(Gruppo gruppo){
		for(int i=0;i<registroGruppi.size()-1;i++){
			if((registroGruppi.get(i)).equals(gruppo)){
				return false;
			}

		}
		registroGruppi.add(gruppo);
		gruppo.setIncrId();
		Gruppo.gruppiTotInseriti++;
		return true;
	}

//da togliere ,non lo uso
//Controlla se l'id del gruppo passato come parametro esiste e ritorna l'indice della lista con quell'id
	public int cerca(int idGruppo){
		for(int i=0;i<registroGruppi.size();i++){
			if((registroGruppi.get(i)).getId()==idGruppo){
				return i;
			}
		}
		return -1;
	}

//Ritorna il gruppo in base all'indice della lista passato come parametro
	public Gruppo getGruppo(int posizione){
		return registroGruppi.get(posizione);
	}


//Salva nel file txt lo storico gruppi,ovvero il guestBook
	public void aggiornaStoricoGruppi(){
		try{
            File fileTesto =new File("guestBook.txt");
            FileInputStream inStream= new FileInputStream(fileTesto);
            BufferedReader lineReader= new BufferedReader(new InputStreamReader(inStream));

            String riga="";
            StringBuffer buffer=new StringBuffer();
            while((riga=lineReader.readLine())!=null){
                    buffer.append(riga);
            }
            inStream.close();
            lineReader.close();
            String storicoSalvatoPrec=buffer.toString();

            File fileModificato =new File("guestBook.txt");
            FileOutputStream outStream= new FileOutputStream(fileModificato);
            BufferedWriter lineWriter= new BufferedWriter(new OutputStreamWriter(outStream));
            lineWriter.newLine();
            lineWriter.write(storicoSalvatoPrec+"\n"+(registroGruppi.get(registroGruppi.size()-1)).toString());

            outStream.close();
            lineWriter.close();
            }
		catch(IndexOutOfBoundsException ie){
			 ie.printStackTrace();
			 }
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		finally{
			System.out.println("Gruppo numero"+Gruppo.gruppiTotInseriti+"salvato nello storico gruppi");
		}
	}

	/*
	 * salva va reso un file xml <GRUPPO id="" nome="" dataArrivo="" anticipo="" singole="" doppie="" matrimoniali="" />
	 * */
	public void salvaInXML(){
		this.aggiornaStoricoGruppi();
		try{
			File file =new File("RegistroGruppi.txt");
			FileOutputStream outStream= new FileOutputStream(file);
	        BufferedWriter lineWriter= new BufferedWriter(new OutputStreamWriter(outStream));
	        for(int i=0;i<registroGruppi.size();i++){
	            String LineaTesto;
	            LineaTesto="<GRUPPO id="+(registroGruppi.get(i)).getId()+" nome="+(registroGruppi.get(i)).getNome()+" dataArrivo="+
	            ((registroGruppi.get(i)).getDataArrivo())+" anticipo="+((registroGruppi.get(i)).getAnticipoVersato())+" singole="+
	            (registroGruppi.get(i)).getSingole()+" doppie="+
	            (registroGruppi.get(i)).getDoppie()+" matrimoniali="+
	            (registroGruppi.get(i)).getMatrimoniali()+" />";
	            lineWriter.write(LineaTesto);
	        	//lineWriter.newLine();
			}
	        outStream.close();
	        lineWriter.close();
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
	}




	public void caricaDaXML(){
		try{
            File fileTesto =new File("RegistroGruppi.txt");
            FileInputStream inStream= new FileInputStream(fileTesto);
            BufferedReader lineReader= new BufferedReader(new InputStreamReader(inStream));
            Gruppo gruppo;
            String lineaTesto;
            int indexInit,indexEnd;
            boolean trovato=false;
            //legge il file riga per riga
            while((lineaTesto=lineReader.readLine())!=null){
                    if((indexInit=lineaTesto.indexOf("<GRUPPO"))>-1){
                            //estrae i dati del gruppo
                            int id=Integer.parseInt(estrai("id",lineaTesto));
                            String nome=estrai("nome",lineaTesto);
                            String dataArrivo=estrai("dataArrivo",lineaTesto);
                            double anticipoVersato=Double.parseDouble(estrai("anticipo",lineaTesto));
                            int singola=Integer.parseInt(estrai("singola",lineaTesto));
                            int doppia=Integer.parseInt(estrai("doppia",lineaTesto));
                            int matrimoniale=Integer.parseInt(estrai("matrimoniale",lineaTesto));
                            gruppo=new Gruppo(id,nome,dataArrivo,anticipoVersato,singola,doppia,matrimoniale);
                            //Appends the specified element to the end of this list.
                            registroGruppi.add(gruppo);
                            trovato=true;
                    }
                    else if((indexInit=lineaTesto.indexOf(" />"))>-1){
                            System.out.println("Appena caricato il gruppo");
                    }
                    else{
                            continue;
                    }
            }
            //chiude il file di testo
            lineReader.close();
            inStream.close();
            }
            catch(IOException ioe){
                    ioe.printStackTrace();
            }
	}

	static String estrai(String chiave,String riga){
		int indexInit,indexEnd;
		indexInit=riga.indexOf(chiave)+chiave.length()+2;//pos chiave+2,ovvero ="
		String valore=riga.substring(indexInit);
		indexEnd=valore.indexOf('"');
		valore=valore.substring(0,indexEnd); //il secondo parametro di substring è escluso
		return valore;
	}
}




/*
RICORDARSI DI CHIAMARE SALVA IN XML IN DB di tutti i registri alla fine della opzione selezionata.
*/


