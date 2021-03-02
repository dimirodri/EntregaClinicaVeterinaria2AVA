package gestion;

import java.io.Serializable;
/**
 * 
 * @author drodrigueza
 * 
 * @version 1.0
 */
public class Persona implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;
    /**
     * Constructor de la clase persona
     * @param nombre el nombre de la persona en cuestion
     * @param apellidos los apellidos de la persona en cuestion
     * @param dni el dni de la persona en cuestion
     * @param edad la edad de la persona en cuestion
     */
    public Persona(String nombre, String apellidos, String dni, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }
    /**
     * 
     * @return metodo que nos devuelve el nombre de la persona
     */

    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre metodo para cambiar de nombre a la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return metodo para obtener los apellidos de la persona
     */
    public String getApellidos() {
        return apellidos;
    }
    /**
     * 
     * @param apellidos metodo para cambiar los apellidos de la persona
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    /**
     * 
     * @return metodo para obtener el dni de la persona
     */
    public String getDni() {
        return dni;
    }
    
    /**
     * 
     * @param dni metodo para cambiar el dni de la persona
     */
    public void setDni(String dni) {
        this.dni = dni;
    }
    /**
     * 
     * @return metodo que te devuelve la edad de una persona
     */

    public int getEdad() {
        return edad;
    }
    /**
     * 
     * @param edad metodo que te devuelve la edad de la persona
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * metodo para saber el año de nacimiento de la persona
     * @param anyoactual parametro del año actual
     * @return
     */
    public int dameAnyoNacimiento(int anyoactual) {
        return (anyoactual - this.getEdad());
    }
    /**
     * Visualizacion de Persona
     */
    @Override
    public String toString() {
        return("Nombre: " + nombre + " Apellidos: " + apellidos + " DNI: " + dni + " Edad: " + edad);        
    }
    
}