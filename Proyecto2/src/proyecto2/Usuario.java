
package proyecto2;

import java.io.Serializable;

/**
 *
 * @author natalia
 */
public class Usuario implements Serializable {
    
   protected String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
