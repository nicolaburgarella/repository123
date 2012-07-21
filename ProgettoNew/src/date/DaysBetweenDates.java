package date;

import java.util.Calendar;
import java.util.Date;

public class DaysBetweenDates {

	public DaysBetweenDates() {

	}

	public long DaysBetweenDates(Date uno, Date due) {

		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.setTime(uno);
		c2.setTime(due);

		long giorni = (c2.getTime().getTime() - c1.getTime().getTime())
				/ (24 * 3600 * 1000);

		return giorni;
	}
	
	
	public long daysInHotel(String checkin, String checkout) {
		// TODO Auto-generated method stub
		System.out.println("Date in stringa in ingresso:checkin "+checkin+"e checkout "+checkout);
		//String checkin="02/06/2012";
		//String checkout="17/07/2012";
		StringToDate d =new StringToDate();
		Date d1=d.StringToDate(checkin);
		Date d2=d.StringToDate(checkout);
		DaysBetweenDates b=new DaysBetweenDates();
		long days=b.DaysBetweenDates(d1, d2);
		System.out.println("Tra le due date ci sono "+days+" giorni");
		return days;

	}

}