package group;


public class AddRequestViewTest extends junit.framework.TestCase
{
	public void testAddRequestView()
	{
		AddRequestView obj=new group.AddRequestView();
		String problemMsg="Problem with: AddRequestView";
		assertEquals(problemMsg, null, obj.AddRequestView());
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(AddRequestViewTest.class));
	}
}
