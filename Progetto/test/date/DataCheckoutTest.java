package date;

import java.util.Date;

public class DataCheckoutTest extends junit.framework.TestCase
{
	public void testDataCheckout()
	{
		DataCheckout obj=new date.DataCheckout();
		String problemMsg="Problem with: DataCheckout";
		int days=0;
		assertEquals(problemMsg, null, obj.DataCheckout(days));
	}
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(DataCheckoutTest.class));
	}
}
