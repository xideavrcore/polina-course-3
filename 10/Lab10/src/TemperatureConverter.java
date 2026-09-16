public class TemperatureConverter {

    // Конвертация из градусов Цельсия в указанную шкалу
    public double convert(double celsius, String to) {
        if (to.equalsIgnoreCase("K") || to.equalsIgnoreCase("Kelvin")) {
            return celsius + 273.15;
        } else if (to.equalsIgnoreCase("F") || to.equalsIgnoreCase("Fahrenheit")) {
            return celsius * 9.0 / 5.0 + 32.0;
        } else if (to.equalsIgnoreCase("R") || to.equalsIgnoreCase("Reaumur")) {
            return celsius * 0.8;
        } else if (to.equalsIgnoreCase("Ra") || to.equalsIgnoreCase("Rankine")) {
            return (celsius + 273.15) * 9.0 / 5.0;
        } else {
            throw new IllegalArgumentException("Неизвестная шкала: " + to);
        }
    }

}
