public class WeightConverter {

    // Конвертация из килограммов в указанную единицу
    public double convert(double kg, String to) {
        if (to.equalsIgnoreCase("oz") || to.equalsIgnoreCase("ounce")
                || to.equalsIgnoreCase("ounces")) {
            return kg * 35.27396195;
        } else if (to.equalsIgnoreCase("pud") || to.equalsIgnoreCase("пуд")) {
            return kg / 16.3804964;
        } else if (to.equalsIgnoreCase("catty") || to.equalsIgnoreCase("кэтти")) {
            return kg / 0.6;
        } else if (to.equalsIgnoreCase("lb") || to.equalsIgnoreCase("pound")
                || to.equalsIgnoreCase("pounds")) {
            return kg * 2.2046226218;
        } else if (to.equalsIgnoreCase("g") || to.equalsIgnoreCase("gram")
                || to.equalsIgnoreCase("grams")) {
            return kg * 1000.0;
        } else {
            throw new IllegalArgumentException("Неизвестная единица массы: " + to);
        }
    }

}
