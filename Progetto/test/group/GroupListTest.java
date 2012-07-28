package group;

import java.lang.String;
import java.util.ArrayList;

public class GroupListTest extends junit.framework.TestCase
{
	public void testGetGroupReg()
	{
		GroupList obj=new group.GroupList();
		String problemMsg="Problem with: getGroupReg";
		assertEquals(problemMsg, null, obj.getGroupReg());
	}
	public void testSetGroupReg()
	{
		GroupList obj=new group.GroupList();
		String problemMsg="Problem with: setGroupReg";
		ArrayList groupReg=null;
		obj.setGroupReg(groupReg);
		//Examine the object and assert something appropriate here
	}
	public void testToString()
	{
		GroupList obj=new group.GroupList();
		String problemMsg="Problem with: toString";
		assertEquals(problemMsg, null, obj.toString());
	}
	public void testIsGroupListEmpty()
	{
		GroupList obj=new group.GroupList();
		String problemMsg="Problem with: isGroupListEmpty";
		assertTrue(problemMsg, obj.isGroupListEmpty());
//		assertFalse(problemMsg, obj.isGroupListEmpty());
	}
	public void testAddGroup()
	{
		GroupList obj=new group.GroupList();
		String problemMsg="Problem with: addGroup";
		Group group=null;
		obj.addGroup(group);
		//Examine the object and assert something appropriate here
	}
	public void testGetGroupByPos()
	{
		GroupList obj=new group.GroupList();
		String problemMsg="Problem with: getGroupByPos";
		int posizione=0;
		assertEquals(problemMsg, null, obj.getGroupByPos(posizione));
	}
	public void testSearchGroupPosById()
	{
		GroupList obj=new group.GroupList();
		String problemMsg="Problem with: searchGroupPosById";
		int number=0;
		assertEquals(problemMsg, 0, obj.searchGroupPosById(number));
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(GroupListTest.class));
	}
}
