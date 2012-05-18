package hotel.model.extra;
import hotel.model.room.RegistroCamere;

import java.util.*;
import java.io.*;
//import doc.RegistroExtra.txt;

public class RegistroExtra {
	private ArrayList<Extra> registroExtra=new ArrayList<Extra>();
	RegistroCamere rc;
	Double costoTot=0.0;

	public RegistroExtra(){
		//Removes all of the elements from this list.
		registroExtra.clear();
	}
	
	public ArrayList<Extra> getRegistroExtra(){
		return this.registroExtra;
	}


	public boolean inserisci(Extra extra){
		for(int i=0;i<registroExtra.size();i++){
			if((registroExtra.get(i)).equals(extra)){
				return false;
			}
		}
		registroExtra.add(extra);
		//setRegistroExtraDellaCamera(registroExtra);
		extra.setIncrId();
		Extra.extraToTInseriti++;
		return true;
	}



	public int cerca(int id){
		for(int i=0;i<registroExtra.size();i++){
			if((registroExtra.get(i)).getId()==id){
				return i;
			}
		}
		return -1;
	}


	public Extra getExtra(int posizione){
		return registroExtra.get(posizione);
	}


	public void stampaExtraByIdCamera(int idCamera){
		System.out.println("Ecco l'elenco degli extra che si riferiscono alla camera "+idCamera+": \n");
		for(int i=0;i<registroExtra.size();i++){
			if(registroExtra.get(i).getCodiceCamera()==idCamera){
				System.out.println(registroExtra.get(i));
			}
		}
	}

	public void costoExtraTotByIdCamera(int idCamera){
		System.out.println("Ecco la somma del costo degli extra che si riferiscono alla camera "+idCamera+": \n");
		for(int i=0;i<registroExtra.size();i++){
			if(registroExtra.get(i).getCodiceCamera()==idCamera){
				costoTot+=registroExtra.get(i).getCostoExtra();
			}
		}
	}




	/*
	 * salva va reso un file xml <GRUPPO id="" nome="" dataArrivo="" anticipo="" richiestaComposizione=""/>
	 * */
	public void salvaInXML(){
		try{
			File file =new File("RegistroExtra.txt");
			FileOutputStream outStream= new FileOutputStream(file);
	        BufferedWriter lineWriter= new BufferedWriter(new OutputStreamWriter(outStream));
	        for(int i=0;i<registroExtra.size();i++){
	            String LineaTesto="";
	            int index=0;
	            	if((rc.cercaIdCamera((registroExtra.get(i)).getCodiceCamera())>0)){
	            		for(int j=0;j<(rc.getRegistroCamere()).size();j++){
	            			LineaTesto="<EXTRA id="+(registroExtra.get(i)).getId()+" tipo="+(registroExtra.get(i)).getTipo()+" idCamera="+(rc.getRegistroCamere().get(i)).getId()+" dataExtra="+
	            			((registroExtra.get(i)).getDataExtra())+" />";
	            			lineWriter.write(LineaTesto);
	            			lineWriter.newLine();
	            			}
	            	}
	            	else{
	            		//System.out.println("Non ci sono extra per questa camera");
	            		break;
	            	}

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
            File fileTesto =new File("registroExtra.txt");
            FileInputStream inStream= new FileInputStream(fileTesto);
            BufferedReader lineReader= new BufferedReader(new InputStreamReader(inStream));
            Extra extra;
            String lineaTesto;
            int indexInit,indexEnd;
            boolean trovato=false;
            //legge il file riga per riga
            while((lineaTesto=lineReader.readLine())!=null){
                    if((indexInit=lineaTesto.indexOf("<EXTRA"))>-1){
                            //estrae i dati del gruppo
                            int id=Integer.parseInt(estrai("id",lineaTesto));
                            String tipo=estrai("tipo",lineaTesto);
                            int idCamera=Integer.parseInt(estrai("idCamera",lineaTesto));
                            float costoExtra =Float.parseFloat(estrai("costo",lineaTesto));
                            String dataExtra=estrai("dataExtra",lineaTesto);
                            extra=new Extra(id,tipo,idCamera,costoExtra,dataExtra);
                            //Appends the specified element to the end of this list.
                            registroExtra.add(extra);
                            trovato=true;
                    }

                    else if((indexInit=lineaTesto.indexOf(" />"))>-1){
                            System.out.println("Appena caricato l'extra giornaliero ");
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
