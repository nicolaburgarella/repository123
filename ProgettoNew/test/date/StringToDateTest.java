package date;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

public class StringToDateTest {

	@Test
	public void testStringToDate(String s) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
		StringToDate sd =new StringToDate();
		Date d =sd.StringToDate("31/12/2010");	
		assertEquals("31/12/2010", df.format(date));
		}

	@Test
	public void testStringToDateString() {
		fail("Not yet implemented");
	}

}
