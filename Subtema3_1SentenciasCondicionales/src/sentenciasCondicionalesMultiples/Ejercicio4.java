package sentenciasCondicionalesMultiples;

import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio4 {

    public static void main(String[] args) {
        String[] palos = {"Picas ♠", "Corazones ♥", "Diamantes ♦", "Tréboles ♣"};
        String[] cartas = {
            "As", "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jota", "Reina", "Rey"
        };

        // Un número aleatorio entre 0 y 51 representa una carta de la baraja.
        int numero = ThreadLocalRandom.current().nextInt(52);

        int indicePalo = numero / 13;
        int indiceCarta = numero % 13;

        System.out.println(cartas[indiceCarta] + " de " + palos[indicePalo]);
    }
}
