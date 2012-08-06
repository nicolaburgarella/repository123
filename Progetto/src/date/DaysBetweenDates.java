package date;

import java.util.Calendar;
import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class DaysBetweenDates.
 */
public class DaysBetweenDates {

	/**
	 * Instantiates a new days between dates.
	 */
	public DaysBetweenDates() {

	}

	/**
	 * Days between dates.
	 *
	 * @param uno the checkin date
	 * @param due the checkout date
	 * @return the days between the two dates
	 */
	public long DaysBetweenDates(Date uno, Date due) {

		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		 if(uno==null&&due==null){
	        	System.out.println("Non possono esserci due date nulle");
	        	return 5000;
	        }
		c1.setTime(uno);
		c2.setTime(due);

		long giorni = (c2.getTime().getTime() - c1.getTime().getTime())
				/ (24 * 3600 * 1000);

		return giorni;
	}
	
	
	/**
	 * Days in hotel.
	 *
	 * @param checkin the checkin date
	 * @param checkout the checkout date
	 * @return the number of days between the two dates
	 */
	public long daysInHotel(String checkin, String checkout) {
		// TODO Auto-generated method stub
		System.out.println("�checkin "+checkin+" e checkout "+checkout);
		//String checkin="02/06/2012";
		//String checkout="17/07/2012";
		 if(checkin==null&&checkout==null){
	        	System.out.println("Sono state inserite due date aventi valore nullo");
	        	return 5000;
	        }
		StringToDate d =new StringToDate();
		if(!(d.StringToDateCheck(checkin)||d.StringToDateCheck(checkout))){
			System.out.println("le date non sono parsabili, devono essere scritte come dd/MM/yyyy");
			return 6000;
		}
		Date d1=d.StringToDate(checkin);
		Date d2=d.StringToDate(checkout);
		DaysBetweenDates b=new DaysBetweenDates();
		 if(b.DaysBetweenDates(d1, d2)==5000){
	        	System.out.println("Sono state inserite due date aventi valore nullo");
	        	return 5000;
	        }
		long days=b.DaysBetweenDates(d1, d2);
		System.out.println("Tra le due date ci sono "+days+" giorni");
		return days;

	}

}
