package group;

import hotel.Hotel;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Scanner;

import date.DataCheckout;
import date.DateToString;

import room.Extra;

// TODO: Auto-generated Javadoc
/**
 * The Class AddGroupView.
 */
public class AddGroupView {
	
	/** The kb. */
	Scanner kb;
	
	/** The checkout. */
	static String name, checkin,checkout;
	
	/** The deposit. */
	static float deposit;
	
	/** The days. */
	static int number,days;
	
	/** The h. */
	Hotel h = new Hotel();


	/**
	 * Instantiates a new adds the group view.
	 */
	public AddGroupView() {

	}

	/**
	 * Adds the group view.
	 *
	 * @param hotel the hotel
	 * @return the group
	 */
	public Group AddGroupView(Hotel hotel) {
	//	g=new Group();
		if(hotel==null){
			System.out.println("E' stata caricata un'istanza nulla della classe Hotel");
			return null;
		}
		h=hotel;
		name = "";
		number=0;
		checkin="";
		checkout="";
		deposit = 0;
		days=0;
		kb = new Scanner(System.in);
		System.out.print("\nInserisci numero id del gruppo: ");
		try{
		number = Integer.parseInt((kb.nextLine()));
		for(int j=0;j<h.getGroupList().getGroupReg().size();j++){
			if(h.getGroupList().getGroupReg().get(j).getNumber()==number){
				System.out.println("Id del gruppo gi� inserito,bisogna metterne un altro valido");
				return null;
			}
		}
		}catch(NumberFormatException nfe){
			System.out.println("L'id deve essere intero positivo");
			nfe.getMessage();
			return null;
		}
		System.out.print("Inserisci il nome del gruppo: ");
		name = kb.nextLine();
		for(int j=0;j<h.getGroupList().getGroupReg().size();j++){
			if(h.getGroupList().getGroupReg().get(j).getName().equalsIgnoreCase(name)){
				System.out.println("Nome del gruppo gi� inserito,bisogna metterne un altro valido");
				return null;
			}
		}

		System.out.print("Inserisci l'importo dell'acconto: ");
		try{
		deposit = Float.parseFloat(kb.nextLine());
		}catch(NumberFormatException nfe){
			System.out.println("L'acconto deve avere valore float");
			nfe.getMessage();
			return null;
		}
		System.out.println("Inserisci i giorni richiesti di pernottamento");
		
		try{
		days=Integer.parseInt(kb.nextLine());
		if(days==0){
			System.out.println("I giorni di pernottamento non possono essere 0,ma almeno 1");
			return null;
		}
		}catch(NumberFormatException nfe){
			System.out.println("I giorni di pernottamento devono essere interi positivi");
		}
		
		DataCheckout d=new DataCheckout();
		Date []dates=new Date[2];
		
		if(d.DataCheckout(days)==null){
			System.out.println("Days deve assumere un valore positivo maggiore di zero");
			return null;
		}

		dates=d.DataCheckout(days);
		
		DateToString ds=new DateToString();
		
		if(ds.DateToString(dates[0])==null||ds.DateToString(dates[1])==null){
			System.out.println("Checkin e checkout non possono assumere valori nulli");
			return null;
		}
		checkin=ds.DateToString(dates[0]);
		checkout=ds.DateToString(dates[1]);
		for(int i=0;i<h.getGroupList().getGroupReg().size();i++){
			if(h.getGroupList().getGroupReg().get(i).getNumber()==number||h.getGroupList().getGroupReg().get(i).getName().equalsIgnoreCase(name)){
				System.out.println("Gruppo gi� esistente,non lo inserisco nuovamente");
				return null;
			}
		}
		
				Group g = new Group(number, name, checkin, checkout, deposit);
				return g;
	}


}
