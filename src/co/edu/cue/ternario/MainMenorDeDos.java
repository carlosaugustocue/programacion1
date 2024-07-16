package co.edu.cue.ternario;

import javax.swing.*;

public class MainMenorDeDos {
    public static void main(String[] args) {
        try {
            String numeroStringA = JOptionPane.showInputDialog("Ingrese el número A:");
            int a = Integer.parseInt(numeroStringA);

            String numeroStringB = JOptionPane.showInputDialog("Ingrese el número B:");
            int b = Integer.parseInt(numeroStringB);

            MenorDeDos menorDeDos = new MenorDeDos(a, b);
            int resultado = menorDeDos.resultado();

            JOptionPane.showMessageDialog(null, "El número menor es: " + resultado);
            System.out.println("El número menor es: " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
            System.err.println("Error: Entrada inválida. Por favor, ingrese un número.");
        }
    }
}