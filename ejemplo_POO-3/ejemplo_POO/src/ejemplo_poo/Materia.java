package ejemplo_poo;

/**
 *
 * @author Practica
 */
public class Materia {
    private String codigo = null;
    private String nombre = null;
    private double nota = 0;
    
    private Docente docenteResponsable = new Docente();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Docente getDocenteResponsable() {
        return docenteResponsable;
    }

    public void setDocenteResponsable(Docente docenteResponsable) {
        this.docenteResponsable = docenteResponsable;
    }
    
    
}
