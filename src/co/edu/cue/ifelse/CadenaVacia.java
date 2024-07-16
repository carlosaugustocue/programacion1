package co.edu.cue.ifelse;

public class CadenaVacia {
    String cadena;

    public CadenaVacia(String cadena) {
        this.cadena = cadena;
    }

    public String resultado() {
        if (cadena.isEmpty()) {
            return "está vacía";
        } else {
            return "no está vacía";
        }
    }
}
