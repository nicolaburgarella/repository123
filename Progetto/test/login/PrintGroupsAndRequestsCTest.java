package login;

import java.io.InputStream;
import java.io.PrintWriter;
import javax.swing.JScrollPane;

// TODO: Auto-generated Javadoc
/**
 * The Class PrintGroupsAndRequestsCTest.
 */
public class PrintGroupsAndRequestsCTest extends junit.framework.TestCase
{
	
	/**
	 * Test console.
	 */
	public void testConsole()
	{
		String problemMsg="Problem with: console";
		InputStream out=null;
		PrintWriter in=null;
		assertEquals(problemMsg, null, PrintGroupsAndRequestsC.console(out, in));
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(PrintGroupsAndRequestsCTest.class));
	}
}
