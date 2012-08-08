package date;

import java.text.MessageFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

// TODO: Auto-generated Javadoc
/**
 * The Class DataCheckout.
 */
public class DataCheckout {

	/**
	 * Instantiates a new data checkout.
	 *
	 */
	public DataCheckout(){
		
	}
	
	/**
	 * Data checkout.
	 *
	 * @param days the days between checkin and checkout
	 * @return the date of checkin and checkout as array date[]
	 */
	public Date[] dataCheckout(int days) {
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
	
	}

}
