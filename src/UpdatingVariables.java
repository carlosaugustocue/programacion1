public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //bono
        salary = salary + 200;
        System.out.println("Salario: "+ salary);

        //Pensión: $50 -> descuento
        salary = salary - 50;
        System.out.println("Salario menos pensión: " + salary);

    }
}
