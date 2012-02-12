/**
 * Programma che calcola valore minimo,somma,media di una serie di 10 numeri
 *  inseriti da tastiera
 */
import java.io.*;
public class Statistica {
	static int vettore[]=new int[10];

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader promptLine=new BufferedReader(new InputStreamReader(System.in));

			String valore="";
			int numero=0;

			for(int i=0;i<10;i++){
				System.out.println("\nP"+(i+1)+": Inserisci un numero ");
				valore=promptLine.readLine();
				numero=Integer.parseInt(valore);
				vettore[i]=numero;
			}
			boolean continua=true;
			while(continua){
				System.out.println("Scegli una funzione "+"[0:esci][1:somma][2:media][3:minimo]");
				valore=promptLine.readLine();
				numero=Integer.parseInt(valore);
				switch(numero){
				case'0':
					continua=false;
					break;
				case'1':
					System.out.println("Somma="+somma());
					break;
				case'2':
					System.out.println("Media="+media());
					break;
				case'3':
					int risultato[]=minimo();
					System.out.println("Minimo=vettore["+risultato[0]+"]="+risultato[1]);
					break;
				default:
					System.out.println("Opzione non valida");
				}
			}
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		catch(NumberFormatException nfe){
			System.out.println("Errore di formato numerico.");
		}
		finally{
			System.out.println("Fine programma.");
		}
	}

	static int somma(){
		int somma=0;
		for(int i=0;i<10;i++){
			somma+=vettore[i];
		}
		return somma;
	}

	static double media(){
		double media=(double)somma()/10.0;
		return media;
	}

	static int[] minimo(){
		int minimo=vettore[0];
		int indice=0;
		for(int i=1;i<10;i++){
			if(vettore[i]<minimo){
				minimo=vettore[i];
				indice=i;
			}
		}
		int risultato[]=new int[2];
		risultato[0]=indice;
		risultato[1]=minimo;
		return risultato;
	}

}
