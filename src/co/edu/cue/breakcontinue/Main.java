package co.edu.cue.breakcontinue;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases de ejemplo
        BreakExample breakExample = new BreakExample();
        ContinueExample continueExample = new ContinueExample();

        // Ejecutar el ejemplo de break
        System.out.println("Ejemplo de break:");
        breakExample.usarBreak();

        // Ejecutar el ejemplo de continue
        System.out.println("\nEjemplo de continue:");
        continueExample.usarContinue();
    }
}

