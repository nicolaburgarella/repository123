/**
 *Si scriva un programma in java che legge dal file "filePari.txt" una serie di numeri pari
 *e dal file "fileDispari.txt" una serie di numeri dispari.
 *Il programma scrive sul file "fileNumeri.txt" l'unione delle due serie di numeri
 *ordinata in modo crescente
 */
import java.io.*;
import java.util.*;
public class UnisciFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileInputStream inStreamPari=new FileInputStream("filePari.txt");
			BufferedReader lineReaderPari=new BufferedReader(new InputStreamReader(inStreamPari));
			FileInputStream inStreamDispari=new FileInputStream("fileDispari.txt");
			BufferedReader lineReaderDispari=new BufferedReader(new InputStreamReader(inStreamDispari));

			String valore="";
			Integer numero;

			TreeSet vettoreNumeri=new TreeSet();

			while((valore=lineReaderPari.readLine())!=null){
				numero=Integer.valueOf(valore);
				System.out.println(""+numero);
				vettoreNumeri.add(numero);
			}

			while((valore=lineReaderDispari.readLine())!=null){
				numero=Integer.valueOf(valore);
				System.out.println(""+numero);
				vettoreNumeri.add(numero);
			}

			inStreamPari.close();
			inStreamDispari.close();

			BufferedWriter lineWriter=new BufferedWriter(new FileWriter("fileNumeri.txt"));
			Iterator iteratore =vettoreNumeri.iterator();
			while(iteratore.hasNext()){
				numero=(Integer)iteratore.next();
				lineWriter.write(""+numero.intValue());
				lineWriter.newLine();
			}
			lineWriter.close();

		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}
