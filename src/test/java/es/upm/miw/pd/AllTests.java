package es.upm.miw.pd;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import es.upm.miw.pd.composite.expression.ExpressionTest;
import es.upm.miw.pd.factoryMethod.naturalNumber.NaturalNumberManagerTest;
import es.upm.miw.pd.factoryMethod.naturalNumber.NaturalNumberTest;
import es.upm.miw.pd.singleton.factory.FactoryReferencesTest;
import es.upm.miw.pd.state.conection.ConexionTest;
import es.upm.miw.pd.text.TextoTest;

/*
 * singleton.factory = FactoryReferencesTest
 * composite.expression = ExpressionTest
 * state.connection = ConexionTest
 * factoryMethod.naturalNumber = NaturalNumberTest - NaturalNumberManagerTest
 * text = TextoTest
 * calculadora con deshacer = no hay test
 */
@RunWith(Suite.class)
@SuiteClasses({ ExpressionTest.class, NaturalNumberManagerTest.class,
		NaturalNumberTest.class, FactoryReferencesTest.class,
		ConexionTest.class, TextoTest.class })
public class AllTests {

}
