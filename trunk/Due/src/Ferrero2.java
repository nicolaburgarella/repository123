/**
 *Si modifichi il programma Ferrero in modo che non sia rilevante
 * l'ordine delle etichette in ogni confezione
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ferrero2 {
	static int stato=0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader promptLine=new BufferedReader(new InputStreamReader(System.in));

			String etichetta="";
			boolean continua=true;
			while(continua){
				System.out.println("STATO "+stato+"Inserisci un'etichetta (END per terminare)");
				etichetta=promptLine.readLine();
				if(etichetta.equals("END")){
					break;
				}
				else if(!(etichetta.equals("PK")||etichetta.equals("FR")||etichetta.equals("MC"))){
					System.out.println("Etichetta non valida");
				}
				else{
					inserisci(etichetta);
				}
			}
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
			finally{
				System.out.println("Fine programma.");
			}
	}

	static void inserisci(String label){
		switch(stato){
		case'0':
			if(label.equals("PK")){
				stato=1;
			}
			else if(label.equals("FR")){
				stato=3;
			}
			else if(label.equals("MC")){
				stato=4;
			}
			System.out.println(label+" inserita");
			break;
		case'1':
			if(label.equals("FR")||label.equals("MC")){
				System.out.println("Pacchetto [PK,"+label+"]");
				stato=0;
			}
			else if(label.equals("PK")){
				stato=2;
				System.out.println(label+" inserita");
			}
			break;
		case'2':
			if(label.equals("PK")||label.equals("FR")){
				System.out.println(label+" scartato");
			}
			else if(label.equals("MC")){
				System.out.println("Pacchetto [PK, PK, "+label+"]");
				stato=0;
			}
			break;
		case'3':
			if(label.equals("FR")||label.equals("MC")){
				System.out.println(label+" scartato");
			}
			else if(label.equals("PK")){
				System.out.println("Pacchetto [FR, PK]");
				stato=0;
			}
			break;
		case'4':
			if(label.equals("FR")||label.equals("MC")){
				System.out.println(label+" scartato");
			}
			else if(label.equals("PK")){
				System.out.println("Pacchetto [MC, PK]");
				stato=0;
			}
			break;
		}

	}

}

