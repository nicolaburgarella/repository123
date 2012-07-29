package room;

import group.Group;
import group.GroupList;

import java.lang.String;
import java.util.ArrayList;

public class ExtraListTest extends junit.framework.TestCase
{
	public void testGetExtraReg()
	{
		ExtraList obj=new room.ExtraList();
		ArrayList extraReg=new ArrayList<Extra>();
		obj.setExtraReg(extraReg);
		assertTrue(extraReg==obj.getExtraReg());
	}
	public void testSetExtraReg()
	{
		ExtraList obj=new room.ExtraList();
		String problemMsg="Problem with: setExtraReg";
		ArrayList extraReg=null;
		obj.setExtraReg(extraReg);
		assertTrue(extraReg==obj.getExtraReg());
	}
	public void testGetExtraList()
	{
		ExtraList obj=new room.ExtraList();
		ArrayList extraReg=new ArrayList<Extra>();
		obj.setExtraReg(extraReg);
		assertTrue(extraReg==obj.getExtraReg());
	}
	public void testAddExtra()
	{
		ExtraList obj=new ExtraList();
		int n1=obj.getExtraReg().size();
		Extra extra=new Extra();
		obj.addExtra(extra);
		int n2=obj.getExtraReg().size();
		assert n1>n2;
	}
	
	
	public void testIsExtraListEmpty()
	{
		ExtraList obj=new room.ExtraList();
		String problemMsg="Problem with: isExtraListEmpty";
		assertTrue(problemMsg, obj.isExtraListEmpty());
//		assertFalse(problemMsg, obj.isExtraListEmpty());
	}
}
