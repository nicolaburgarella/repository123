package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
// TODO: Auto-generated Javadoc
/**
 * The Class StringToDate.
 */
public class StringToDate {
	
	/**
	 * Instantiates a new string to date.
	 */
	public StringToDate(){
		
	}
    
    /**
     * String to date.
     *
     * @param s the string to be converted into date if correct
     * @return the date converted string into date
     */
    public Date StringToDate(String s) {
    	//s="";
    	//s="20/12/2005";
    	
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        
        if(s==null){
        	System.out.println("E' stata inserita una stringa nulla da convertire in data");
        	return null;
        }
 
        try {
            date = df.parse(s);
            String d = df.format(date);
            System.out.println("Data = " + df.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
		return date;
    }
    
    /**
     * String to date check.
     *
     * @param s the string to be converted into date
     * @return true, if successful
     */
    public boolean StringToDateCheck(String s) {
    	//s="";
    	//s="20/12/2005";
    	
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        
        if(s==null){
        	System.out.println("E' stata inserita una stringa nulla da convertire in data");
        	return false;
        }
 
        try {
            date = df.parse(s);
            String d = df.format(date);
            //System.out.println("Data = " + df.format(date));
        } catch (ParseException e) {
            System.out.println("La stringa inserita non è parsabile correttamente");
            return false;
        }
		return true;
    }
    
}