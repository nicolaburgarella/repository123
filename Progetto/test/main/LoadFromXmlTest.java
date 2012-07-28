package main;


public class LoadFromXmlTest extends junit.framework.TestCase
{
	public void testLoadFromXml()
	{
		LoadFromXml obj=new main.LoadFromXml();
		String problemMsg="Problem with: LoadFromXml";
		assertEquals(problemMsg, null, obj.LoadFromXml());
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(LoadFromXmlTest.class));
	}
}
