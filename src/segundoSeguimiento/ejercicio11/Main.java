package segundoSeguimiento.ejercicio11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número: ");
        int numeroIngresado = scanner.nextInt();

        // Crear una instancia de la clase NumeroParImpar
        NumeroParImpar numero = new NumeroParImpar(numeroIngresado);

        // Determinar y mostrar si el número es par o impar
        System.out.println(numero.determinarParImpar());

        scanner.close();
    }
}
