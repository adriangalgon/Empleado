package mx.com.ids.ejercicio.Empleado.controller.airport;


import mx.com.ids.ejercicio.Empleado.models.entity.airport.Airport;
import mx.com.ids.ejercicio.Empleado.models.service.airport.IAirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    @GetMapping("/airport/{id}")
    public String editar(@PathVariable("id") Long idAirport, Model model, RedirectAttributes attribute){
        Airport airport = null;

        if (idAirport > 0){
            airport = iAirportService.buscarPorId(idAirport);

            if (airport == null){
                System.out.println("Error: El ID del aeropuerto no existe!");
                attribute.addFlashAttribute("error","ATENCION: El ID del aeropuerto no existe!");
                return "redirect:/view/airport";
            }
        } else {
            System.out.println("Error: Error con el ID del aeropuerto");
            attribute.addFlashAttribute("error", "ATENCION: Error con el ID del aeropuerto");
            return "redirect:/view/airport";
        }

        List<Airport> listAirports = iAirportService.listaAirport();

        model.addAttribute("titulo", "Mostrar por ID");
        model.addAttribute("airports", airport);

        return "/views/AirportsId";
    }
}
