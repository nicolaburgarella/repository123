package room;


// TODO: Auto-generated Javadoc
/**
 * The Class ExtractRoomByNumberTest.
 */
public class ExtractRoomByNumberTest extends junit.framework.TestCase
{
	
	/**
	 * Test extract room.
	 */
	public void testExtractRoom()
	{
		ExtractRoomByNumber obj=new room.ExtractRoomByNumber();
		String problemMsg="Problem with: ExtractRoom";
		int number=0;
		assertEquals(problemMsg, null, obj.ExtractRoom(number));
	}
}
