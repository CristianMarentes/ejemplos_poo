 package ejemplo_poo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Practica
 */
public class Ejemplo_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int control = 5;
        Scanner sc = new Scanner(System.in);/*agarra looq ue el usuario le pone */
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
        ArrayList<Docente> listaDocentes = new ArrayList<Docente>();
        ////////////////////////*
        ///
        ///
        ///
        ///*Agregar *////
        ///
        ///
        while (control == 5)/*agregar estudiante*/
        {
            Docente d1 = new Docente();
            System.out.println("Ingrese la identificación del Docente:");
            d1.setIdentificacion(sc.next());
            System.out.println("Ingrese el nombre:");
            d1.setNombre(sc.next());
            System.out.println("Ingrese el Apellido");
            d1.setApellido(sc.next());
            System.out.println("Ingrese la Edad del Doocente:");
            d1.setEdad(sc.nextInt());
            
            listaDocentes.add(d1);
            
            System.out.println(" ");
            System.out.println("Ingresar otro Docente?");
            System.out.println("5 - Para agregar");
            System.out.println("1 - Para agregar estudiante");
            System.out.println("0 - Para salir");
            control = sc.nextInt();
            System.out.println("Control   " + control);
        }
        ///
        ///
        
        while (control == 1)/*agregar estudiante*/
        {
            Estudiante e1 = new Estudiante();
            System.out.println("Ingrese la identificación del Estudiante:");
            e1.setIdentificacion(sc.next());
            System.out.println("Ingrese el nombre:");
            e1.setNombre(sc.next());
            System.out.println("Ingrese el Apellido");
            e1.setApellido(sc.next());
            System.out.println("Ingrese la Edad del Estudiante:");
            e1.setEdad(sc.nextInt());
            
            int controlMat = 0;
            while (controlMat == 0)/*Agrega materia*/
            {
                System.out.println("::AGREGAR MATERIAS::");
                Materia mat1 = new Materia();
                System.out.println("Ingrese el codigo de la Materia:");
                mat1.setCodigo(sc.next());
                System.out.println("Ingrese el nombre de la Materia:");
                mat1.setNombre(sc.next());
                System.out.println("Ingrese la calificacion Materia:");
                mat1.setNota(sc.nextInt());
                
                System.out.println("::AGREGAR DOCENTE::");
                Docente d1 = new Docente();
                d1.setIdentificacion("5896");
                d1.setNombre("Nixon");
                d1.setEdad(40);
                d1.setSalario(3500);
                listaDocentes.add(d1);
                mat1.setDocenteResponsable(d1);
                
                e1.agregarMateria(mat1);
                System.out.println(" ");
                System.out.println("Ingresar otra Materia?");
                System.out.println("0 - Para agregar");
                System.out.println("1 - Para salir");
                controlMat = sc.nextInt();
            }
            
            listaEstudiantes.add(e1);/* Menu para agregar otro estuante */
            System.out.println(" ");
            System.out.println("Ingresar otro Estudiante?");
            System.out.println("1 - Para agregar");
            System.out.println("0 - Para salir");
            control = sc.nextInt();
        }
        
        System.out.println("::::::::::::::::::::::::::");
        
        while (control == 0)
        {
            int opcion = 0;
            System.out.println(":: M E N U ::");
            System.out.println("1 - Para Imprimir Estudiantes");
            System.out.println("2 - Para Imprimir Docentes");
            System.out.println("3 - Para Imprimir Promedio por Estudiante");
            System.out.println("4 - Para Imprimir Promedio Edad Docente");
            System.out.println("20 - Para SALIR");
            
            opcion = sc.nextInt();
            
            switch (opcion)
            {
                case 1: imprimirEstudiantes(listaEstudiantes);
                            break;
                case 2: imprimirDocentes(listaDocentes);
                            break;
                /*case 3: //Llamar a la funcion para calcular promedio por Estudiante
                    break;
                case 4: //Llamar a la funcion para calcular promedeio de edad de los Docentes
                    break;*/
                case 20: control = 1;
                    break;
                default: System.out.println("Ingrese una opcion valida...");
                
            }
            System.out.println(" ");
                    
        }
        
        
    }
    //////////////////////////////////////
    ///
    ///
    ///
    ///*Metodos imprimir*///
    ///
    ///
    ///
    ///
    //////////////////////////////////////////
    ///
    ///imprimir estudiantes*////////
    ///
    public static void imprimirEstudiantes(ArrayList<Estudiante> est)
    {
        System.out.println("::LISTA DE ESTUDIANTES::");
        
        for (Estudiante est1 : est)
        {
            System.out.println("-> " + est1.getIdentificacion()
                + " - " + est1.getNombre()
                + " - " + est1.getApellido()
                + " - " + est1.getEdad());
            for (Materia mat1 : est1.getListaMaterias())
            {
                System.out.println("---> " + mat1.getCodigo()
                + " - " + mat1.getNombre()
                + " - " + mat1.getNota() 
                        + " - Docente: " + mat1.getDocenteResponsable().getNombre());
            }
        }
    }
    
    ///
    ///
    ////* SSSSSSSSSSIIIIIIIIIIIIRVEEEEEEEEEEEEEEE */
    ///
    
    public static void imprimirDocentes(ArrayList<Docente> doc)
    {
        System.out.println("::LISTA DE DOCENTES::");
        
        for (Docente doc1 : doc)
        {
            System.out.println("-> " + doc1.getIdentificacion()
                + " - " + doc1.getNombre()
                + " - " + doc1.getApellido()
                + " - " + doc1.getEdad());
        }
    }/////////////////////////////////////////////
}
