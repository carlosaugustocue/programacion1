package co.edu.cue.ternario;

import javax.swing.*;

public class MainPositivoNegativoCero {
    public static void main(String[] args) {
        try {
            String numeroString = JOptionPane.showInputDialog("Ingrese un número:");
            int numero = Integer.parseInt(numeroString);

            PositivoNegativoCero verificador = new PositivoNegativoCero(numero);
            String resultado = verificador.resultado();

            JOptionPane.showMessageDialog(null, "El número es: " + resultado);
            System.out.println("El número es: " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
            System.err.println("Error: Entrada inválida. Por favor, ingrese un número.");
        }
    }
}
