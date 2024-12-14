public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        System.out.println();
        System.out.println("Рост: 1,87 метров ");
        System.out.println("Вес: 98 кг ");
        System.out.println("Ваш индекс массы тела: ");
        System.out.print(service.calculate(1.87, 98));

        System.out.println();
        System.out.println();
        System.out.println("Рост: 1,73 метра ");
        System.out.println("Вес: 51 кг ");
        System.out.println("Ваш индекс массы тела: ");
        System.out.print(service.calculate(1.73, 51));
        System.out.println();
    }
}