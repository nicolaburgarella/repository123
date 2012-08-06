package date;

import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class prova.
 */
public class prova {

	/**
	 * Instantiates a new prova.
	 *
	 * @param checkin the checkin
	 * @param checkout the checkout
	 */
	public prova(String checkin, String checkout) {
		// TODO Auto-generated method stub
		//String checkin="02/06/2012";
		//String checkout="17/07/2012";
		StringToDate d =new StringToDate();
		Date d1=d.StringToDate(checkin);
		Date d2=d.StringToDate(checkout);
		DaysBetweenDates b=new DaysBetweenDates();
		long days=b.DaysBetweenDates(d1, d2);
		System.out.println("Tra le due date ci sono "+days+" giorni");

	}

}
