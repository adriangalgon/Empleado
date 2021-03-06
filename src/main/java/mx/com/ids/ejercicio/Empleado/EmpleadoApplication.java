package mx.com.ids.ejercicio.Empleado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmpleadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpleadoApplication.class, args);
	}

	/**
	 * Para consultar un findall
	 * ||
	 * ---->http://localhost:8080/view/airport
	 * ---->http://localhost:8080/view/country
	 *
	 * Consulta por ID
	 * ---->http://localhost:8080/view/airport/id
	 * ---->http://localhost:8080/view/country/id
	 */
}
