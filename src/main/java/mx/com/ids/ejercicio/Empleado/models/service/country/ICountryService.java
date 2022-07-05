package mx.com.ids.ejercicio.Empleado.models.service.country;

import mx.com.ids.ejercicio.Empleado.models.entity.country.Country;

import java.util.List;

public interface ICountryService  {

    public List<Country> listaCountry();

    public Country buscarPorId(Long id);
}
