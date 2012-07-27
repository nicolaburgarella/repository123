package group;

import hotel.Hotel;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Scanner;

import date.DataCheckout;
import date.DateToString;

import room.Extra;

public class AddGroupView {
	Scanner kb;
	static String name, checkin,checkout;
	static float deposit;
	static int number,days;
	Hotel h = new Hotel();
	String na;
	int nr;
	//Group g;
	private int c=0;


	public AddGroupView() {

	}

	public Group AddGroupView(Hotel hotel) {
	//	g=new Group();
		h=hotel;
		name = "";
		number=0;
		checkin="";
		checkout="";
		deposit = 0;
		days=0;
		kb = new Scanner(System.in);
		System.out.print("\nInserisci numero id del gruppo: ");
		number = Integer.parseInt((kb.nextLine()));
		nr=number;
		System.out.print("Inserisci il nome del gruppo: ");
		name = kb.nextLine();
		na=name;

		System.out.print("Inserisci l'importo dell'acconto: ");
		deposit = Float.parseFloat(kb.nextLine());
		System.out.println("Inserisci i giorni richiesti di pernottamento");
		days=Integer.parseInt(kb.nextLine());
		DataCheckout d=new DataCheckout();
		Date []dates=new Date[2];
		dates=d.DataCheckout(days);
		DateToString ds=new DateToString();
		checkin=ds.DateToString(dates[0]);
		checkout=ds.DateToString(dates[1]);
		for(int i=0;i<h.getGroupList().getGroupReg().size();i++){
			if(h.getGroupList().getGroupReg().get(i).getNumber()==nr||h.getGroupList().getGroupReg().get(i).getName().equalsIgnoreCase(na)){
				System.out.println("Gruppo gi� esistente,non lo inserisco nuovamente");
				return null;
			}
		}
		
				Group g = new Group(number, name, checkin, checkout, deposit);
				return g;
	}


}
