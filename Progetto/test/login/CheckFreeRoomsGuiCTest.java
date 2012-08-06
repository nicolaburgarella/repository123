package login;

import java.io.InputStream;
import java.io.PrintWriter;
import javax.swing.JScrollPane;

// TODO: Auto-generated Javadoc
/**
 * The Class CheckFreeRoomsGuiCTest.
 */
public class CheckFreeRoomsGuiCTest extends junit.framework.TestCase
{
	
	/**
	 * Test console.
	 */
	public void testConsole()
	{
		String problemMsg="Problem with: console";
		InputStream out=null;
		PrintWriter in=null;
		assertEquals(problemMsg, null, CheckFreeRoomsGuiC.console(out, in));
	}

}
