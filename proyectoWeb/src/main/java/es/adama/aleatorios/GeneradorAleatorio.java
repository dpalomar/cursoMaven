package es.adama.aleatorios;

import org.apache.commons.math3.random.RandomDataGenerator;


/**
 * 
 * @author David www.adamaconsulting.es
 *
 */
public class GeneradorAleatorio {


	
	public int generaNumero() {
		final RandomDataGenerator aRandomDataGenerator = new RandomDataGenerator();
		return aRandomDataGenerator.nextInt(5, 10);			
	}
	
	public String name() {
		return "Generador aleatorio de números";
	}
}
