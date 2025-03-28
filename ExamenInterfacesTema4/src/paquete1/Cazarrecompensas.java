package paquete1;

class Cazarrecompensas extends Personaje {
    private String armaFavorita;

    public Cazarrecompensas(String nombre, String especie, String armaFavorita) {
        super(nombre, especie, "Cazarrecompensas");
        this.armaFavorita = armaFavorita;
    }

    @Override
    public void usarHabilidadEspecial() {
        System.out.println(nombre + " rastrea a su objetivo con precisión.");
    }

    public void capturarObjetivo() {
        System.out.println(nombre + " captura a su objetivo y lo congela en carbonita.");
    }

    @Override
    public void hablarFraseIconica() {
        System.out.println(nombre + ": \"Soy solo un hombre haciendo su trabajo.\"");
    }

    @Override
    public void realizarAccion() {
        System.out.println(nombre + " dispara con su " + armaFavorita + ".");
    }
    
    //Añadido para la prueba
    public void grito(Cazarrecompensas enemigo) { //(String nombre, String especie, String afiliacion) 
    	System.out.println("Mi nombre es: " + nombre);
    	System.out.println("El de mi enemigo es: " + enemigo.nombre);
    }
    
    
    
    
    
    
}

/* Metodos de refactorizacion :
* Encapsulate fields
* use supertype if possible
*
*/