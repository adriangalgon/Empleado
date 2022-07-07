package mx.com.ids.ejercicio.Empleado.models.entity.airport;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "airport")
public class Airport  implements Serializable {

    @Id
    @Column(name = "id_airport")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_airport;

    @Column(name = "name_air")
    private String name_air;

    public Airport() {
    }

    public Airport(String name_air) {
        this.name_air = name_air;
    }

    public Long getId_airport() {
        return id_airport;
    }

    public void setId_airport(Long id_airport) {
        this.id_airport = id_airport;
    }

    public String getName_air() {
        return name_air;
    }

    public void setName_air(String name_air) {
        this.name_air = name_air;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "id_airport=" + id_airport +
                ", name='" + name_air + '\'' +
                '}';
    }
}
