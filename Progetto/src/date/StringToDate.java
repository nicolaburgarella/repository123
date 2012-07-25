package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class StringToDate {
	
	public StringToDate(){
		
	}
    public Date StringToDate(String s) {
    	//s="";
    	//s="20/12/2005";
    	
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
 
        try {
            date = df.parse(s);
            String d = df.format(date);
            System.out.println("Data = " + df.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
		return date;
    }
}