package es.upm.miw.pd.factoryMethod.naturalNumber;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NaturalNumberManagerTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetTextValueEn() {
		NaturalNumberCreator naturalNumberCreator = new NaturalNumberEnCreator();
		NaturalNumberManager.getInstance().setNaturalNumberCreator(naturalNumberCreator);
		NaturalNumber naturalNumber = NaturalNumberManager.getInstance().getNaturalNumber(4);
		assertEquals("four", naturalNumber.getTextValue());
	}
	
	@Test
	public void testGetTextValueEs() {
		NaturalNumberCreator naturalNumberCreator = new NaturalNumberEsCreator();
		NaturalNumberManager.getInstance().setNaturalNumberCreator(naturalNumberCreator);
		NaturalNumber naturalNumber = NaturalNumberManager.getInstance().getNaturalNumber(4);
		assertEquals("cuatro", naturalNumber.getTextValue());
	}
	
	@Test
	public void testAdd() {
		NaturalNumberCreator naturalNumberCreator = new NaturalNumberEsCreator();
		NaturalNumberManager.getInstance().setNaturalNumberCreator(naturalNumberCreator);
		NaturalNumber naturalNumber = NaturalNumberManager.getInstance().getNaturalNumber(1);
		naturalNumber.add(2);
		assertEquals(3, naturalNumber.getValue());
	}

}
