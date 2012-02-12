/**
 *Programma che legge da un file una serie di numeri
 *e scrive su un altro file la stessa serie di numeri ma in ordine inverso
 */
import java.util.*;
import java.io.*;

public class InversioneFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileInputStream inStream=new FileInputStream("numeri.txt");
			BufferedReader lineReader= new BufferedReader(new InputStreamReader(inStream));

			String valore="";
			Integer numero;
			List vettoreNumeri=new ArrayList();

			while((valore=lineReader.readLine())!=null){
				numero=Integer.valueOf(valore);
				System.out.println(numero);
				vettoreNumeri.add(numero);
			}
			inStream.close();

			BufferedWriter lineWriter=new BufferedWriter(new FileWriter("numeri_inv.txt"));

			for(int i=vettoreNumeri.size()-1;i>=0;i--){
				numero=(Integer)vettoreNumeri.get(i);
				lineWriter.write(""+numero.intValue());
				lineWriter.newLine();
			}
			lineWriter.close();

		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}
