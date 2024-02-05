
package APISpring.pruebaJPA.service;

import APISpring.pruebaJPA.model.Mascota;
import java.util.List;


public interface IMascotaService {
    
    //método para traer a todas las mascota
    //lectura
    public List<Mascota> getMascotas();

    //alta
    public void saveMascota(Mascota masco);

    //baja
    public void deleteMascota(Long id_mascota);

    //lectura de un solo objeto
    public Mascota findMascota(Long id_mascota);

    //edición/modificación
    public void editMascota(Long idOriginal, Long id_mascotaNueva,
                            String nuevoNombre,
                            String nuevaEspecie,
                            String nuevaRaza,
                            String nuevoColor);
    
}
