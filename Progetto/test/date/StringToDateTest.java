package date;

import java.lang.String;
import java.util.Date;

public class StringToDateTest extends junit.framework.TestCase
{
	public void testStringToDate()
	{
		StringToDate obj=new date.StringToDate();
		String problemMsg="Problem with: StringToDate";
		String s=null;
		assertEquals(problemMsg, null, obj.StringToDate(s));
	}

}
