import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] alpha = new double[5];

        System.out.println("Вариант 1. Введите 5 значений alpha (в радианах):");
        for (int i = 0; i < 5; i++) {
            System.out.print("alpha[" + (i + 1) + "] = ");
            alpha[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.println("Вычисление z1 (цикл while):");
        int i = 0;
        while (i < 5) {
            double a = alpha[i];
            double z1 = 2 * Math.pow(Math.sin(3 * Math.PI - 2 * a), 2)
                    * Math.pow(Math.cos(5 * Math.PI + 2 * a), 2);
            System.out.println("alpha=" + a + ", z1=" + z1);
            i++;
        }

        System.out.println();
        System.out.println("Вычисление z2 (цикл do-while):");
        i = 0;
        do {
            double a = alpha[i];
            double z2 = 1.0 / 4.0 - (1.0 / 4.0) * Math.sin(5.0 / 2.0 * Math.PI - 8 * a);
            System.out.println("alpha=" + a + ", z2=" + z2);
            i++;
        } while (i < 5);

        System.out.println();
        System.out.println("Сравнение z1 и z2 (цикл for):");
        for (int j = 0; j < 5; j++) {
            double a = alpha[j];
            double z1 = 2 * Math.pow(Math.sin(3 * Math.PI - 2 * a), 2)
                    * Math.pow(Math.cos(5 * Math.PI + 2 * a), 2);
            double z2 = 1.0 / 4.0 - (1.0 / 4.0) * Math.sin(5.0 / 2.0 * Math.PI - 8 * a);
            System.out.println("alpha=" + a + ", z1=" + z1 + ", z2=" + z2
                    + ", |z1-z2|=" + Math.abs(z1 - z2));
        }
    }

}
