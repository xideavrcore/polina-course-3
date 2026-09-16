import java.util.Scanner;

public class Main {

    public static int readInt(Scanner sc, String prompt) throws Exception {
        System.out.print(prompt);
        String token = sc.next();
        try {
            return Integer.parseInt(token);
        } catch (NumberFormatException e) {
            try {
                Double.parseDouble(token);
                throw new Exception("Несоответствие числового типа данных: \"" + token + "\"");
            } catch (NumberFormatException e2) {
                throw new Exception("Ввод строки вместо числа: \"" + token + "\"");
            }
        }
    }

    public static double averagePositive(int[] a) throws NoPositiveElementsException {
        long sum = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                sum = sum + a[i];
                count++;
            }
        }
        if (count == 0) {
            throw new NoPositiveElementsException("Положительные элементы отсутствуют");
        }
        return (double) sum / count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вариант 1. Среднее положительных элементов массива (int).");
        try {
            int n = readInt(sc, "Введите N: ");
            if (n <= 0) {
                throw new Exception("Размер массива должен быть положительным");
            }
            int[] a = new int[n];
            System.out.println("Введите " + n + " элементов массива:");
            for (int i = 0; i < n; i++) {
                a[i] = readInt(sc, "a[" + i + "] = ");
            }
            double avg = averagePositive(a);
            System.out.println("Среднее положительных элементов: " + avg);
        } catch (NoPositiveElementsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Завершение программы (блок finally).");
        }
    }

}
