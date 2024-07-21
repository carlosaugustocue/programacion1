package co.edu.cue.ciclos;

import javax.swing.*;
import java.util.Scanner;

public class MainSumaFor {
    public static void main(String[] args) {
        try {
            String numeroString = JOptionPane.showInputDialog("Ingrese un número:");
            int numero = Integer.parseInt(numeroString);

            SumaFor sumaFor = new SumaFor(numero);
            int resultado = sumaFor.resultado();

            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();

            //JOptionPane.showInputDialog();

            JOptionPane.showMessageDialog(null, "La suma de los primeros " + numero + " números naturales es: " + resultado);
            System.out.println("La suma de los primeros " + numero + " números naturales es: " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
            System.err.println("Error: Entrada inválida. Por favor, ingrese un número.");
        }
    }
}
