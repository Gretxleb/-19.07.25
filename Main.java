import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("День добрый!");

        System.out.print("Введите цену товара (в руб.):");
        int x = scanner.nextInt();

        System.out.print("Введите вес товара (в кг.):");
        int price = scanner.nextInt();

        double dutyAmount = (x / 100) + (price * 100);

        System.out.print("Размер пошлины (в руб.) составит: " + (int)dutyAmount);

    }
}