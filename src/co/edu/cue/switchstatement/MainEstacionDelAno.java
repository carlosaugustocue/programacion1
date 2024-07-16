package co.edu.cue.switchstatement;

import javax.swing.*;

public class MainEstacionDelAno {
    public static void main(String[] args) {
        try {
            String numeroString = JOptionPane.showInputDialog("Ingrese un número del 1 al 4:");
            int estacion = Integer.parseInt(numeroString);

            EstacionDelAno estacionDelAno = new EstacionDelAno(estacion);
            String resultado = estacionDelAno.resultado();

            JOptionPane.showMessageDialog(null, "La estación del año es: " + resultado);
            System.out.println("La estación del año es: " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
            System.err.println("Error: Entrada inválida. Por favor, ingrese un número.");
        }
    }
}
