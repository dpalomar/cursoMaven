package es.adama.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import es.adama.aleatorios.GeneradorAleatorio;



/**
 * 
 * @author David www.adamaconsulting.es
 *
 */
@Configuration
/*
 * marca la clase como fichero de configuración
 * especifica que paquetes escanear
 */
@ComponentScan("es.adama")
// Habilita las anotaciones de SpringMVC
@EnableWebMvc
public class Config {

	@Bean
	public UrlBasedViewResolver setupViewResolver() {
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setPrefix("/WEB-INF/vistas/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}

	@Bean
	public GeneradorAleatorio generadorAleatorio() {
		return new GeneradorAleatorio();
	}
	
		
}
