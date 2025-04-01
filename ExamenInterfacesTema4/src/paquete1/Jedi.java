package paquete1;
/**
 * Clase Jedi que dispone de un contador de muertes y de numero de cirujias
 * @see Personaje
 * @version 31/03/2025
 * @since 29/03/2025
 */
class Jedi extends Personaje {
    private String colorSable;
    private int contadorMuertes;
    private int cirujias;
    /**
     * Constructor Jedi
     * @param nombre Nombre del Jedi
     * @param especie Especia a la que pertence
     * @param colorSable Color del sable del jedi
     */
    public Jedi(String nombre, String especie, String colorSable) {
        super(nombre, especie, "Jedi");
        this.colorSable = colorSable;
    }

    /**
     * Metodo para usar su habilidad especial
     * @see Personaje
     */
    @Override
    public void usarHabilidadEspecial() {
        System.out.println(nombre + " usa la Fuerza para mover objetos.");
    }

    /**
     * Jedi medita
     */
    public void meditar() {
        System.out.println(nombre + " está meditando para fortalecer su conexión con la Fuerza.");
    }
/**
 * Frase iconica del jedi
 * @see SerGalactico
 */
    @Override
    public void hablarFraseIconica() {
        System.out.println(nombre + ": \"Que la Fuerza te acompañe.\"");
    }
    
    /**
     * Accion realizada por el jedi
     * @see SerGalactico
     */
    @Override
    public void realizarAccion() {
        System.out.println(nombre + " enciende su sable láser de color " + colorSable + ".");
    }
}