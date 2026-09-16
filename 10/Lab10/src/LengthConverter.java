public class LengthConverter {

    // Конвертация из сантиметров в указанную единицу
    public double convert(double cm, String to) {
        if (to.equalsIgnoreCase("in") || to.equalsIgnoreCase("inch")
                || to.equalsIgnoreCase("inches")) {
            return cm / 2.54;
        } else if (to.equalsIgnoreCase("ft") || to.equalsIgnoreCase("foot")
                || to.equalsIgnoreCase("feet")) {
            return cm / 30.48;
        } else if (to.equalsIgnoreCase("m") || to.equalsIgnoreCase("meter")
                || to.equalsIgnoreCase("meters")) {
            return cm / 100.0;
        } else if (to.equalsIgnoreCase("yd") || to.equalsIgnoreCase("yard")
                || to.equalsIgnoreCase("yards")) {
            return cm / 91.44;
        } else if (to.equalsIgnoreCase("mm") || to.equalsIgnoreCase("millimeter")) {
            return cm * 10.0;
        } else {
            throw new IllegalArgumentException("Неизвестная единица длины: " + to);
        }
    }

}
