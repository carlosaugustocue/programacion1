package co.edu.cue.ciclos;

import javax.swing.*;

public class LeerHastaNegativo {

    public void resultado() {
        int numero;
        do {
            String numeroString = JOptionPane.showInputDialog("Ingrese un número (ingrese un número negativo para salir):");
            numero = Integer.parseInt(numeroString);
            if (numero >= 0) {
                JOptionPane.showMessageDialog(null, "Número ingresado: " + numero);
                System.out.println("Número ingresado: " + numero);
            }
        } while (numero >= 0);
        JOptionPane.showMessageDialog(null, "Número negativo ingresado, finalizando.");
        System.out.println("Número negativo ingresado, finalizando.");
    }
}
