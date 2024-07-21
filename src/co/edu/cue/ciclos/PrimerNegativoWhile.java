package co.edu.cue.ciclos;

public class PrimerNegativoWhile {
    int[] numeros;

    public PrimerNegativoWhile(int[] numeros) {
        this.numeros = numeros;
    }

    public int resultado() {
        int i = 0;
        while (i < numeros.length) {
            if (numeros[i] < 0) {
                return numeros[i];
            }
            i++;
        }
        return 0; // Si no hay números negativos, devuelve 0
    }
}
