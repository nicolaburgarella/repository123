import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class VotiStudenti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//carica in memoria il registro da file
		Registro registroEsami=new Registro("studenti.txt");
		try{
			BufferedReader promptLine=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Inserisci la matricola di uno studente");
			String matricola=promptLine.readLine();
			//ricerca i dati dello studente e li stampa a video
			registroEsami.stampaEsami(matricola);
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		finally{
			System.out.println("Fine programma!");
		}
	}



}
