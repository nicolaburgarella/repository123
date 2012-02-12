/**
 * Programma che stampa a video una serie di numeri inseriti da tastiera
 * fino all'inserimento dello 0;
 */
import java.io.*;
import java.util.*;

public class Inserimento {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader promptLine=new BufferedReader(new InputStreamReader(System.in));
			String valore="";
			int numero=0;

			do{
				System.out.println("Inserisci un numero (0=fine)");
				valore=promptLine.readLine();
				numero=Integer.parseInt(valore);
				if(numero!=0){
					System.out.println("Numero inserito="+numero);
				}
			}while(numero!=0);

		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		catch(NumberFormatException nfe){
			System.out.println("Errore di formato numerico.");
		}
		finally{
			System.out.println("Fine programma!");
		}
	}

}
