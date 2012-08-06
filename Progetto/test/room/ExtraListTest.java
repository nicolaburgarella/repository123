package room;

import group.Group;
import group.GroupList;

import java.lang.String;
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class ExtraListTest.
 */
public class ExtraListTest extends junit.framework.TestCase
{
	
	/**
	 * Test get extra reg.
	 */
	public void testGetExtraReg()
	{
		ExtraList obj=new room.ExtraList();
		ArrayList extraReg=new ArrayList<Extra>();
		obj.setExtraReg(extraReg);
		assertTrue(extraReg==obj.getExtraReg());
	}
	
	/**
	 * Test set extra reg.
	 */
	public void testSetExtraReg()
	{
		ExtraList obj=new room.ExtraList();
		String problemMsg="Problem with: setExtraReg";
		ArrayList extraReg=null;
		obj.setExtraReg(extraReg);
		assertTrue(extraReg==obj.getExtraReg());
	}
	
	/**
	 * Test get extra list.
	 */
	public void testGetExtraList()
	{
		ExtraList obj=new room.ExtraList();
		ArrayList extraReg=new ArrayList<Extra>();
		obj.setExtraReg(extraReg);
		assertTrue(extraReg==obj.getExtraReg());
	}
	
	/**
	 * Test add extra.
	 */
	public void testAddExtra()
	{
		ExtraList obj=new ExtraList();
		int n1=obj.getExtraReg().size();
		Extra extra=new Extra();
		obj.addExtra(extra);
		int n2=obj.getExtraReg().size();
		assert n1>n2;
	}
	
	
	/**
	 * Test is extra list empty.
	 */
	public void testIsExtraListEmpty()
	{
		ExtraList obj=new room.ExtraList();
		String problemMsg="Problem with: isExtraListEmpty";
		assertTrue(problemMsg, obj.isExtraListEmpty());
//		assertFalse(problemMsg, obj.isExtraListEmpty());
	}
}
