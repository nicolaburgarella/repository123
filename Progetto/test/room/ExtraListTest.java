package room;

import java.lang.String;
import java.util.ArrayList;

public class ExtraListTest extends junit.framework.TestCase
{
	public void testGetExtraReg()
	{
		ExtraList obj=new room.ExtraList();
		String problemMsg="Problem with: getExtraReg";
		assertEquals(problemMsg, null, obj.getExtraReg());
	}
	public void testSetExtraReg()
	{
		ExtraList obj=new room.ExtraList();
		String problemMsg="Problem with: setExtraReg";
		ArrayList extraReg=null;
		obj.setExtraReg(extraReg);
		//Examine the object and assert something appropriate here
	}
	public void testGetExtraList()
	{
		ExtraList obj=new room.ExtraList();
		String problemMsg="Problem with: getExtraList";
		assertEquals(problemMsg, null, obj.getExtraList());
	}
	public void testAddExtra()
	{
		ExtraList obj=new room.ExtraList();
		String problemMsg="Problem with: addExtra";
		Extra extra=null;
		obj.addExtra(extra);
		//Examine the object and assert something appropriate here
	}
	public void testGetExtraByPos()
	{
		ExtraList obj=new room.ExtraList();
		String problemMsg="Problem with: getExtraByPos";
		int posizione=0;
		assertEquals(problemMsg, null, obj.getExtraByPos(posizione));
	}
	public void testIsExtraListEmpty()
	{
		ExtraList obj=new room.ExtraList();
		String problemMsg="Problem with: isExtraListEmpty";
		assertTrue(problemMsg, obj.isExtraListEmpty());
//		assertFalse(problemMsg, obj.isExtraListEmpty());
	}
	public void testToString()
	{
		ExtraList obj=new room.ExtraList();
		String problemMsg="Problem with: toString";
		assertEquals(problemMsg, null, obj.toString());
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(ExtraListTest.class));
	}
}
