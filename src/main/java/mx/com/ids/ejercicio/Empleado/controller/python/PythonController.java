package mx.com.ids.ejercicio.Empleado.controller.python;

import mx.com.ids.ejercicio.Empleado.models.entity.airport.Airport;
import mx.com.ids.ejercicio.Empleado.models.entity.country.Country;
import mx.com.ids.ejercicio.Empleado.models.entity.employee.Employee;
import mx.com.ids.ejercicio.Empleado.models.entity.languages.Languages;
import mx.com.ids.ejercicio.Empleado.models.service.airport.IAirportService;
import mx.com.ids.ejercicio.Empleado.models.service.country.ICountryService;
import mx.com.ids.ejercicio.Empleado.models.service.employee.IEmployeeService;
import mx.com.ids.ejercicio.Empleado.models.service.languages.ILanguagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/apiv1/clientes")
public class PythonController {

    @Autowired
    private IAirportService airportService;

    @Autowired
    private ICountryService countryService;

    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private ILanguagesService languagesService;

    @PostMapping("/add")
    public HttpStatus data(@RequestBody HashMap<String, Object> JSonObj){

        Airport airport = new Airport((String) JSonObj.get("name_air"));
        Country country = new Country((String) JSonObj.get("name_coun"));
        Employee employee = new Employee((String) JSonObj.get("firstname"), (String) JSonObj.get("surname"));
        Languages languages = new Languages((String) JSonObj.get("name_lang"));

        String w = String.valueOf(this.airportService.createAirport(airport));
        String x = String.valueOf(this.countryService.createCountry(country));
        String y = String.valueOf(this.employeeService.createUser(employee));
        String z = String.valueOf(this.languagesService.createLanguage(languages));

        return HttpStatus.OK;
    }

}
