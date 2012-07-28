package main;

import java.lang.String;

public class AddDataViewTest extends junit.framework.TestCase
{
	public void testInput()
	{
		AddDataView obj=new main.AddDataView();
		String problemMsg="Problem with: input";
		obj.input();
		//Examine the object and assert something appropriate here
	}
	public void testDisplay()
	{
		AddDataView obj=new main.AddDataView();
		String problemMsg="Problem with: display";
		obj.display();
		//Examine the object and assert something appropriate here
	}
	public void testMain()
	{
		String problemMsg="Problem with: main";
		String[] args=null;
		AddDataView.main(args);
		//Examine the object and assert something appropriate here
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(AddDataViewTest.class));
	}
}
