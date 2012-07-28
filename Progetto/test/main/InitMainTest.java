package main;

import java.lang.String;

public class InitMainTest extends junit.framework.TestCase
{
	public void testMain()
	{
		String problemMsg="Problem with: main";
		String[] args=null;
		InitMain.main(args);
		//Examine the object and assert something appropriate here
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(InitMainTest.class));
	}
}
