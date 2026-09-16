import java.util.Scanner;

public class Main {

    public static int countDivisors(int n) {
        if (n < 0) {
            n = -n;
        }
        if (n == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вариант 1. Количество делителей. 0 - конец последовательности.");
        while (true) {
            System.out.print("Введите число: ");
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            System.out.println("Число " + n + ": делителей = " + countDivisors(n));
        }
    }

}
