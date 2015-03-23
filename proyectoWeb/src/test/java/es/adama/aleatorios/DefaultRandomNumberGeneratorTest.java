package es.adama.aleatorios;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;



/**
 * 
 * @author David
 *
 */
public class DefaultRandomNumberGeneratorTest
{

    private GeneradorAleatorio generadorAleatorio;

    @Before
    public void setUp()
    {
	generadorAleatorio = new GeneradorAleatorio();
    }

    @After
    public void after()
    {
	generadorAleatorio = null;
    }

    @Test
    public void testName()
    {
	Assert.assertSame("El nombre no es el esperado: ", "Generador aleatorio de números", generadorAleatorio.name());
    }

    @Ignore
    @Test
    public void testNumeroAleatorio()
    {
	int generatedInt = generadorAleatorio.generaNumero();
	assertTrue("El número aleatorio generado no está entre 5 y 10: ", generatedInt >= 5 && generatedInt <= 10);
    }

}
