package mx.com.ids.ejercicio.Empleado.controller.country;

import mx.com.ids.ejercicio.Empleado.models.entity.country.Country;
import mx.com.ids.ejercicio.Empleado.models.service.country.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("view")
public class CountryController {

    @Autowired
    ICountryService iCountryService;

    @GetMapping("/country")
    public String listarCountries(Model model){
        List<Country> listadoCountry = iCountryService.listaCountry();

        model.addAttribute("titulo", "Lista de Aeropuertos");
        model.addAttribute("countries", listadoCountry);

        return "/views/Countries";
    }

    @GetMapping("/country/{id}")
    public String editar(@PathVariable("id") Long idCountry, Model model, RedirectAttributes attribute){
        Country country = null;

        if (idCountry > 0){
            country = iCountryService.buscarPorId(idCountry);

            if (country == null){
                System.out.println("Error: El ID del país no existe!");
                attribute.addFlashAttribute("error","ATENCION: El ID del país no existe!");
                return "redirect:/view/country";
            }
        } else {
            System.out.println("Error: Error con el ID del country");
            attribute.addFlashAttribute("error", "ATENCION: Error con el ID del country");
            return "redirect:/view/country";
        }

        List<Country> listCountries = iCountryService.listaCountry();

        model.addAttribute("titulo", "Mostrar por ID");
        model.addAttribute("countries", country);

        return "/views/CountriesId";
    }
}
