package co.edu.cue.ternario;

import javax.swing.*;

public class MainDivisible {
    public static void main(String[] args) {
        try {
            String numeroStringA = JOptionPane.showInputDialog("Ingrese el número A:");
            int a = Integer.parseInt(numeroStringA);

            String numeroStringB = JOptionPane.showInputDialog("Ingrese el número B:");
            int b = Integer.parseInt(numeroStringB);

            Divisible divisible = new Divisible(a, b);
            String resultado = divisible.resultado();

            JOptionPane.showMessageDialog(null, "El número " + a + " " + resultado + " divisible por " + b);
            System.out.println("El número " + a + " " + resultado + " divisible por " + b);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
            System.err.println("Error: Entrada inválida. Por favor, ingrese un número.");
        }
    }
}
