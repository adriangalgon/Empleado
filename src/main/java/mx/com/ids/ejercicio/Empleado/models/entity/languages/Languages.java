package mx.com.ids.ejercicio.Empleado.models.entity.languages;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "languages")
public class Languages implements Serializable {

    @Id
    @Column(name = "id_languages")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_languages;

    @Column(name = "code")
    private int code;

    @Column(name = "name")
    private String name;

    public Long getId_languages() {
        return id_languages;
    }

    public void setId_languages(Long id_languages) {
        this.id_languages = id_languages;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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
        return "Languages{" +
                "id_languages=" + id_languages +
                ", code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}
