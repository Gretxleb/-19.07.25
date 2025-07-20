import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("День добрый!");

        System.out.print("Введите цену товара (в руб.):");
        int price = scanner.nextInt();

        System.out.print("Введите вес товара (в кг.):");
        int kg = scanner.nextInt();

        double dutyAmount = calculateDuty(price, kg);

        System.out.print("Размер пошлины (в руб.) составит: " + (int)dutyAmount);

        scanner.close();
    }

    public static double calculateDuty(int price, int kg) {
        return (double) (price / 100) + (kg * 100);
    }
}
