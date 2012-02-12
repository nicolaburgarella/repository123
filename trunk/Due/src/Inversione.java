/**
 * Programma che stampa in ordine inverso una sequenza di 10 numeri
 *  inseriti da tastiera
 */

import java.io.*;
public class Inversione {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader promptLine= new BufferedReader(new InputStreamReader(System.in) );

			String valore="";
			int numero=0;
			int vettore[]=new int[10];

			for(int i=0;i<10;i++){
				System.out.println("\nP"+(i+1)+": Inserisci un numero ");
				valore =promptLine.readLine();
				numero=Integer.parseInt(valore);
				vettore[i]=numero;
			}
			for(int i=9;i>=0;i--){
				System.out.println("vettore["+(i+1)+"]="+vettore[i]);
			}
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		catch(NumberFormatException nfe){
			System.out.println("Errore di formato numerico");
		}
		finally{
			System.out.println("Fine programma!");
		}

	}

}
