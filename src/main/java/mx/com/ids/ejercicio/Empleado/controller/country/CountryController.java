package mx.com.ids.ejercicio.Empleado.controller.country;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import mx.com.ids.ejercicio.Empleado.models.entity.country.Country;
import mx.com.ids.ejercicio.Empleado.models.service.country.ICountryService;

@Controller
@RequestMapping("view")
public class CountryController {

    @Autowired
    private ICountryService iCountryService;

    @PostMapping("/creacountry")
    public ResponseEntity<Country> createEmployee(@RequestBody Country country){
        return ResponseEntity.ok().body(this.iCountryService.createCountry(country));
    }

    @GetMapping("/listacountry")
    public ResponseEntity<?> getAllCountry(){
        List<Country> lista = iCountryService.listaCountry();
        if (lista.isEmpty()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok().body(iCountryService.listaCountry());
    }

    @GetMapping("/detallecountry/{id}")
    public ResponseEntity<Country> getCountryById(@PathVariable long id){
        return ResponseEntity.ok().body(iCountryService.buscarPorId(id));
    }
}
