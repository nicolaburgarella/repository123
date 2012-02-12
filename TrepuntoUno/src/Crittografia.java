/**
 *Programma che crittografa un file di testo in un file di numeri.Ad ogni carattere del file sorgente
 * corrisponde sempre lo stesso numero nel file destinazione. Il numero corrispondente ad un carattere
 * è il valore definito dal codice ascii.Anche gli spazi e la punteggiatura devono essere codificati.
 * Maiuscole e minuscole vanno distinte
 * Il programma viene attivato fornendo il nome del file sorgente e il nome del file destinazione
 * da tastiera;la lunghezza del testo non è nota a priori.
 */
import java.io.*;
public class Crittografia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader promptLine=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Inserisci il nome del file (senza estensione)");
			String nomeFile=promptLine.readLine();
			//codifica il file di testo
			critto(nomeFile);
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		finally{
			System.out.println("Fine programma");
		}
	}

	static void critto(String nomeFile){
		try{
			File fileTesto=new File(nomeFile+".txt");
			FileInputStream inStream=new FileInputStream(fileTesto);
			BufferedReader lineReader = new BufferedReader(new InputStreamReader(inStream));

			File fileCodificato =new File(nomeFile+"_c.txt");
			FileOutputStream outStream= new FileOutputStream(fileCodificato);
			BufferedWriter lineWriter= new BufferedWriter(new OutputStreamWriter(outStream));

			String lineaTesto;
			//legge il file riga per riga
			while((lineaTesto=lineReader.readLine())!=null){
				//legge la riga di testo carattere per carattere
				char carattere;
				int codice;
				for(int i=0;i<lineaTesto.length();i++){
					carattere=lineaTesto.charAt(i);
					//ricava il numero corrispondente al carattere letto
					codice=codifica(carattere);
					//scrive il codice sul file codificato
					lineWriter.write(""+codice+" ");
				}
				//aggiunge una linea vuota
				lineWriter.newLine();
			}
			//chiude il file di testo
			lineReader.close();
			inStream.close();

			//chiude il file codificato
			lineWriter.close();
			outStream.close();

		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}

	static int codifica(char carattere){
		return (int)carattere;
	}
}
