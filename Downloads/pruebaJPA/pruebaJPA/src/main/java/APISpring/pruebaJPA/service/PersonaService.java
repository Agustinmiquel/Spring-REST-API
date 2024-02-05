
package APISpring.pruebaJPA.service;

import APISpring.pruebaJPA.model.Persona;
import APISpring.pruebaJPA.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaService implements IPersonaService {
   
    @Autowired
    private IPersonaRepository persoRepo;

    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersonas = persoRepo.findAll();
        return listaPersonas;
    }

    @Override
    public void savePersona(Persona perso) {
        persoRepo.save(perso);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona leerPorPersona(Long id) {
       Persona perso = persoRepo.findById(id).orElse(null);
        return perso;
    }

    @Override
    public void editarPersona(Long idOriginal, String nombre, String apellido, int edad) {
        //busco el objeto persona
        Persona perso = this.leerPorPersona(idOriginal);
        
        //guardar datos nuevos
        perso.setNombre(nombre);
        perso.setEdad(edad);
        perso.setApellido(apellido);
        
        //guardar
        this.savePersona(perso);
    }
    
}
