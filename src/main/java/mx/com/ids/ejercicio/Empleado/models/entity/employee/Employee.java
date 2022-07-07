package mx.com.ids.ejercicio.Empleado.models.entity.employee;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {

    @Id
    @Column(name = "id_employee")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_employee;

    @Column(name = "surname")
    private String surname;

    @Column(name = "firstname")
    private String firstname;

    public Employee() {
    }

    public Employee(String surname, String firstname) {
        this.surname = surname;
        this.firstname = firstname;
    }

    public Long getId_employee() {
        return id_employee;
    }

    public void setId_employee(Long id_employee) {
        this.id_employee = id_employee;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id_employee=" + id_employee +
                ", surname='" + surname + '\'' +
                ", firstname='" + firstname + '\'' +
                '}';
    }
}
