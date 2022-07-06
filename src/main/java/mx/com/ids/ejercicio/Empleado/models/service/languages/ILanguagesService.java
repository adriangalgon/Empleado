package mx.com.ids.ejercicio.Empleado.models.service.languages;

import mx.com.ids.ejercicio.Empleado.models.entity.employee.Employee;
import mx.com.ids.ejercicio.Empleado.models.entity.languages.Languages;

import java.util.List;

public interface ILanguagesService {

    Languages createLanguage(Languages languages);

    public List<Languages> listaIdioma();

    public Languages buscarPorId(Long id);

}
