package segundoSeguimiento.ejercicio5;

public class AreaRectangulo {
    // Atributos
    public double base;
    public double altura;

    // Constructor
    public AreaRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Métodos
    public boolean validarDatosIngresados() {
        return base > 0 && altura > 0;
    }

    public double calcularArea() {
        if (validarDatosIngresados()) {
            return base * altura;
        } else {
            System.out.println("Error: La base y la altura deben ser mayores a cero.");
            return 0;
        }
    }

    // Getters y Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


}

