package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import reservation.JDOMWriter;
import reservation.ReservationView;
import room.RoomView;

import date.DataCheckout;
import group.GroupView;
import hotel.Hotel;

// TODO: Auto-generated Javadoc
/**
 * The Class Main to be launched to start the console mode application.
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		//Carico tutte le istanze racchiuse in hotel nel main
		Hotel h=new Hotel();
		LoadFromXml l=new LoadFromXml();
		h=l.LoadFromXml();
		GregorianCalendar gc = new GregorianCalendar();
		DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		String oggi=df.format(gc.getTime());
		System.out.println(oggi);
		System.out.println("Completo nel main!\n"+h);
		boolean sbagliato=false;
		String sceltaOpzione="";
		int scelta = 0;
		boolean continua=true;
		
		/*do{*/while(continua){
			do{
				
				System.out.print("Data odierna:\t "+gc.get(Calendar.DATE)+" / "+(gc.get(Calendar.MONTH)+1)+" / "+gc.get(Calendar.YEAR)+" ");
				System.out.println("Ora esatta:\t "+gc.get(Calendar.HOUR)+":"+gc.get(Calendar.MINUTE)+"\n\n");
				
				System.out.println("============GESTIONE ALBERGO============");
				System.out.println("I dati sono già stati caricati,scegli cosa fare dalla console: ");
				System.out.println("1 - INSERIMENTO,CANCELLAZIONE E GESTIONE DELLE STANZE E DEGLI EXTRA");
				System.out.println("2 - INSERIMENTO,CANCELLAZIONE E GESTIONE DEI GRUPPI E DELLE LORO RICHIESTE");
				System.out.println("3 - INSERIMENTO,CANCELLAZIONE E GESTIONE DELLE PRENOTAZIONI(CHECKIN E CHECKOUT)");
				System.out.println("0 - ESCI\n\n");
				System.out.println("Inserire la scelta digitando l'apposito numero: ");
				try{
					BufferedReader promptLine=new BufferedReader(new InputStreamReader(System.in));
					
					sceltaOpzione=promptLine.readLine();

					if(!(sceltaOpzione.equals("0")||(sceltaOpzione.equals("1"))||(sceltaOpzione.equals("2"))||(sceltaOpzione.equals("3")))){
						System.out.println("E' stata scelta un'opzione non valida riprova");
						//continua=false;
						sbagliato=true;
					}
					
					try{
						scelta=Integer.parseInt(sceltaOpzione);
						}catch(NumberFormatException nfe){
							System.out.print("La scelta deve essere un numero intero");
							nfe.getMessage();
							sbagliato=true;
						}
						
				}
				catch(IOException ioe){
					ioe.printStackTrace();
				}
			}while(sbagliato);
			
			
			switch(scelta){
			
			case 1:
			{
				System.out.println("GESTIONE STANZE ED EXTRA: \n");
				RoomView rv=new RoomView(h);
				break;
			}

			case 2:
			{	
				System.out.println("GESTIONE GRUPPI E RICHIESTE: \n");
				GroupView gv=new GroupView(h);
				break;
			}

			case 3:
			{
				System.out.println("GESTIONE PRENOTAZIONI: \n");
				ReservationView rv=new ReservationView(h);
				break;
			}

			case 0:
			{
				
					System.out.println("Torno al menu iniziale");
					sbagliato=true;
				break;
			}
		}
	}/*while(!continua);*/

	}

}
