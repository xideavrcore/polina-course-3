public class Main {

    public static void main(String[] args) {
        System.out.println("=== 1. TemperatureConverter ===");
        TemperatureConverter temp = new TemperatureConverter();
        double c = 25.0;
        System.out.println(c + " C -> " + temp.convert(c, "K") + " K");
        System.out.println(c + " C -> " + temp.convert(c, "F") + " F");
        System.out.println(c + " C -> " + temp.convert(c, "R") + " Reaumur");
        System.out.println(c + " C -> " + temp.convert(c, "Ra") + " Rankine");

        System.out.println();
        System.out.println("=== 2. LengthConverter ===");
        LengthConverter length = new LengthConverter();
        double cm = 100.0;
        System.out.println(cm + " cm -> " + length.convert(cm, "in") + " inches");
        System.out.println(cm + " cm -> " + length.convert(cm, "ft") + " feet");
        System.out.println(cm + " cm -> " + length.convert(cm, "m") + " m");
        System.out.println(cm + " cm -> " + length.convert(cm, "yd") + " yards");

        System.out.println();
        System.out.println("=== 3. WeightConverter ===");
        WeightConverter weight = new WeightConverter();
        double kg = 10.0;
        System.out.println(kg + " kg -> " + weight.convert(kg, "oz") + " ounces");
        System.out.println(kg + " kg -> " + weight.convert(kg, "pud") + " pud");
        System.out.println(kg + " kg -> " + weight.convert(kg, "catty") + " catty");
        System.out.println(kg + " kg -> " + weight.convert(kg, "lb") + " pounds");

        System.out.println();
        System.out.println("=== 4. Sotrudnik (должность, отдел, ФИО, возраст) ===");
        task4.Sotrudnik s4 = new task4.Sotrudnik(
                "Программист", "IT", "Иванов Иван Иванович", 28);
        s4.printInfo();

        System.out.println();
        System.out.println("=== 5. Sotrudnik (должность, отдел, иерархия подчинения) ===");
        task5.Sotrudnik director = new task5.Sotrudnik(
                "Директор", "Администрация", "Петров П.П.");
        task5.Sotrudnik manager = new task5.Sotrudnik(
                "Начальник отдела", "IT", "Сидоров С.С.", director);
        task5.Sotrudnik worker = new task5.Sotrudnik(
                "Программист", "IT", "Иванов И.И.", manager);
        worker.printInfo();
    }

}
