package es.upm.miw.pd.factoryMethod.naturalNumber;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NaturalNumberTest {
	
	private NaturalNumber naturalNumber;

	@Before
	public void setUp() throws Exception {
		this.naturalNumber = new NaturalNumberEs(2);
	}

	@Test
	public void testGetValue() {
		assertEquals(2, this.naturalNumber.getValue());
	}

	@Test
	public void testSetValue() {
		this.naturalNumber.setValue(1);
		assertEquals(1, this.naturalNumber.getValue());
	}

	@Test
	public void testAdd() {
		this.naturalNumber.add(1);
		assertEquals(3, this.naturalNumber.getValue());
	}

	@Test
	public void testGetTextValueEs() {
		assertEquals("dos", this.naturalNumber.getTextValue());
	}
	
	@Test
	public void testGetTextValueEn() {
		this.naturalNumber = new NaturalNumberEn(2);
		assertEquals("two", this.naturalNumber.getTextValue());
	}
	
	@Test
	public void testUnknownValue() {
		this.naturalNumber = new NaturalNumberEn(52);
		assertEquals("???", this.naturalNumber.getTextValue());
	}

}
