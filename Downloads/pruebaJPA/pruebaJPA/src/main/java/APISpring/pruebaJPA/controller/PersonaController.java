
package APISpring.pruebaJPA.controller;

import APISpring.pruebaJPA.model.Persona;
import APISpring.pruebaJPA.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonaController {
    
    @Autowired
    private IPersonaService persoServ;
    
    @GetMapping("/personas/traer")
    public List <Persona> getPersona(){
    
        return persoServ.getPersonas();
    }
    
    @PostMapping("/personas/crear")
    public String crearPersona(@RequestBody Persona perso ){
        
       persoServ.savePersona(perso);
       return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
    
        persoServ.deletePersona(id);
        
        return "La persona fue eliminada correctamente";
    }
    
    @PutMapping("/personas/actualizar/{id}")
    public Persona actualizarPersona(@PathVariable Long id, 
        @RequestParam(required = false, name="nombre") String nuevo_nombre,
        @RequestParam(required = false, name="apellido") String nuevo_apellido,
        @RequestParam(required = false, name="edad") Integer nueva_edad) {
        persoServ.editarPersona(id, nuevo_nombre, nuevo_apellido, nueva_edad);
        
        Persona person = persoServ.leerPorPersona(id);
        return person;
    }
         
    
}
