import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestRegistroCamere {
	public RegistroCamere registro;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		registro = new RegistroCamere();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInserisci() {
		registro.inserisci(new Camera());
		assertFalse(registro.isRegistroCamereVuoto());
	}

}
