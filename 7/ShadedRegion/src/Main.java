import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вариант 1. Принадлежность точки заштрихованной области.");
        System.out.print("Введите x: ");
        double x = sc.nextDouble();
        System.out.print("Введите y: ");
        double y = sc.nextDouble();

        // Область: треугольник с границами y=1, x=1, y=-x
        if (x <= 1 && y <= 1 && y >= -x) {
            System.out.println("Точка принадлежит заштрихованной области.");
        } else {
            System.out.println("Точка не принадлежит заштрихованной области.");
        }
    }

}
