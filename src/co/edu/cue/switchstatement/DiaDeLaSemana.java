package co.edu.cue.switchstatement;

public class DiaDeLaSemana {
    int dia;

    public DiaDeLaSemana(int dia) {
        this.dia = dia;
    }

    public String resultado() {
        String nombreDia;
        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Número inválido";
                break;
        }
        return nombreDia;
    }
}
