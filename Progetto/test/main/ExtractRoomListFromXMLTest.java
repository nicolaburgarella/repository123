package main;


public class ExtractRoomListFromXMLTest extends junit.framework.TestCase
{
	public void testExtractRoomList()
	{
		ExtractRoomListFromXML obj=new main.ExtractRoomListFromXML();
		String problemMsg="Problem with: ExtractRoomList";
		assertEquals(problemMsg, null, obj.ExtractRoomList());
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(ExtractRoomListFromXMLTest.class));
	}
}
