package co.edu.cue.ifelse;

import javax.swing.*;

public class MainCadenaVacia {
    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena:");

        CadenaVacia cadenaVacia = new CadenaVacia(cadena);
        String resultado = cadenaVacia.resultado();

        JOptionPane.showMessageDialog(null, "La cadena " + resultado);
        System.out.println("La cadena " + resultado);
    }
}
