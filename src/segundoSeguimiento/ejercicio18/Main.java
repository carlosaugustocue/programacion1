package segundoSeguimiento.ejercicio18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario si la computadora emite un pitido
        System.out.print("¿La computadora emite un pitido al iniciarse? (true/false): ");
        boolean emitePitido = scanner.nextBoolean();

        // Solicitar al usuario si el disco duro gira
        System.out.print("¿El disco duro gira? (true/false): ");
        boolean discoDuroGira = scanner.nextBoolean();

        // Crear una instancia de la clase Computadora
        Computadora computadora = new Computadora(emitePitido, discoDuroGira);

        // Determinar y mostrar el estado de la computadora
        String estado = computadora.determinarEstado();
        System.out.println("Estado de la computadora: " + estado);

        scanner.close();
    }
}

