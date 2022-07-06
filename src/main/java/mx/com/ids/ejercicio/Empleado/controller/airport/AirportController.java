package mx.com.ids.ejercicio.Empleado.controller.airport;


import mx.com.ids.ejercicio.Empleado.models.entity.airport.Airport;
import mx.com.ids.ejercicio.Empleado.models.entity.employee.Employee;
import mx.com.ids.ejercicio.Empleado.models.service.airport.IAirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RestController
@Controller
@RequestMapping("/view")
public class AirportController {

    @Autowired
    private IAirportService iAirportService;

    @PostMapping("/creaairport")
    public ResponseEntity<Airport> createEmployee(@RequestBody Airport airport){
        return ResponseEntity.ok().body(this.iAirportService.createAirport(airport));
    }

    @GetMapping("/listaairport")
    public ResponseEntity<?> getAllAirport(){
        List<Airport> lista = iAirportService.listaAirport();
        if (lista.isEmpty()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok().body(iAirportService.listaAirport());
    }

    @GetMapping("/detalleairport/{id}")
    public ResponseEntity<Airport> getProductById(@PathVariable long id){
        return ResponseEntity.ok().body(iAirportService.buscarPorId(id));
    }
}
