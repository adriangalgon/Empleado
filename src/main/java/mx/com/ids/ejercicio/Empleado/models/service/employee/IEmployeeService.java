package mx.com.ids.ejercicio.Empleado.models.service.employee;

import mx.com.ids.ejercicio.Empleado.models.entity.employee.Employee;

import java.util.List;

public interface IEmployeeService {

    Employee createUser(Employee employee);

    List<Employee> listaEmpleado();

    Employee buscarPorId(Long id);

}
