package group;

import java.lang.String;

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
		//Examine the object and assert something appropriate here
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
		//Examine the object and assert something appropriate here
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
		//Examine the object and assert something appropriate here
	}
	public void testGetFlag()
	{
		Request obj=new group.Request();
		String problemMsg="Problem with: getFlag";
		assertEquals(problemMsg, null, obj.getFlag());
	}
	public void testSetFlag()
	{
		Request obj=new group.Request();
		String problemMsg="Problem with: setFlag";
		String flag=null;
		obj.setFlag(flag);
		//Examine the object and assert something appropriate here
	}
	public void testToString()
	{
		Request obj=new group.Request();
		String problemMsg="Problem with: toString";
		assertEquals(problemMsg, null, obj.toString());
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(RequestTest.class));
	}
}
