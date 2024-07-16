package co.edu.cue.ifelse;

import javax.swing.*;

public class MainParImpar {
    public static void main(String[] args) {
        try {
            String numeroString = JOptionPane.showInputDialog("Ingrese un número:");
            int numero = Integer.parseInt(numeroString);

            ParImpar parImpar = new ParImpar(numero);
            String resultado = parImpar.resultado();

            JOptionPane.showMessageDialog(null, "El número es: " + resultado);
            System.out.println("El número es: " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
            System.err.println("Error: Entrada inválida. Por favor, ingrese un número.");
        }
    }
}
