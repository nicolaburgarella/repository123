package login;

import java.io.InputStream;
import java.io.PrintWriter;
import javax.swing.JScrollPane;

public class CheckoutNameTest extends junit.framework.TestCase
{
	public void testConsole()
	{
		String problemMsg="Problem with: console";
		InputStream out=null;
		PrintWriter in=null;
		assertEquals(problemMsg, null, CheckoutName.console(out, in));
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(CheckoutNameTest.class));
	}
}
