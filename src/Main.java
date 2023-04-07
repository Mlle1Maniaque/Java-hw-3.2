public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        System.out.println();
        System.out.println("Ваш индекс массы тела: " + service.calculate(1.87, 98));

        System.out.println();
        System.out.println("Ваш индекс массы тела: " + service.calculate(1.75, 66));

        System.out.println();
        System.out.println("Ваш индекс массы тела: " + service.calculate(1.61, 57));

        System.out.println();
        System.out.println("Ваш индекс массы тела: " + service.calculate(1.50, 75));
    }
}