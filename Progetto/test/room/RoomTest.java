package room;

import java.lang.String;

public class RoomTest extends junit.framework.TestCase
{
	public void testGetNumber()
	{
		Room obj=new room.Room(0, 0F, null, null, null);
		String problemMsg="Problem with: getNumber";
		assertEquals(problemMsg, 0, obj.getNumber());
	}
	public void testSetNumber()
	{
		Room obj=new room.Room(0, 0F, null, null, null);
		String problemMsg="Problem with: setNumber";
		int number=0;
		obj.setNumber(number);
		//Examine the object and assert something appropriate here
	}
	public void testGetFee()
	{
		Room obj=new room.Room(0, 0F, null, null, null);
		String problemMsg="Problem with: getFee";
		assertEquals(problemMsg, 0F, obj.getFee(), 0.1F);
//NOTE: Final parameter is the tolerance for the comparison
	}
	public void testSetFee()
	{
		Room obj=new room.Room(0, 0F, null, null, null);
		String problemMsg="Problem with: setFee";
		float f=0F;
		obj.setFee(f);
		//Examine the object and assert something appropriate here
	}
	public void testGetFree()
	{
		Room obj=new room.Room(0, 0F, null, null, null);
		String problemMsg="Problem with: getFree";
		assertEquals(problemMsg, null, obj.getFree());
	}
	public void testSetFree()
	{
		Room obj=new room.Room(0, 0F, null, null, null);
		String problemMsg="Problem with: setFree";
		String free=null;
		obj.setFree(free);
		//Examine the object and assert something appropriate here
	}
	public void testGetComposition()
	{
		Room obj=new room.Room(0, 0F, null, null, null);
		String problemMsg="Problem with: getComposition";
		assertEquals(problemMsg, null, obj.getComposition());
	}
	public void testSetComposition()
	{
		Room obj=new room.Room(0, 0F, null, null, null);
		String problemMsg="Problem with: setComposition";
		String composition=null;
		obj.setComposition(composition);
		//Examine the object and assert something appropriate here
	}
	public void testGetDescription()
	{
		Room obj=new room.Room(0, 0F, null, null, null);
		String problemMsg="Problem with: getDescription";
		assertEquals(problemMsg, null, obj.getDescription());
	}
	public void testSetDescription()
	{
		Room obj=new room.Room(0, 0F, null, null, null);
		String problemMsg="Problem with: setDescription";
		String description=null;
		obj.setDescription(description);
		//Examine the object and assert something appropriate here
	}
	public void testToString()
	{
		Room obj=new room.Room(0, 0F, null, null, null);
		String problemMsg="Problem with: toString";
		assertEquals(problemMsg, null, obj.toString());
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(RoomTest.class));
	}
}
