package mx.com.ids.ejercicio.Empleado.models.repository.employee;

import mx.com.ids.ejercicio.Empleado.models.entity.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee,Long> {
}
