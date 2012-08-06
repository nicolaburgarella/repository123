package date;

import java.lang.String;
import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class StringToDateTest.
 */
public class StringToDateTest extends junit.framework.TestCase
{
	
	/**
	 * Test string to date.
	 */
	public void testStringToDate()
	{
		StringToDate obj=new date.StringToDate();
		String problemMsg="Problem with: StringToDate";
		String s=null;
		assertEquals(problemMsg, null, obj.StringToDate(s));
	}

}
