package es.upm.miw.pd.text;

import static org.junit.Assert.*;

import org.junit.Test;

public class TextoTest {

	@Test
	public void testImprimirCaracter() {
		Caracter c = FactoriaCaracter.getInstance().getCaracter('a');
		assertEquals("a", c.imprimir());
	}

	@Test
	public void testImprimirCaracterMayusculas() {
		Caracter c = FactoriaCaracter.getInstance().getCaracter('a');
		assertEquals("A", c.imprimir(true));
	}

	@Test
	public void testImprimirCaracterMinusculas() {
		Caracter c = FactoriaCaracter.getInstance().getCaracter('b');
		assertEquals("b", c.imprimir(false));
	}

	@Test
	public void testEsMismoCaracter() {
		Caracter c = FactoriaCaracter.getInstance().getCaracter('b');
		Caracter c1 = FactoriaCaracter.getInstance().getCaracter('b');
		assertSame("No es la misma referencia", c, c1);
	}

	@Test
	public void testAniadirCaracterAParrafo() {
		Parrafo parrafo = new Parrafo();
		Caracter c = FactoriaCaracter.getInstance().getCaracter('a');
		parrafo.aniadirCaracter(c);
		Caracter c1 = FactoriaCaracter.getInstance().getCaracter('b');
		parrafo.aniadirCaracter(c1);
		assertEquals("ab\n", parrafo.imprimir(false));
	}

	@Test
	public void testBorrarCaracterAParrafo() {
		Parrafo parrafo = new Parrafo();
		Caracter c = FactoriaCaracter.getInstance().getCaracter('a');
		parrafo.aniadirCaracter(c);
		Caracter c1 = FactoriaCaracter.getInstance().getCaracter('b');
		parrafo.aniadirCaracter(c1);
		parrafo.quitarCaracter(c);
		assertEquals("b\n", parrafo.imprimir(false));
	}

	@Test
	public void testAniadirParrafoAParrafo() {
		try {
			Parrafo parrafo = new Parrafo();
			Parrafo parrafo1 = new Parrafo();
			parrafo.aniadirParrafo(parrafo1);
			fail();
		} catch (UnsupportedOperationException ignored) {
			ignored.toString();
		}
	}

	@Test
	public void testAniadirTextoAParrafo() {
		try {
			Parrafo parrafo = new Parrafo();
			Texto texto = new Texto();
			parrafo.aniadirTexto(texto);
			fail();
		} catch (UnsupportedOperationException ignored) {
			ignored.toString();
		}
	}

	@Test
	public void testImprimirParrafoMinusculas() {
		Caracter c = FactoriaCaracter.getInstance().getCaracter('c');
		Caracter a = FactoriaCaracter.getInstance().getCaracter('a');
		Caracter r = FactoriaCaracter.getInstance().getCaracter('r');
		Caracter l = FactoriaCaracter.getInstance().getCaracter('l');
		Caracter o = FactoriaCaracter.getInstance().getCaracter('o');
		Caracter s = FactoriaCaracter.getInstance().getCaracter('s');
		Parrafo parrafo = new Parrafo();
		parrafo.aniadirCaracter(c);
		parrafo.aniadirCaracter(a);
		parrafo.aniadirCaracter(r);
		parrafo.aniadirCaracter(l);
		parrafo.aniadirCaracter(o);
		parrafo.aniadirCaracter(s);
		assertEquals("carlos\n", parrafo.imprimir(false));
	}

	@Test
	public void testImprimirParrafoMayusculas() {
		Caracter c = FactoriaCaracter.getInstance().getCaracter('c');
		Caracter a = FactoriaCaracter.getInstance().getCaracter('a');
		Caracter r = FactoriaCaracter.getInstance().getCaracter('r');
		Caracter l = FactoriaCaracter.getInstance().getCaracter('l');
		Caracter o = FactoriaCaracter.getInstance().getCaracter('o');
		Caracter s = FactoriaCaracter.getInstance().getCaracter('s');
		Parrafo parrafo = new Parrafo();
		parrafo.aniadirCaracter(c);
		parrafo.aniadirCaracter(a);
		parrafo.aniadirCaracter(r);
		parrafo.aniadirCaracter(l);
		parrafo.aniadirCaracter(o);
		parrafo.aniadirCaracter(s);
		assertEquals("carlos\n", parrafo.imprimir(false));
	}

	@Test
	public void testImprimirParrafo() {
		Caracter c = FactoriaCaracter.getInstance().getCaracter('C');
		Caracter a = FactoriaCaracter.getInstance().getCaracter('a');
		Caracter r = FactoriaCaracter.getInstance().getCaracter('r');
		Caracter l = FactoriaCaracter.getInstance().getCaracter('l');
		Caracter o = FactoriaCaracter.getInstance().getCaracter('o');
		Caracter s = FactoriaCaracter.getInstance().getCaracter('s');
		Parrafo parrafo = new Parrafo();
		parrafo.aniadirCaracter(c);
		parrafo.aniadirCaracter(a);
		parrafo.aniadirCaracter(r);
		parrafo.aniadirCaracter(l);
		parrafo.aniadirCaracter(o);
		parrafo.aniadirCaracter(s);
		assertEquals("Carlos\n", parrafo.imprimir());
	}

	@Test
	public void testImprimirTexto() {
		Caracter c = FactoriaCaracter.getInstance().getCaracter('C');
		Caracter a = FactoriaCaracter.getInstance().getCaracter('a');
		Caracter r = FactoriaCaracter.getInstance().getCaracter('r');
		Caracter l = FactoriaCaracter.getInstance().getCaracter('l');
		Caracter o = FactoriaCaracter.getInstance().getCaracter('o');
		Caracter s = FactoriaCaracter.getInstance().getCaracter('s');
		Parrafo parrafo = new Parrafo();
		parrafo.aniadirCaracter(c);
		parrafo.aniadirCaracter(a);
		parrafo.aniadirCaracter(r);
		parrafo.aniadirCaracter(l);
		parrafo.aniadirCaracter(o);
		parrafo.aniadirCaracter(s);
		
		Parrafo parrafo1 = new Parrafo();
		Caracter p = FactoriaCaracter.getInstance().getCaracter('P');
		Caracter a1 = FactoriaCaracter.getInstance().getCaracter('a');
		Caracter l1 = FactoriaCaracter.getInstance().getCaracter('l');
		Caracter a2 = FactoriaCaracter.getInstance().getCaracter('a');
		Caracter c1 = FactoriaCaracter.getInstance().getCaracter('c');
		Caracter i = FactoriaCaracter.getInstance().getCaracter('i');
		Caracter o1 = FactoriaCaracter.getInstance().getCaracter('o');
		Caracter s1 = FactoriaCaracter.getInstance().getCaracter('s');
		parrafo1.aniadirCaracter(p);
		parrafo1.aniadirCaracter(a1);
		parrafo1.aniadirCaracter(l1);
		parrafo1.aniadirCaracter(a2);
		parrafo1.aniadirCaracter(c1);
		parrafo1.aniadirCaracter(i);
		parrafo1.aniadirCaracter(o1);
		parrafo1.aniadirCaracter(s1);
		
		Texto texto = new Texto();
		texto.aniadirParrafo(parrafo);
		texto.aniadirParrafo(parrafo1);
		
		assertEquals("Carlos\nPalacios\n---o---", texto.imprimir());
	}

}
