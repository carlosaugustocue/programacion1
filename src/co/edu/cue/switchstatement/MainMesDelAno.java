package co.edu.cue.switchstatement;

import javax.swing.*;

public class MainMesDelAno {
    public static void main(String[] args) {
        try {
            String numeroString = JOptionPane.showInputDialog("Ingrese un número del 1 al 12:");
            int mes = Integer.parseInt(numeroString);

            MesDelAno mesDelAno = new MesDelAno(mes);
            String resultado = mesDelAno.resultado();

            JOptionPane.showMessageDialog(null, "El mes del año es: " + resultado);
            System.out.println("El mes del año es: " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
            System.err.println("Error: Entrada inválida. Por favor, ingrese un número.");
        }
    }
}
