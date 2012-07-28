package room;

import java.lang.String;

public class ExtraTest extends junit.framework.TestCase
{
	public void testGetCost()
	{
		Extra obj=new room.Extra();
		String problemMsg="Problem with: getCost";
		assertEquals(problemMsg, 0F, obj.getCost(), 0.1F);
//NOTE: Final parameter is the tolerance for the comparison
	}
	public void testSetCost()
	{
		Extra obj=new room.Extra();
		String problemMsg="Problem with: setCost";
		float cost=0F;
		obj.setCost(cost);
		//Examine the object and assert something appropriate here
	}
	public void testGetDate()
	{
		Extra obj=new room.Extra();
		String problemMsg="Problem with: getDate";
		assertEquals(problemMsg, null, obj.getDate());
	}
	public void testSetDate()
	{
		Extra obj=new room.Extra();
		String problemMsg="Problem with: setDate";
		String date=null;
		obj.setDate(date);
		//Examine the object and assert something appropriate here
	}
	public void testGetType()
	{
		Extra obj=new room.Extra();
		String problemMsg="Problem with: getType";
		assertEquals(problemMsg, null, obj.getType());
	}
	public void testSetType()
	{
		Extra obj=new room.Extra();
		String problemMsg="Problem with: setType";
		String type=null;
		obj.setType(type);
		//Examine the object and assert something appropriate here
	}
	public void testToString()
	{
		Extra obj=new room.Extra();
		String problemMsg="Problem with: toString";
		assertEquals(problemMsg, null, obj.toString());
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(ExtraTest.class));
	}
}
