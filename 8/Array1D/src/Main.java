import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вариант 1. Сумма элементов после максимального.");
        System.out.print("Введите N: ");
        int n = sc.nextInt();
        double[] x = new double[n];
        System.out.println("Введите " + n + " элементов массива X:");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextDouble();
        }

        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (x[i] > x[maxIndex]) {
                maxIndex = i;
            }
        }

        double sum = 0;
        for (int i = maxIndex + 1; i < n; i++) {
            sum = sum + x[i];
        }

        System.out.println("Максимальный элемент: " + x[maxIndex] + " (индекс " + maxIndex + ")");
        System.out.println("Сумма элементов после максимума: " + sum);
    }

}
