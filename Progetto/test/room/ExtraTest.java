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
		assertTrue(cost==obj.getCost());
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
		String date="16/7/2012";
		obj.setDate(date);
		assertTrue(obj.getDate().equals(date));
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
		String type="internet";
		obj.setType(type);
		assertTrue(type==obj.getType());
	}
}
