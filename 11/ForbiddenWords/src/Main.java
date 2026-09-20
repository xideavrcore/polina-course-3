import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static String maskWord(String word, char maskChar) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            sb.append(maskChar);
        }
        return sb.toString();
    }

    public static String censor(String text, String[] forbidden, char maskChar) {
        String result = text;
        for (int i = 0; i < forbidden.length; i++) {
            String bad = forbidden[i].trim();
            if (bad.length() == 0) {
                continue;
            }
            String mask = maskWord(bad, maskChar);
            // целое слово (не часть другого), без учета регистра
            Pattern p = Pattern.compile("(?iu)(?<!\\p{L})" + Pattern.quote(bad) + "(?!\\p{L})");
            Matcher m = p.matcher(result);
            result = m.replaceAll(Matcher.quoteReplacement(mask));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вариант 1. Замена запрещенных слов звездочками или тире.");

        System.out.println("Введите запрещенные слова через пробел:");
        String line = sc.nextLine();
        String[] forbidden = line.split("\\s+");

        System.out.println("Выберите маску: 1 - звездочки (*), 2 - тире (-)");
        System.out.print("Ваш выбор: ");
        int choice = Integer.parseInt(sc.nextLine().trim());
        char maskChar = (choice == 2) ? '-' : '*';

        System.out.println("Введите текст:");
        String text = sc.nextLine();

        String result = censor(text, forbidden, maskChar);
        System.out.println("Результат:");
        System.out.println(result);
    }

}
