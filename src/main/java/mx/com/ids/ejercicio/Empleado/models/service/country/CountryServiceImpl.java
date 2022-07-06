package mx.com.ids.ejercicio.Empleado.models.service.country;

import mx.com.ids.ejercicio.Empleado.models.entity.country.Country;
import mx.com.ids.ejercicio.Empleado.models.repository.country.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements ICountryService {

    @Autowired
    CountryRepository countryRepository;

    @Override
    public Country createCountry(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public List<Country> listaCountry() {
        return (List<Country>) countryRepository.findAll();
    }

    @Override
    public Country buscarPorId(Long id) {
        return countryRepository.findById(id).orElse(null);
    }
}
