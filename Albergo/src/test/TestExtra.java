package test;
import static org.junit.Assert.*;
import hotel.model.extra.Extra;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestExtra {
	
	public Extra extra;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		extra=new Extra();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testInserisciExtra() {
		extra.InserisciExtra();
		assert extra != null;
	}

}
