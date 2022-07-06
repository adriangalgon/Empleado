package mx.com.ids.ejercicio.Empleado.models.service.languages;

import java.util.List;

import mx.com.ids.ejercicio.Empleado.models.entity.languages.Languages;

public interface ILanguagesService {

    Languages createLanguage(Languages languages);

    public List<Languages> listaIdioma();

    public Languages buscarPorId(Long id);

}
