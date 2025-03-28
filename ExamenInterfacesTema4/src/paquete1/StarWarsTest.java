package paquete1;



public class StarWarsTest {
    public static void main(String[] args) {
        Jedi luke = new Jedi("Luke Skywalker", "Humano", "Verde");
        Sith vader = new Sith("Darth Vader", "Humano", "Estrujar con la Fuerza");
        Cazarrecompensas boba = new Cazarrecompensas("Boba Fett", "Mandaloriano", "Bláster EE-3");

        System.out.println("Información de los personajes:\n");

        luke.mostrarInfo();
        luke.usarHabilidadEspecial();
        luke.meditar();
        luke.hablarFraseIconica();
        luke.realizarAccion();

        System.out.println("\n");

        vader.mostrarInfo();
        vader.usarHabilidadEspecial();
        vader.corromper();
        vader.hablarFraseIconica();
        vader.realizarAccion();

        System.out.println("\n");

        boba.mostrarInfo();
        boba.usarHabilidadEspecial();
        boba.capturarObjetivo();
        boba.hablarFraseIconica();
        boba.realizarAccion();
        boba.grito(luke);
    }
}


/*
EJEMPLOS DE SALIDAS POR CONSOLA


Información de los personajes:

Nombre: Luke Skywalker
Especie: Humano
Afiliación: Jedi
Luke Skywalker usa la Fuerza para mover objetos.
Luke Skywalker está meditando para fortalecer su conexión con la Fuerza.
Luke Skywalker: "Que la Fuerza te acompañe."
Luke Skywalker enciende su sable láser de color Verde.


Nombre: Darth Vader
Especie: Humano
Afiliación: Sith
Darth Vader usa Estrujar con la Fuerza para atacar.
Darth Vader intenta atraer a alguien al Lado Oscuro.
Darth Vader: "Si conocieras el poder del Lado Oscuro..."
Darth Vader lanza un rayo Sith.


Nombre: Boba Fett
Especie: Mandaloriano
Afiliación: Cazarrecompensas
Boba Fett rastrea a su objetivo con precisión.
Boba Fett captura a su objetivo y lo congela en carbonita.
Boba Fett: "Soy solo un hombre haciendo su trabajo."
Boba Fett dispara con su Bláster EE-3.

 */