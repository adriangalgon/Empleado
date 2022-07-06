package mx.com.ids.ejercicio.Empleado.controller.language;

import mx.com.ids.ejercicio.Empleado.models.entity.languages.Languages;
import mx.com.ids.ejercicio.Empleado.models.service.languages.ILanguagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("view")
public class LanguageController {

    @Autowired
    ILanguagesService iLanguagesService;

    @PostMapping("/crealanguage")
    public ResponseEntity<Languages> createLanguages(@RequestBody Languages languages){
        return ResponseEntity.ok().body(this.iLanguagesService.createLanguage(languages));
    }

    @GetMapping("/listalanguages")
    public ResponseEntity<?> getAllLanguages(){
        List<Languages> lista = iLanguagesService.listaIdioma();
        if (lista.isEmpty()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok().body(iLanguagesService.listaIdioma());
    }

    @GetMapping("/detallelanguages/{id}")
    public ResponseEntity<Languages> getLanguagesById(@PathVariable long id){
        return ResponseEntity.ok().body(iLanguagesService.buscarPorId(id));
    }

}
