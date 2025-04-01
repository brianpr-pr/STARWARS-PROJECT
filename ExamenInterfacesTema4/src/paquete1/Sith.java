package paquete1;
/**
 * Clase Sith que dispone de un poder oscuro
 * @see Personaje
 * @version 31/03/2025
 * @since 29/03/2025
 */
class Sith extends Personaje {
    private String poderOscuro;
/**
 * Constructor Sith
 * @param nombre Nombre del Sith
 * @param especie Especie a la que pertenece
 * @param poderOscuro Poder oscuro de este Sith
 */
    public Sith(String nombre, String especie, String poderOscuro) {
        super(nombre, especie, "Sith");
        this.poderOscuro = poderOscuro;
    }

    /**
     * Usa habilidad especial
     * @see Personaje
     */
    @Override
    public void usarHabilidadEspecial() {
        System.out.println(nombre + " usa " + poderOscuro + " para atacar.");
    }

    /**
     * Corromper
     */
    public void corromper() {
        System.out.println(nombre + " intenta atraer a alguien al Lado Oscuro.");
    }

    /**
     * Dice la frase iconica de este personaje
     * @see SerGalactico
     */
    @Override
    public void hablarFraseIconica() {
        System.out.println(nombre + ": \"Si conocieras el poder del Lado Oscuro...\"");
    }

    /**
     * Lanza un rayo
     * @see SerGalactico
     */
    @Override
    public void realizarAccion() {
        System.out.println(nombre + " lanza un rayo Sith.");
    }
}
