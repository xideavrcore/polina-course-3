package task4;

public class Sotrudnik {

    private String position;
    private String department;
    private String fio;
    private int age;

    public Sotrudnik(String position, String department, String fio, int age) {
        this.position = position;
        this.department = department;
        this.fio = fio;
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fio);
        System.out.println("Должность: " + position);
        System.out.println("Отдел: " + department);
        System.out.println("Возраст: " + age);
    }

}
