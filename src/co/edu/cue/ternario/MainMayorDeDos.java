package co.edu.cue.ternario;

import javax.swing.*;

//Encontrar el mayor de dos números
public class MainMayorDeDos {
    public static void main(String[] args) {

        try {
            String numeroStringA = JOptionPane.showInputDialog("Ingrese el numero A:");
            int a = Integer.parseInt(numeroStringA);

            String numeroStringB = JOptionPane.showInputDialog("Ingrese el numero B:");
            int b = Integer.parseInt(numeroStringB);

            MayorDeDos mayorDeDos = new MayorDeDos(a, b);
            int resultado = mayorDeDos.resultado();

            JOptionPane.showMessageDialog(null, "El número mayor es: " + resultado);
            System.out.println("El número es: " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
            System.err.println("Error: Entrada inválida. Por favor, ingrese un número.");
        }
    }
}

