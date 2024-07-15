import javax.swing.*;

public class EntradaDatos {
    public static void main(String[] args) {
        // Solicitar una cadena de texto
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");

        // Solicitar un número entero
        String edadString = JOptionPane.showInputDialog("Ingrese su edad:");
        int edad = Integer.parseInt(edadString);

        // Mostrar los datos ingresados
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nEdad: " + edad);
        System.out.println("Hola " + nombre + " tienes " + edad + " años.");
    }
}
