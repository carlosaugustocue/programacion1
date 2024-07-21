package co.edu.cue.ciclos;

import javax.swing.*;

public class MainPrimerNegativoWhile {
    public static void main(String[] args) {
        try {
            String numeroString = JOptionPane.showInputDialog("Ingrese una lista de números separados por comas:");
            String[] numerosString = numeroString.split(",");
            int[] numeros = new int[numerosString.length];

            for (int i = 0; i < numerosString.length; i++) {
                numeros[i] = Integer.parseInt(numerosString[i].trim());
            }

            PrimerNegativoWhile primerNegativoWhile = new PrimerNegativoWhile(numeros);
            int resultado = primerNegativoWhile.resultado();

            JOptionPane.showMessageDialog(null, "El primer número negativo es: " + resultado);
            System.out.println("El primer número negativo es: " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese una lista de números válidos.");
            System.err.println("Error: Entrada inválida. Por favor, ingrese una lista de números.");
        }
    }
}
