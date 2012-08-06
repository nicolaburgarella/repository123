package room;

import java.lang.String;

// TODO: Auto-generated Javadoc
/**
 * The Class RoomTest.
 */
public class RoomTest extends junit.framework.TestCase
{
	
	/**
	 * Test get number.
	 */
	public void testGetNumber()
	{
		Room obj=new room.Room(0, 0F, null, null, null);
		String problemMsg="Problem with: getNumber";
		assertEquals(problemMsg, 0, obj.getNumber());
	}
	
	/**
	 * Test set number.
	 */
	public void testSetNumber()
	{
		Room obj=new room.Room(0, 0F, null, null, null);
		int number=0;
		obj.setNumber(number);
		assertTrue(number==obj.getNumber());
	}
	
	/**
	 * Test get fee.
	 */
	public void testGetFee()
	{
		Room obj=new room.Room(0, 0F, null, null, null);
		String problemMsg="Problem with: getFee";
		assertEquals(problemMsg, 0F, obj.getFee(), 0.1F);
//NOTE: Final parameter is the tolerance for the comparison
	}
	
	/**
	 * Test set fee.
	 */
	public void testSetFee()
	{
		Room obj=new room.Room(0, 0F, null, null, null);
		String problemMsg="Problem with: setFee";
		float f=0F;
		obj.setFee(f);
		assertTrue(f==obj.getFee());
	}
	
	/**
	 * Test get free.
	 */
	public void testGetFree()
	{
		Room obj=new room.Room(0, 0F, null, null, null);
		String problemMsg="Problem with: getFree";
		assertEquals(problemMsg, null, obj.getFree());
	}
	
	/**
	 * Test set free.
	 */
	public void testSetFree()
	{
		Room obj=new room.Room(0, 0F, null, null, null);
		String problemMsg="Problem with: setFree";
		String free=null;
		obj.setFree(free);
		assertTrue(free==obj.getFree());
	}
	
	/**
	 * Test get composition.
	 */
	public void testGetComposition()
	{
		Room obj=new room.Room(0, 0F, null, null, null);
		String problemMsg="Problem with: getComposition";
		assertEquals(problemMsg, null, obj.getComposition());
	}
	
	/**
	 * Test set composition.
	 */
	public void testSetComposition()
	{
		Room obj=new room.Room(0, 0F, null, null, null);
		String problemMsg="Problem with: setComposition";
		String composition="1+1";
		obj.setComposition(composition);
		assertTrue(obj.getComposition().equals(composition));
	}
	
	/**
	 * Test get description.
	 */
	public void testGetDescription()
	{
		Room obj=new room.Room(0, 0F, null, null, null);
		String problemMsg="Problem with: getDescription";
		assertEquals(problemMsg, null, obj.getDescription());
	}
	
	/**
	 * Test set description.
	 */
	public void testSetDescription()
	{
		Room obj=new room.Room(0, 0F, null, null, "stanza con vista molto bella");
		String problemMsg="Problem with: setDescription";
		String description="stanza con vista molto bella";
		obj.setDescription(description);
		assertTrue(obj.getDescription().equals(description));
	}
}
