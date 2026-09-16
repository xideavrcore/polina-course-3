import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вариант 1. Точка M(x, y) в декартовой системе координат.");
        System.out.print("Введите x: ");
        double x = sc.nextDouble();
        System.out.print("Введите y: ");
        double y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Точка является началом координат.");
        } else if (x == 0) {
            System.out.println("Точка лежит на оси OY.");
        } else if (y == 0) {
            System.out.println("Точка лежит на оси OX.");
        } else if (x > 0 && y > 0) {
            System.out.println("Точка расположена в I координатном угле.");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка расположена во II координатном угле.");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка расположена в III координатном угле.");
        } else {
            System.out.println("Точка расположена в IV координатном угле.");
        }
    }

}
