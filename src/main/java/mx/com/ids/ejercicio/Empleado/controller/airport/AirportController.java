package mx.com.ids.ejercicio.Empleado.controller.airport;


import mx.com.ids.ejercicio.Empleado.models.entity.airport.Airport;
import mx.com.ids.ejercicio.Empleado.models.service.airport.IAirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/view")
public class AirportController {

    @Autowired
    private IAirportService iAirportService;

    @GetMapping("/airport")
    public String listarAirports(Model model){
        List<Airport> listadoAirport = iAirportService.listaAirport();

        model.addAttribute("titulo", "Lista de Aeropuertos");
        model.addAttribute("airports", listadoAirport);

        return "/views/Airports";
    }
}
