package mx.com.ids.ejercicio.Empleado.models.service.airport;

import mx.com.ids.ejercicio.Empleado.models.entity.airport.Airport;
import mx.com.ids.ejercicio.Empleado.models.repository.airport.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportServiceImpl implements IAirportService{

    @Autowired
    private AirportRepository airportRepository;

    @Override
    public Airport createAirport(Airport airport) {
        return airportRepository.save(airport);
    }

    @Override
    public List<Airport> listaAirport() {
        return (List<Airport>) airportRepository.findAll();
    }

    @Override
    public Airport buscarPorId(Long id) {
        return airportRepository.findById(id).orElse(null);
    }


}
