package room;


public class ExtractExtrasInstByRoomTest extends junit.framework.TestCase
{
	public void testExtractExtrasInstByRoom()
	{
		ExtractExtrasInstByRoom obj=new room.ExtractExtrasInstByRoom();
		String problemMsg="Problem with: ExtractExtrasInstByRoom";
		int number=0;
		assertEquals(problemMsg, null, obj.ExtractExtrasInstByRoom(number));
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(ExtractExtrasInstByRoomTest.class));
	}
}
