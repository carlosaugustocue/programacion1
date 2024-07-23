package co.edu.cue.foreach;

public class ForeachExample {
    public void mostrarNumeros() {
        // Crear un array de enteros
        int[] numeros = {1, 2, 3, 4, 5};

        // Usar foreach para iterar sobre los elementos del array
        for (int numero : numeros) {
            System.out.println("Número: " + numero);
        }
    }
}

