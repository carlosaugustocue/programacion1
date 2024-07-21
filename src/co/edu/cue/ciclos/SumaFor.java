package co.edu.cue.ciclos;

public class SumaFor {
    int numero;

    public SumaFor(int numero) {
        this.numero = numero;
    }

    public int resultado() {
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            suma += i;
        }
        return suma;
    }
}
