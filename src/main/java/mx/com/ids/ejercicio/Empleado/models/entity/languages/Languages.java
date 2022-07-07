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

    @Column(name = "name_lang")
    private String name_lang;

    public Languages() {
    }

    public Languages(String name_lang) {
        this.name_lang = name_lang;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName_lang() {
        return name_lang;
    }

    public void setName_lang(String name_lang) {
        this.name_lang = name_lang;
    }

    @Override
    public String toString() {
        return "Languages{" +
                "id_languages=" + id_languages +
                ", code=" + code +
                ", name_lang='" + name_lang + '\'' +
                '}';
    }
}
