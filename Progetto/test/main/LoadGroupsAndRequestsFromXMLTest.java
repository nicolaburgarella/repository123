package main;


public class LoadGroupsAndRequestsFromXMLTest extends junit.framework.TestCase
{
	public void testLoadGroupsAndRequestsFromXML()
	{
		LoadGroupsAndRequestsFromXML obj=new main.LoadGroupsAndRequestsFromXML();
		String problemMsg="Problem with: LoadGroupsAndRequestsFromXML";
		assertEquals(problemMsg, null, obj.LoadGroupsAndRequestsFromXML());
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(LoadGroupsAndRequestsFromXMLTest.class));
	}
}
