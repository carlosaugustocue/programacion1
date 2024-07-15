package co.edu.cue.ternario;

public class ParImpar {

    int numero;

    // Constructor
    public ParImpar(int numero) {
        this.numero = numero;
    }

    public String esParImpar() {
        String resultado = (this.numero % 2 == 0) ? "Par" : "Impar";
        return resultado;
    }

}
