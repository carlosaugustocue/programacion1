package co.edu.cue.breakcontinue;

public class BreakExample {
    public void usarBreak() {
        int[] numeros = {1, 2, 3, 4, 5};

        for (int numero : numeros) {
            if (numero == 3) {
                break; // Salir del bucle cuando el número es 3
            }
            System.out.println("Número: " + numero);
        }
        System.out.println("Bucle terminado.");
    }
}

