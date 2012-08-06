package group;

import java.lang.String;

// TODO: Auto-generated Javadoc
/**
 * The Class ExtractGroupByNameTest.
 */
public class ExtractGroupByNameTest extends junit.framework.TestCase
{
	
	/**
	 * Test extract group by name.
	 */
	public void testExtractGroupByName()
	{
		ExtractGroupByName obj=new group.ExtractGroupByName();
		String problemMsg="Problem with: extractGroupByName";
		String name=null;
		assertEquals(problemMsg, null, obj.extractGroupByName(name));
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(ExtractGroupByNameTest.class));
	}
}
