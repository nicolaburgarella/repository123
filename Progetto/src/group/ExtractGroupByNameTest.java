package group;

import java.lang.String;

public class ExtractGroupByNameTest extends junit.framework.TestCase
{
	public void testExtractGroupByName()
	{
		ExtractGroupByName obj=new group.ExtractGroupByName();
		String problemMsg="Problem with: extractGroupByName";
		String name=null;
		assertEquals(problemMsg, null, obj.extractGroupByName(name));
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(ExtractGroupByNameTest.class));
	}
}
