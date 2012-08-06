package room;

import java.util.Scanner;

import date.StringToDate;

	// TODO: Auto-generated Javadoc
/**
	 * The view Class AddExtraView.
	 */
	public class AddExtraView {
	
	/** The scanner component. */
	Scanner kb;
	
	/** The type,date variables. */
	static String type,date;
	
	/** The cost. */
	static float cost;

	/**
	 * Instantiates a new adds the extra view.
	 */
	public AddExtraView(){
		
	}

	/**
	 * Adds the extra.
	 *
	 * @return the extra instance
	 */
	public Extra AddExtraView(){
	type = "";
	cost=0;
	date = "";

	kb = new Scanner (System.in);
	System.out.print ("\nInserisci la data dell'extra: ");
	date = (kb.nextLine());
	StringToDate sd=new StringToDate();
	if(!sd.StringToDateCheck(date)){
		System.out.println("Hai inserito una data errata,va scritta dd/MM/yyyy");
		return null;
	}
	System.out.print ("Inserisci la tipologia di extra: ");
	type = kb.nextLine();
	System.out.print ("Inserisci il costo dell'extra: ");
	
	try{
	cost = Float.parseFloat(kb.nextLine());
	}catch(NumberFormatException nfe){
		System.out.println("Il valore del costo deve assumere un valore float");
		nfe.getMessage();
		return null;
	}
	
	if(cost==0||type==""||date==""){
		System.out.println("Hai inserito dei valori nulli");
		return null;
	}
	
	Extra e = new Extra(cost, date, type);
	return e;
	
	}

}

