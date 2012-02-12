/**
 *Programma che calcola le occorrenze di ogni singolo caratere
 * all'interno di un file di testo
 */
import java.io.*;
public class Occorrenze {
	public static int caratteri[]=new int[255];
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader promptLine=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Inserisci il nome del file(senza estensione)");
			String nomeFile=promptLine.readLine();
			//codifica il file di testo
			occorrenze(nomeFile);
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		finally{
			System.out.println("Fine programma.");
		}
	}


	static void occorrenze(String nomeFile){
		for(int i=0;i<255;i++){
			caratteri[i]=0;
		}
		try{
			File fileTesto=new File(nomeFile+".txt");
			FileInputStream inStream=new FileInputStream(fileTesto);
			BufferedReader lineReader=new BufferedReader(new InputStreamReader(inStream));
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
					caratteri[codice]++;
				}
			}
			//chiude il file di testo
			lineReader.close();
			inStream.close();
			//stampa i risultati
			for(int i=0;i<255;i++){
				if(caratteri[i]>0){
					System.out.println(((char)i)+" = "+caratteri[i]);
				}
			}
		}catch(IOException ioe){
			ioe.printStackTrace();
		}

	}

	static int codifica(char carattere){
		return (int)carattere;
	}


}
