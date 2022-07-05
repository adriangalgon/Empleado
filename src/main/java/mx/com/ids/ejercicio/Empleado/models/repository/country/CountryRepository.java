package mx.com.ids.ejercicio.Empleado.models.repository.country;

import mx.com.ids.ejercicio.Empleado.models.entity.country.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {
}
