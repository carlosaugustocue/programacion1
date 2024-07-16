package co.edu.cue.switchstatement;

import javax.swing.*;

public class MainDiaDeLaSemana {
    public static void main(String[] args) {
        try {
            String numeroString = JOptionPane.showInputDialog("Ingrese un número del 1 al 7:");
            int dia = Integer.parseInt(numeroString);

            DiaDeLaSemana diaDeLaSemana = new DiaDeLaSemana(dia);
            String resultado = diaDeLaSemana.resultado();

            JOptionPane.showMessageDialog(null, "El día de la semana es: " + resultado);
            System.out.println("El día de la semana es: " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
            System.err.println("Error: Entrada inválida. Por favor, ingrese un número.");
        }
    }
}
