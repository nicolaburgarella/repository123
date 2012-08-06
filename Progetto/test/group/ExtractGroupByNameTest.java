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
	
}
