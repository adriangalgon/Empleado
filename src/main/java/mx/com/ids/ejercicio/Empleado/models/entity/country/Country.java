package mx.com.ids.ejercicio.Empleado.models.entity.country;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "country")
public class Country implements Serializable {

    @Id
    @Column(name = "id_country")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_country;

//    @Column(name = "idairport")
//    private int idairport;

    @Column(name = "code")
    private int code;

    @Column(name = "name_coun")
    private String name_coun;

    public Country(String name_coun) {
        this.name_coun = name_coun;
    }

    public Long getId_country() {
        return id_country;
    }

    public void setId_country(Long id_country) {
        this.id_country = id_country;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName_coun() {
        return name_coun;
    }

    public void setName_coun(String name_coun) {
        this.name_coun = name_coun;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id_country=" + id_country +
                ", code=" + code +
                ", name_coun='" + name_coun + '\'' +
                '}';
    }
}
