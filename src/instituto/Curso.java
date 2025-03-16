/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

import java.util.TreeSet;

/**
 *
 * @author ProfDiurno
 */
public class Curso {

	/*
	 * Variables (un string que es el nombre, y una coleccion de todos los alumnos).
	 */
    private String nombre;
    private TreeSet<Persona> listaAlumnos;

    /*
     * Documentar y crear test unitario
     * (Se devuelve el nombre del curso).
     */
    protected String getNombre() {
        return nombre;
    }

    
    /*
     * Documentar y crear test unitario
     * (Se crea el curso con el nombre del mismo).
     */
    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }

    /*
     * Se hace un toString para mostrar por pantalla posteriormente.
     */
    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }

    /*
     * Se manda la persona que se quiere añadir al curso y se añade.
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }
}
