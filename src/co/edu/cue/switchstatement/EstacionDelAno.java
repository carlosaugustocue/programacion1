package co.edu.cue.switchstatement;

public class EstacionDelAno {
    int estacion;

    public EstacionDelAno(int estacion) {
        this.estacion = estacion;
    }

    public String resultado() {
        String nombreEstacion;
        switch (estacion) {
            case 1:
                nombreEstacion = "Primavera";
                break;
            case 2:
                nombreEstacion = "Verano";
                break;
            case 3:
                nombreEstacion = "Otoño";
                break;
            case 4:
                nombreEstacion = "Invierno";
                break;
            default:
                nombreEstacion = "Número inválido";
                break;
        }
        return nombreEstacion;
    }
}
