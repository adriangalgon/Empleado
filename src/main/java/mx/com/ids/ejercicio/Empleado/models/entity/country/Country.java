package mx.com.ids.ejercicio.Empleado.models.entity.country;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "country")
public class Country implements Serializable {

    @Id
    @Column(name = "id_country")
    private Long id_country;

    @Column(name = "idairport")
    private int idairport;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    public Long getId_country() {
        return id_country;
    }

    public void setId_country(Long id_country) {
        this.id_country = id_country;
    }

    public int getIdairport() {
        return idairport;
    }

    public void setIdairport(int idairport) {
        this.idairport = idairport;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id_country=" + id_country +
                ", idairport=" + idairport +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
