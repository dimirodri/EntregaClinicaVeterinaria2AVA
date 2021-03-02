package gestion;

import java.io.Serializable;
/**
 * 
 * @author drodrigueza
 *
 *@version 1.0
 */
public class Mascota implements Serializable{

	private long ID;
    private String nombre;
    private int edad;
    private String raza;
    private Persona duenyo;

    /**
     * 
     * @param ID la id de la mascota
     * @param nombre el nombre de la mascota
     * @param edad la edad de la mascota
     * @param raza la raza de la mascota
     * @param duenyo el dueño de la mascota
     */
    public Mascota(long ID, String nombre, int edad, String raza, Persona duenyo) {
    	this.setID(ID);
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.duenyo = duenyo;
    }
    /**
     * Metodo que te devuelve el nombre de la mascota
     * @return
     */

    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre metodo para cambiar el nombre del animal
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return metodo para obtener la edad del animal
     */
    public int getEdad() {
        return edad;
    }
    /**
     * 
     * @param edad metodo para cambiar la edad del animal
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     *  
     * @return metodo para obtener la raza del animal
     */
    public String getRaza() {
        return raza;
    }
    /**
     * 
     * @param raza metodo para establecer la raza del animal
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }
    /**
     * 
     * @return metodo para obtener el dueño del animal
     */
    public Persona getDuenyo() {
        return duenyo;
    }
    /**
     * 
     * @param duenyo metodo para establecer el dueño del animal
     */
    public void setDuenyo(Persona duenyo) {
        this.duenyo = duenyo;
    }
    /**
     * Metodo para mostrar Animal
     */
    @Override
    public String toString() {
        return ("Nombre: " + nombre + " Edad: " + edad + " Raza: " + raza + " Due�o: " + duenyo.toString());
    }

	private long getID() {
		return ID;
	}

	private void setID(long iD) {
		this.ID = iD;
	}
	
	public boolean repira() {
		//aqu� vendr�a el c�digo para la respiraci�n
		return true;
	}

	public boolean come(float cantidad) {
		//aqu� vendr�a el c�digo para ver lo que comen
		return true;
		
	}
}