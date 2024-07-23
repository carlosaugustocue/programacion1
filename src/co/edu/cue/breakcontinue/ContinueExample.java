package co.edu.cue.breakcontinue;

public class ContinueExample {
    public void usarContinue() {
        int[] numeros = {1, 2, 3, 4, 5};

        for (int numero : numeros) {
            if (numero == 3) {
                continue; // Saltar el resto del código en esta iteración cuando el número es 3
            }
            System.out.println("Número: " + numero);
        }
        System.out.println("Bucle completado.");
    }
}

