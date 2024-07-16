package co.edu.cue.ternario;

public class PositivoNegativoCero {
    int numero;

    public PositivoNegativoCero(int numero) {
        this.numero = numero;
    }

    public String resultado() {
        return (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Cero";
    }
}
