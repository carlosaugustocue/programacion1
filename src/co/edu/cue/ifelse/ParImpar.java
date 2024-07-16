package co.edu.cue.ifelse;

public class ParImpar {
    int numero;

    public ParImpar(int numero) {
        this.numero = numero;
    }

    public String resultado() {
        if (numero % 2 == 0) {
            return "Par";
        } else {
            return "Impar";
        }
    }
}
