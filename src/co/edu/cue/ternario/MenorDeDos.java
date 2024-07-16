package co.edu.cue.ternario;

public class MenorDeDos {
    int a, b;

    public MenorDeDos(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int resultado() {
        return (a < b) ? a : b;
    }
}
