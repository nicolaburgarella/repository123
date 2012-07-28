package room;


public class ExtractRoomByNumberTest extends junit.framework.TestCase
{
	public void testExtractRoom()
	{
		ExtractRoomByNumber obj=new room.ExtractRoomByNumber();
		String problemMsg="Problem with: ExtractRoom";
		int number=0;
		assertEquals(problemMsg, null, obj.ExtractRoom(number));
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(ExtractRoomByNumberTest.class));
	}
}
