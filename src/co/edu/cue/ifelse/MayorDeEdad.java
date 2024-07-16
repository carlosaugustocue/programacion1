package co.edu.cue.ifelse;

public class MayorDeEdad {
    int edad;

    public MayorDeEdad(int edad) {
        this.edad = edad;
    }

    public String resultado() {
        if (edad >= 18) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }
}
