package test;
import static org.junit.Assert.*;
import hotel.model.group.Gruppo;
import hotel.model.group.RegistroGruppi;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestRegistroGruppi {
	public RegistroGruppi registro;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		registro=new RegistroGruppi();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testInserisci() {
		registro.inserisci(new Gruppo());
		assertFalse(registro.inserisci(new Gruppo()));
	}

}
