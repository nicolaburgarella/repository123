/**
 *Programma che legge da un file una serie di coppie [nome, cognome]
 *Il programma chiede poi all'utente di inserire un cognome e stampa a video
 *il nome corrispondente
 */
import java.io.*;
import java.util.*;
public class RicercaFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileInputStream inStream=new FileInputStream("nomi.txt");
			BufferedReader lineReader=new BufferedReader(new InputStreamReader(inStream));

			String riga="";
			String nome="";
			String cognome="";

			Map elenco=new TreeMap();

			while((riga=lineReader.readLine())!=null){
				StringTokenizer tokenizer=new StringTokenizer(riga);
				cognome=tokenizer.nextToken();
				nome=tokenizer.nextToken();
				elenco.put(cognome, nome);
			}
			inStream.close();

			BufferedReader promptLine=new BufferedReader(new InputStreamReader(System.in));
			do{
				System.out.println("Inserisci un cognome (fine per terminare)");
				cognome=promptLine.readLine();
				if(!cognome.equals("fine")){
					nome=(String)elenco.get(cognome);
					System.out.println("nome= "+nome);
				}
			}while(!cognome.equals("fine"));
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}
