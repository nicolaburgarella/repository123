/**
 *Il programma chiede all'utente di inserire da tastiera
 * il numero di matricola di uno studente e stampa a video le seguenti informazioni:
 * Nome Cognome Matricola Elenco esami superati
 * Il registro degli esami è memorizzato su file
 */
import java.io.*;
public class VotiStudenti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader promptLine=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Inserisci la matricola di uno studente");
			String matricola=promptLine.readLine();
			//ricerca i dati dello studente e li stampa a video
			stampaEsami(matricola);
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		finally{
			System.out.println("Fine programma!");
		}
	}

	static void stampaEsami(String mat){
		try{
			File fileTesto=new File("studenti.txt");
			FileInputStream inStream=new FileInputStream(fileTesto);
			BufferedReader lineReader =new BufferedReader(new InputStreamReader(inStream));

			String lineaTesto;
			int indexInit,indexEnd;
			boolean trovato=false;
			//legge il file riga per riga
			while((lineaTesto=lineReader.readLine())!=null){
				if((indexInit=lineaTesto.indexOf("<STUDENTE"))>-1){
					//estrae i dati dello studente
					String nome=estrai("Nome",lineaTesto);
					String cognome=estrai("Cognome",lineaTesto);
					String matricola=estrai("Matricola",lineaTesto);

					if(matricola.equals(mat)){
						System.out.println("Studente "+cognome+" "+nome+" mat:"+matricola);
						trovato=true;
					}
				}
				else if((indexInit=lineaTesto.indexOf("ESAME"))>-1 &&trovato){
					String corso=estrai("Corso",lineaTesto);
					String voto=estrai("Voto",lineaTesto);
					String data=estrai("Data",lineaTesto);
					System.out.println("   "+corso+" ("+voto+"), "+data);
				}
				else if((indexInit=lineaTesto.indexOf("</STUDENTE>"))>-1){
					trovato=false;
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
