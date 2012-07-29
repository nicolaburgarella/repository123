package date;

import java.lang.String;
import java.util.Date;

public class DateToStringTest extends junit.framework.TestCase
{
	public void testDateToString()
	{
		DateToString obj=new date.DateToString();
		String problemMsg="Problem with: DateToString";
		Date d=null;
		assertEquals(problemMsg, null, obj.DateToString(d));
	}
}
