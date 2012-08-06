package group;

import java.util.Date;
import java.util.Scanner;

import date.DataCheckout;
import date.DateToString;


/**
 * The Class AddRequestView adds a group request from the console application if the group entry is right.
 */
public class AddRequestView {
	
	
	Scanner kb;
	
	
	static int singole,doppie,matrimoniali;
	
	
	static String flag;
	

	public AddRequestView() {

	}

	/**
	 * Adds the request view.
	 *
	 * @return the request, the Request entity if getting the data from console have done right
	 */
	public Request AddRequestView() {


		singole =0;
		doppie=0;
		matrimoniali=0;
		flag="non eseguita";

		kb = new Scanner(System.in);
		System.out.print("\nINSERIMENTO DATI DELLA RICHIESTA\nInserisci il numero di stanze singole richieste: 0 se non richieste");
		try{
		singole = Integer.parseInt((kb.nextLine()));
		}catch(NumberFormatException nfe){
			System.out.println("Il numero di stanze singole da prenotare deve essere intero");
			return null;
		}
		System.out.print("Inserisci il numero di stanze doppie richieste: 0 se non richieste");
		try{
		doppie = Integer.parseInt(kb.nextLine());
		}catch(NumberFormatException nfe){
		System.out.println("Il numero di stanze doppie da prenotare deve essere intero");
		return null;
		}
		System.out.print("Inserisci il numero di stanze matrimoniali richieste: 0 se non richieste");
		try{
		matrimoniali = Integer.parseInt(kb.nextLine());
		}catch(NumberFormatException nfe){
			System.out.println("Il numero di stanze matrimoniali da prenotare deve essere intero");
			return null;
		}
		if(singole==0&&doppie==0&&matrimoniali==0){
			System.out.println("Nell'albergo occorre la prenotazione di almeno una camera");
			return null;
		}
		Request r=new Request(singole, doppie, matrimoniali, flag);
		
		return r;

	}


}
