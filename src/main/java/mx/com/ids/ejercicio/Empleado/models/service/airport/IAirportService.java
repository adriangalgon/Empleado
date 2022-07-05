package mx.com.ids.ejercicio.Empleado.models.service.airport;

import mx.com.ids.ejercicio.Empleado.models.entity.airport.Airport;

import java.util.List;

public interface IAirportService {

    public List<Airport> listaAirport();

    public Airport buscarPorId(Long id);


}
