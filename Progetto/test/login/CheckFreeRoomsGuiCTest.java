package login;

import java.io.InputStream;
import java.io.PrintWriter;
import javax.swing.JScrollPane;

public class CheckFreeRoomsGuiCTest extends junit.framework.TestCase
{
	public void testConsole()
	{
		String problemMsg="Problem with: console";
		InputStream out=null;
		PrintWriter in=null;
		assertEquals(problemMsg, null, CheckFreeRoomsGuiC.console(out, in));
	}

}