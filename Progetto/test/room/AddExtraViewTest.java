package room;


public class AddExtraViewTest extends junit.framework.TestCase
{
	public void testAddExtraView()
	{
		AddExtraView obj=new room.AddExtraView();
		String problemMsg="Problem with: AddExtraView";
		assertEquals(problemMsg, null, obj.AddExtraView());
	}
}
