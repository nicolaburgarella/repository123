package room;

import java.util.Scanner;

	public class AddExtraView {
	Scanner kb;
	static String type,date;
	static float cost;

	public AddExtraView(){
		
	}

	public Extra AddExtraView(){
	type = "";
	cost=0;
	date = "";

	kb = new Scanner (System.in);
	System.out.print ("\nInserisci la data dell'extra: ");
	date = (kb.nextLine());
	System.out.print ("Inserisci la tipologia di extra: ");
	type = kb.nextLine();
	System.out.print ("Inserisci il costo dell'extra: ");
	cost = Float.parseFloat(kb.nextLine());
	Extra e = new Extra(cost, date, type);
	return e;
	
	}

}

