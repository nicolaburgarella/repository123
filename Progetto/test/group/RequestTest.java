package group;

import java.lang.String;
import java.util.ArrayList;

public class RequestTest extends junit.framework.TestCase
{
	public void testGetSingole()
	{
		Request obj=new group.Request();
		String problemMsg="Problem with: getSingole";
		assertEquals(problemMsg, 0, obj.getSingole());
	}
	public void testSetSingole()
	{
		Request obj=new group.Request();
		String problemMsg="Problem with: setSingole";
		int singole=0;
		obj.setSingole(singole);
		assertTrue(singole==obj.getSingole());
	}
	public void testGetDoppie()
	{
		Request obj=new group.Request();
		String problemMsg="Problem with: getDoppie";
		assertEquals(problemMsg, 0, obj.getDoppie());
	}
	public void testSetDoppie()
	{
		Request obj=new group.Request();
		String problemMsg="Problem with: setDoppie";
		int doppie=0;
		obj.setDoppie(doppie);
		assertTrue(doppie==obj.getDoppie());
	}
	public void testGetMatrimoniali()
	{
		Request obj=new group.Request();
		String problemMsg="Problem with: getMatrimoniali";
		assertEquals(problemMsg, 0, obj.getMatrimoniali());
	}
	public void testSetMatrimoniali()
	{
		Request obj=new group.Request();
		String problemMsg="Problem with: setMatrimoniali";
		int matrimoniali=0;
		obj.setMatrimoniali(matrimoniali);
		assertTrue(matrimoniali==obj.getMatrimoniali());
	}
	public void testGetFlag()
	{
		Request obj=new group.Request();
		String problemMsg="Problem with: getFlag";
		obj.setFlag(null);
		assertEquals(problemMsg, null, obj.getFlag());
	}
	public void testSetFlag()
	{
		Request obj=new group.Request();
		String problemMsg="Problem with: setFlag";
		String flag=null;
		String flag1=obj.getFlag();
		obj.setFlag("eseguita");
		assertFalse(flag1.equals(flag));
	}
}
