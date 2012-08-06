package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
 
// TODO: Auto-generated Javadoc
/**
 * The Class DateToString.
 */
public class DateToString
{
	
	/**
	 * Instantiates a new date to string.
	 */
	public DateToString(){
		
	}

    /**
     * Date to string.
     *
     * @param d the date do be converted as string if correct
     * @return the string of the date
     */
    public String DateToString(Date d)
    {
        // Create an instance of SimpleDateFormat used for formatting
        // the string representation of date (month/day/year)
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
         
        if(d==null){
        	System.out.println("la data non può avere valore nullo");
        	return null;
        }
        else{
        // Get the date today using Calendar object.
        //   Date today = Calendar.getInstance().getTime();       
        // Using DateFormat format method we can create a string
        // representation of a date with the defined format.
        String reportDate = df.format(d);
         
        // Print what date is today!
        //System.out.println("Report Date: " + reportDate);
		return reportDate;
        }
    }
}