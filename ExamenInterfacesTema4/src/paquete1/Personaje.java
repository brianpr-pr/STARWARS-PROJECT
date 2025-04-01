package paquete1;


/**
 * Clase Personaje implements {@link SerGalactico}
 * @version 31/03/2025
 * @since 29/03/2025
 */

public abstract class Personaje implements SerGalactico {
    /**
     * Nombre del personaje
     */
	protected String nombre;
    /**
     * Especie del Personaje
     */
    protected String especie;
/**
 * Afiliacion del Personaje
 */
    protected String afiliacion; // Jedi, Sith, Cazarrecompensas, etc.
   /**
    * Nombre del perro del personaje
    */
    private String nombreDelPerro;
    
    
    
    /**
     * Constructor para Personaje
     * @param nombre Nombre del personaje
     * @param especie Especia a la que pertenece el personaje
     * @param afiliacion Grupo al que esta afiliado el personaje
     */
    public Personaje(String nombre, String especie, String afiliacion) {
        this.nombre = nombre;
        this.especie = especie;
        this.afiliacion = afiliacion;
    }
    /**
     * Metodo para sobreescribir
     */
    public abstract void usarHabilidadEspecial(); // Método abstracto

    /**
     * Metodo que muestra los datos de nuestro personaje
     */
    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Afiliación: " + afiliacion);
    }
}
