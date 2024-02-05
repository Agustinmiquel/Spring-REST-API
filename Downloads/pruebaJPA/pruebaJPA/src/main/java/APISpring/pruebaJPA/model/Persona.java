
package APISpring.pruebaJPA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.List;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private long id;
    private String  nombre;
    private String apellido;
    private int edad;
    @OneToMany
    private List <Mascota> miMascota;

    public Persona() {
    }

    public Persona(long id, String nombre, String apellido, int edad, List <Mascota> miMascota) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.miMascota = miMascota;
    }

    
}
