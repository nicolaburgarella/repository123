package date;

import java.lang.String;
import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class DateToStringTest.
 */
public class DateToStringTest extends junit.framework.TestCase
{
	
	/**
	 * Test date to string.
	 */
	public void testDateToString()
	{
		DateToString obj=new date.DateToString();
		String problemMsg="Problem with: DateToString";
		Date d=null;
		assertEquals(problemMsg, null, obj.DateToString(d));
	}
}
