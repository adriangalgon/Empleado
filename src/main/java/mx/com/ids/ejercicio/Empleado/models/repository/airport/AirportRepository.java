package mx.com.ids.ejercicio.Empleado.models.repository.airport;

import mx.com.ids.ejercicio.Empleado.models.entity.airport.Airport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends CrudRepository<Airport, Long> {
}
