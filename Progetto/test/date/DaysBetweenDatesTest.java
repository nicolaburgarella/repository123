package date;

import java.lang.String;
import java.util.Date;

public class DaysBetweenDatesTest extends junit.framework.TestCase
{
	public void testDaysBetweenDates()
	{
		DaysBetweenDates obj=new date.DaysBetweenDates();
		String problemMsg="Problem with: DaysBetweenDates";
		Date uno=null;
		Date due=null;
		assertEquals(problemMsg, 0L, obj.DaysBetweenDates(uno, due));
	}
	public void testDaysInHotel()
	{
		DaysBetweenDates obj=new date.DaysBetweenDates();
		String problemMsg="Problem with: daysInHotel";
		String checkin=null;
		String checkout=null;
		assertEquals(problemMsg, 0L, obj.daysInHotel(checkin, checkout));
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(DaysBetweenDatesTest.class));
	}
}
