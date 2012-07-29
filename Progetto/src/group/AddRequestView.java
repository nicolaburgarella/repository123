package group;

import java.util.Date;
import java.util.Scanner;

import date.DataCheckout;
import date.DateToString;


public class AddRequestView {
	Scanner kb;
	static int singole,doppie,matrimoniali;
	static String flag;
	

	public AddRequestView() {

	}

	public Request AddRequestView() {


		singole =0;
		doppie=0;
		matrimoniali=0;
		flag="non eseguita";

		kb = new Scanner(System.in);
		System.out.print("\nINSERIMENTO DATI DELLA RICHIESTA\nInserisci il numero di stanze singole richieste: 0 se non richieste");
		singole = Integer.parseInt((kb.nextLine()));
		System.out.print("Inserisci il numero di stanze doppie richieste: 0 se non richieste");
		doppie = Integer.parseInt(kb.nextLine());
		System.out.print("Inserisci il numero di stanze matrimoniali richieste: 0 se non richieste");
		matrimoniali = Integer.parseInt(kb.nextLine());
		if(singole==0&&doppie==0&&matrimoniali==0){
			System.out.println("Nell'albergo occorre la prenotazione di almeno una camera");
			return null;
		}
		Request r=new Request(singole, doppie, matrimoniali, flag);
		
		return r;

	}


}
