package mx.com.ids.ejercicio.Empleado.models.entity.airport;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "airport")
public class Airport  implements Serializable {

    @Id
    @Column(name = "id_airport")
    private Long id_airport;

    @Column(name = "name")
    private String name;

    public Long getId_airport() {
        return id_airport;
    }

    public void setId_airport(Long id_airport) {
        this.id_airport = id_airport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "id_airport=" + id_airport +
                ", name='" + name + '\'' +
                '}';
    }
}
