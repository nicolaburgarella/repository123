package group;


public class AddRequestViewTest extends junit.framework.TestCase
{
	public void testAddRequestView()
	{
		AddRequestView obj=new group.AddRequestView();
		String problemMsg="Problem with: AddRequestView";
		assertEquals(problemMsg, null, obj.AddRequestView());
	}
}
