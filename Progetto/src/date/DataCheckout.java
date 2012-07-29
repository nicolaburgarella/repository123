package date;

import java.text.MessageFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DataCheckout {

	/**
	 * @param args
	 */
	public DataCheckout(){
		
	}
	
	public Date[] DataCheckout(int days) {
		 Date today = new Date();
	        Calendar calendar = Calendar.getInstance();
	        calendar.add(Calendar.DATE, days);
	 
	        Date checkout = calendar.getTime();
	        Date[] dates = new Date[] {today, checkout};
	 
	        //
	        // We want the message to be is Locale.US
	        //
	        Locale.setDefault(Locale.ITALIAN);
	 
	        //
	        // Format a date, the time value is included
	        //
	        if(days==0){
	        	System.out.println("Il cliente deve alloggiare almeno una notte");
	        	return null;
	        }
	        
	        String message = MessageFormat.format("Today is {0} and the checkout is {1}", dates);
	        System.out.println(message);
			return dates;
	 
	        /*//
	        // Format a date and display only the date portion
	        //
	        message = MessageFormat.format("Today is {0,date} and the checkout is {1,date}", dates);
	        System.out.println(message);
	 
	        //
	        // Format a date using a short format (eg. dd/MM/yyyy)
	        //
	        message = MessageFormat.format("Today is {0,date,short} and the checkout is {1,date,short}", dates);
	        System.out.println(message);
	 */
	}

}
