package ejemplo_poo;

import java.util.ArrayList;

/**
 *
 * @author Practica
 */
public class Estudiante extends Persona{
    
    private ArrayList<Materia> listaMaterias = new ArrayList<Materia>();
    private int calificacion = 0;

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public ArrayList<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(ArrayList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }
    
    public void agregarMateria(Materia mate){
        this.listaMaterias.add(mate);
    }
}
