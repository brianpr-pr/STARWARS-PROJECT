package paquete1;
/**
 * Clase Cazarrecompensas que hereda de {@link Personaje}
 */
class Cazarrecompensas extends Personaje {
    private String armaFavorita;
    /**
     * Construcor de Cazarrecompensas
     * @param nombre Nombre del cazarrecompensas
     * @param especie Especia a la que pertenece el cazarrecompensas
     * @param armaFavorita Arma favorita del cazarrecompensas
     */
    public Cazarrecompensas(String nombre, String especie, String armaFavorita) {
        super(nombre, especie, "Cazarrecompensas");
        this.armaFavorita = armaFavorita;
    }

    /**
     * Metodo en el que se usa su habilidad 
     */
    @Override
    public void usarHabilidadEspecial() {
        System.out.println(nombre + " rastrea a su objetivo con precisión.");
    }

    /**
     * Metodo para capturar el objetivo 
     */
    public void capturarObjetivo() {
        System.out.println(nombre + " captura a su objetivo y lo congela en carbonita.");
    }

    /**
     * Metodo para hablar  
     * see SerGalactico
     */
    @Override
    public void hablarFraseIconica() {
        System.out.println(nombre + ": \"Soy solo un hombre haciendo su trabajo.\"");
    }
    
    /**
     * Metodo para capturar el objetivo 
     * see SerGalactico
     */
    @Override
    public void realizarAccion() {
        System.out.println(nombre + " dispara con su " + armaFavorita + ".");
    }

    /**
     * Metodo que nos muestra el enemigo
     * @param luke referencia a {@link Personaje} 
     */
    public void grito(Personaje luke) { //(String nombre, String especie, String afiliacion) 
    	System.out.println("Mi nombre es: " + nombre);
    	System.out.println("El de mi enemigo es: " + luke.nombre);
    }
}