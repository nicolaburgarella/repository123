/**
 *Programma che legge da file una serie di numeri
 * e scrive su un altro file la stessa serie di numeri
 * ma ordinati dal minore al maggiore
 */
import java.util.*;
import java.io.*;

public class OrdinaFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileInputStream inStream =new FileInputStream("numeri.txt");
			BufferedReader lineReader=new BufferedReader(new InputStreamReader(inStream));

			String valore="";
			Integer numero;
			List vettoreNumeri=new ArrayList();

			while((valore=lineReader.readLine())!=null){
				numero=Integer.valueOf(valore);
				System.out.println(numero);
				vettoreNumeri.add(numero);
			}
			inStream.close();
			Set vettoreOrdinato=new TreeSet(vettoreNumeri);
			System.out.println(vettoreOrdinato);
			BufferedWriter lineWriter=new BufferedWriter(new FileWriter("numeri_ord.txt"));

			Iterator iteratore=vettoreOrdinato.iterator();
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
