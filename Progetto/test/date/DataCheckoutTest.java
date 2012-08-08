package date;

import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class DataCheckoutTest.
 */
public class DataCheckoutTest extends junit.framework.TestCase
{
	
	/**
	 * Test data checkout.
	 */
	public void testDataCheckout()
	{
		DataCheckout obj=new date.DataCheckout();
		String problemMsg="Problem with: DataCheckout";
		int days=0;
		assertEquals(problemMsg, null, obj.dataCheckout(days));
	}
	
}
