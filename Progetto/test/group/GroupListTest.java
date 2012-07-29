package group;

import java.lang.String;
import java.util.ArrayList;

public class GroupListTest extends junit.framework.TestCase
{
	public void testGetGroupReg()
	{
		GroupList obj=new group.GroupList();
		ArrayList groupReg=new ArrayList<Group>();
		obj.setGroupReg(groupReg);
		assertTrue(groupReg==obj.getGroupReg());
		
	}
	
	public void testSetGroupReg()
	{
		GroupList obj=new group.GroupList();
		ArrayList groupReg=new ArrayList<Group>();
		obj.setGroupReg(groupReg);
		assertTrue(groupReg==obj.getGroupReg());
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
		int n1=obj.getGroupReg().size();
		Group group=new Group();
		obj.addGroup(group);
		int n2=obj.getGroupReg().size();
		assert n1>n2;
	}
	
}
