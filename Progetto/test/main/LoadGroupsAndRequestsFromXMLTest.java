package main;


// TODO: Auto-generated Javadoc
/**
 * The Class LoadGroupsAndRequestsFromXMLTest.
 */
public class LoadGroupsAndRequestsFromXMLTest extends junit.framework.TestCase
{
	
	/**
	 * Test load groups and requests from xml.
	 */
	public void testLoadGroupsAndRequestsFromXML()
	{
		LoadGroupsAndRequestsFromXML obj=new main.LoadGroupsAndRequestsFromXML();
		String problemMsg="Problem with: LoadGroupsAndRequestsFromXML";
		assertEquals(problemMsg, null, obj.LoadGroupsAndRequestsFromXML());
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(LoadGroupsAndRequestsFromXMLTest.class));
	}
}
