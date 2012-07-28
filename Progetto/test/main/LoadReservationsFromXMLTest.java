package main;


public class LoadReservationsFromXMLTest extends junit.framework.TestCase
{
	public void testLoadReservationsFromXML()
	{
		LoadReservationsFromXML obj=new main.LoadReservationsFromXML();
		String problemMsg="Problem with: LoadReservationsFromXML";
		assertEquals(problemMsg, null, obj.LoadReservationsFromXML());
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(LoadReservationsFromXMLTest.class));
	}
}
