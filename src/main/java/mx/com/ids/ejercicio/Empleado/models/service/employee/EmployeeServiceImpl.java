package mx.com.ids.ejercicio.Empleado.models.service.employee;

import mx.com.ids.ejercicio.Empleado.models.entity.employee.Employee;
import mx.com.ids.ejercicio.Empleado.models.repository.employee.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

    @Autowired
    private IEmployeeRepository iEmployeeRepository;

    @Override
    public Employee createUser(Employee employee) {
        return  iEmployeeRepository.save(employee);
    }

    @Override
    public List<Employee> listaEmpleado() {
        return (List<Employee>) iEmployeeRepository.findAll();
    }

    @Override
    public Employee buscarPorId(Long id) {
        return iEmployeeRepository.findById(id).orElse(null);
    }
}
