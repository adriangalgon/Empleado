package mx.com.ids.ejercicio.Empleado.controller.employee;

import mx.com.ids.ejercicio.Empleado.models.entity.employee.Employee;
import mx.com.ids.ejercicio.Empleado.models.service.employee.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("view")
public class EmployeeController {

    @Autowired
    private IEmployeeService iEmployeeService;

    @PostMapping("/creaemployee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        return ResponseEntity.ok().body(this.iEmployeeService.createUser(employee));
    }

    @GetMapping("/listaemployee")
    public ResponseEntity<?> getAllEmployee(){
        List<Employee> lista = iEmployeeService.listaEmpleado();
        if (lista.isEmpty()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok().body(iEmployeeService.listaEmpleado());
    }

    @GetMapping("/detalleemployee/{id}")
    public ResponseEntity<Employee> getProductById(@PathVariable long id){
        return ResponseEntity.ok().body(iEmployeeService.buscarPorId(id));
    }
}
