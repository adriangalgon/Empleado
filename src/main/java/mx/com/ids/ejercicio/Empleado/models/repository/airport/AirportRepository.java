package mx.com.ids.ejercicio.Empleado.models.repository.airport;

import mx.com.ids.ejercicio.Empleado.models.entity.airport.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Long> {
}
