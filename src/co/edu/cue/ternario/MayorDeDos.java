package co.edu.cue.ternario;

public class MayorDeDos {
    int a  , b ;

    public MayorDeDos(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int resultado() {
        int mayor = (a > b) ? a : b;
        return mayor;
    }

}
