package room;

import java.lang.String;

// TODO: Auto-generated Javadoc
/**
 * The Class ExtraTest.
 */
public class ExtraTest extends junit.framework.TestCase
{
	
	/**
	 * Test get cost.
	 */
	public void testGetCost()
	{
		Extra obj=new room.Extra();
		String problemMsg="Problem with: getCost";
		assertEquals(problemMsg, 0F, obj.getCost(), 0.1F);
//NOTE: Final parameter is the tolerance for the comparison
	}
	
	/**
	 * Test set cost.
	 */
	public void testSetCost()
	{
		Extra obj=new room.Extra();
		String problemMsg="Problem with: setCost";
		float cost=0F;
		obj.setCost(cost);
		assertTrue(cost==obj.getCost());
	}
	
	/**
	 * Test get date.
	 */
	public void testGetDate()
	{
		Extra obj=new room.Extra();
		String problemMsg="Problem with: getDate";
		assertEquals(problemMsg, null, obj.getDate());
	}
	
	/**
	 * Test set date.
	 */
	public void testSetDate()
	{
		Extra obj=new room.Extra();
		String date="16/7/2012";
		obj.setDate(date);
		assertTrue(obj.getDate().equals(date));
	}
	
	/**
	 * Test get type.
	 */
	public void testGetType()
	{
		Extra obj=new room.Extra();
		String problemMsg="Problem with: getType";
		assertEquals(problemMsg, null, obj.getType());
	}
	
	/**
	 * Test set type.
	 */
	public void testSetType()
	{
		Extra obj=new room.Extra();
		String type="internet";
		obj.setType(type);
		assertTrue(type==obj.getType());
	}
}
