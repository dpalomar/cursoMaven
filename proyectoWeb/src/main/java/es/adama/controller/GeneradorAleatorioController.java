package es.adama.controller;

import javax.inject.Inject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
//spring imports
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// denOfProgramming imports



import es.adama.aleatorios.GeneradorAleatorio;

/**
 * Ejemplo de controlador mvn que genera un número aleatorio y lo devuelve a la vista asociada
 * 
 * También muestra varios usos de log con diversos API
 *  i.e. "Apache Commons Logging (JCL)", Log4j and  "Simple Logging Facade" * 
 * 
 * 
 * See reference documents: 
 * http://www.slf4j.org/index.html
 * https://commons.apache.org/proper/commons-logging/guide.html
 * https://logging.apache.org/log4j/1.2/
 * 
 * @author David www.adamaconsulting.es
 * 
 */
@Controller
public class GeneradorAleatorioController {
	// Usando slf4j api directamente - elimina los comentarios de este código después de que las dependencias de SLFJ han sido añadidas
	// private static final Logger logger = LoggerFactory.getLogger(IdentifierGenerationController.class);

	// Usando el api log4j proporcionado por la dependencia específica
	private static final Logger logger = Logger
			.getLogger("es.adama.controller.GeneradorAleatorioController");

	// usando el api JCL proporcionado por la dependencia transitiva de spring-core
	private Log log = LogFactory.getLog(GeneradorAleatorioController.class);

	@Inject
	private GeneradorAleatorio idGenerator;

	@RequestMapping("/numero")
	public String muestraNuevoId(Model model) {		
		//  Sólo como ejemplo para mostrar las diferentes dependencias de logging
		
		// Lo mejo es usar sólo una y es buena práctica usar slf4j.

		// debug de JCL
		log.debug("El log está usando: "
				+ log.getClass().getCanonicalName());

		// debug de log4j
		logger.debug("El log está usando: "
				+ logger.getClass().getCanonicalName());
		
		
		
		model.addAttribute("creator", idGenerator.name());
		model.addAttribute("id", idGenerator.generaNumero());

		return "nuevoNumero";		

	}

}
