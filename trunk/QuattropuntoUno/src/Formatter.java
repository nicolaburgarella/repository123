/**
 *Programma che carica un file di testo in memoria e lo formatta
 *in modo che tutte le righe del testo abbiano la stessa lunghezza
 *e siano incolonnate sia a destra sia a sinistra.
 *Il testo formattato viene mostrato a video e memorizzato su file.
 *Dati:file di testo di lungheza non predefinita
 *Funzioni: incolonnamento a dx e a sx stampa a video memorizzazione su file
 */
import java.io.*;
import java.util.*;

public class Formatter {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String fileName=args[0];
		String fileName="amleto";
		try{
			FileInputStream inStream=new FileInputStream(fileName+".txt");
			BufferedReader lineReader =new BufferedReader(new InputStreamReader(inStream));

			String riga="";
			StringBuffer buffer=new StringBuffer();

			while((riga=lineReader.readLine())!=null){
				buffer.append(riga);
			}

			inStream.close();

			Documento documento=new Documento(buffer.toString());
			documento.giustifica(40);
			System.out.println(documento);

			BufferedWriter lineWriter =new BufferedWriter(new FileWriter(fileName+"_out.txt"));
			lineWriter.write(documento.toString());
			lineWriter.close();
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}
