
package APISpring.pruebaJPA.service;

import APISpring.pruebaJPA.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    //metodo para traer a todas las personas
    
    //lectura
    public List<Persona> getPersonas();
    
    //alta
    public void savePersona(Persona perso);
    
    //baja
    public void deletePersona(Long id);
    
    public Persona leerPorPersona(Long id);
    
    //edicion-modificar
    public void editarPersona(Long idOriginal, String nombre, String apellido, int edad);
}
