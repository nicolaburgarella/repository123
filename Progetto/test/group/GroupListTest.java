package group;

import java.lang.String;
import java.util.ArrayList;

import date.DataCheckoutTest;

// TODO: Auto-generated Javadoc
/**
 * The Class GroupListTest.
 */
public class GroupListTest extends junit.framework.TestCase
{
	
	/**
	 * Test get group reg.
	 */
	public void testGetGroupReg()
	{
		GroupList obj=new group.GroupList();
		ArrayList groupReg=new ArrayList<Group>();
		obj.setGroupReg(groupReg);
		assertTrue(groupReg==obj.getGroupReg());
		
	}
	
	/**
	 * Test set group reg.
	 */
	public void testSetGroupReg()
	{
		GroupList obj=new group.GroupList();
		ArrayList groupReg=new ArrayList<Group>();
		obj.setGroupReg(groupReg);
		assertTrue(groupReg==obj.getGroupReg());
	}
	
	
	/**
	 * Test is group list empty.
	 */
	public void testIsGroupListEmpty()
	{
		GroupList obj=new group.GroupList();
		String problemMsg="Problem with: isGroupListEmpty";
		assertTrue(problemMsg, obj.isGroupListEmpty());
//		assertFalse(problemMsg, obj.isGroupListEmpty());
	}
	
	/**
	 * Test add group.
	 */
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
