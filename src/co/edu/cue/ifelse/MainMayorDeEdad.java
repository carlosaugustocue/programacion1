package co.edu.cue.ifelse;

import javax.swing.*;

public class MainMayorDeEdad {
    public static void main(String[] args) {
        try {
            String edadString = JOptionPane.showInputDialog("Ingrese su edad:");
            int edad = Integer.parseInt(edadString);

            MayorDeEdad mayorDeEdad = new MayorDeEdad(edad);
            String resultado = mayorDeEdad.resultado();

            JOptionPane.showMessageDialog(null, "Usted es: " + resultado);
            System.out.println("Usted es: " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese una edad válida.");
            System.err.println("Error: Entrada inválida. Por favor, ingrese una edad.");
        }
    }
}
