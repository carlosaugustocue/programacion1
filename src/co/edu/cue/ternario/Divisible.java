package co.edu.cue.ternario;

public class Divisible {
    int a, b;

    public Divisible(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String resultado() {
        return (b != 0 && a % b == 0) ? "es" : "no es";
    }
}
