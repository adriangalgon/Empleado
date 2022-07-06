package mx.com.ids.ejercicio.Empleado.models.repository.languages;

import mx.com.ids.ejercicio.Empleado.models.entity.languages.Languages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILanguagesRepository extends JpaRepository<Languages, Long> {
}
