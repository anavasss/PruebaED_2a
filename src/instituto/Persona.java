/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Persona implements Comparable<Persona> {

	/*
	 * Variables (un dni de la clase Nif, el nombre de la persona, el genero, y el localdate de la fecha de nacimiento).
	 */
    private Nif nif;
    private String nombre;
    private char genero;
    private LocalDate nacimiento;

    
    /*
     * Documentar y crear test unitario
     * Se crea la persona con los valores en blanco.
     */
    public Persona() {
        nif = new Nif();
        nombre = "";
        genero = ' ';
        nacimiento = LocalDate.of(1990, 1, 1);
    }

    /*
     * Se crea la persona con los valores en blanco menos el Nif, que lo mete el usuario.
     */
    public Persona(int nif) {
        this();
        this.nif = new Nif(nif);
    }

    /*
     * Se crea la persona con todas las variables.
     */
    public Persona(int nif, String nombre, char genero,
            int dia, int mes, int ano) {
        this.nif = new Nif(nif);
        this.nombre = nombre;
        this.genero = genero;
        this.nacimiento
                = LocalDate.of(ano, mes, dia);
    }

    /*
     * Documentar y crear test unitario
     * Devuelve el Nif.
     */
    public Nif getNif() {
        return nif;
    }

    /*
     * Pone un Nif.
     */
    public void setNif(Nif nif) {
        this.nif = nif;
    }

    /*
     * Devuelve el nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /*
     * Pone un nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*
     * Devuelve el genero.
     */
    public char getGenero() {
        return genero;
    }

    /*
     * Pone el genero.
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /*
     * Devuelve la fecha de nacimiento.
     */
    public LocalDate getNacimiento() {
        return nacimiento;
    }

    /*
     * Pone una fecha de nacimiento.
     */
    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    /*
     * Devuelve la edad.
     */
    public int getEdad() {
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    /*
     * Un toString con los valores de persona.
     */
    @Override
    public String toString() {
        if (nombre.split(" ").length > 1) {
            return nif + "\t" + nombre.split(" ")[0]
                    + '\t' + nombre.split(" ")[1] + "\t\t" + getEdad();
        } else {
            return nif + "\t" + nombre + "\t\t\t" + getEdad();
        }
    }

    /*
     * Devuelve true or false depende de si el Nif de la persona es igual a el Nif de la introducida.
     */
    public boolean equals(Persona a) {
        if (a == null) {
            return false;
        }
        return a.nif.toString().equals(this.nif.toString());
    }

    /*
     * Devuelve true or false depende de si la persona es igual a la introducida.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;

        return Objects.equals(this.nif, other.nif);
    }

    /*
     * Devuelve 0, 1 o -1 (compareTo) depende de si el Nif de la persona va antes, despues, o es igual a el de la introducida.
     */
    @Override
    public int compareTo(Persona o) {
        return this.nif.toString().compareTo(o.nif.toString());
    }

}
