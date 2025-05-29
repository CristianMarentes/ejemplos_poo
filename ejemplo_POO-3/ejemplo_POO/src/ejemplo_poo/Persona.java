package ejemplo_poo;

/**
 *
 * @author Practica
 */
public class Persona {
    private String identificacion = null;
    private String nombre = null;
    private String apellido = null;
    private int edad = 0;

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void toString(Persona p)
    {
        System.out.println(p.identificacion + " - "
            + p.nombre + " - " + p.apellido + " - "
                + p.edad);
    }
    
}
