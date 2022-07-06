package mx.com.ids.ejercicio.Empleado.models.service.languages;

import mx.com.ids.ejercicio.Empleado.models.entity.languages.Languages;
import mx.com.ids.ejercicio.Empleado.models.repository.languages.ILanguagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguagesServiceImpl implements ILanguagesService{

    @Autowired
    ILanguagesRepository iLanguagesRepository;

    @Override
    public Languages createLanguage(Languages languages) {
        return iLanguagesRepository.save(languages);
    }

    @Override
    public List<Languages> listaIdioma() {
        return (List<Languages>) iLanguagesRepository.findAll();
    }

    @Override
    public Languages buscarPorId(Long id) {
        return iLanguagesRepository.findById(id).orElse(null);
    }
}
