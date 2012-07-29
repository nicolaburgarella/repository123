package main;


public class LoadExtrasAndRoomsFromXMLTest extends junit.framework.TestCase
{
	public void testLoadExtrasAndRoomsFromXML()
	{
		LoadExtrasAndRoomsFromXML obj=new main.LoadExtrasAndRoomsFromXML();
		String problemMsg="Problem with: LoadExtrasAndRoomsFromXML";
		assertEquals(problemMsg, null, obj.LoadExtrasAndRoomsFromXML());
	}
}
