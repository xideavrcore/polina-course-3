package task5;

public class Sotrudnik {

    private String position;
    private String department;
    private String fio;
    private Sotrudnik boss;

    public Sotrudnik(String position, String department, String fio) {
        this.position = position;
        this.department = department;
        this.fio = fio;
        this.boss = null;
    }

    public Sotrudnik(String position, String department, String fio, Sotrudnik boss) {
        this.position = position;
        this.department = department;
        this.fio = fio;
        this.boss = boss;
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

    public Sotrudnik getBoss() {
        return boss;
    }

    public void setBoss(Sotrudnik boss) {
        this.boss = boss;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fio);
        System.out.println("Должность: " + position);
        System.out.println("Отдел: " + department);
        System.out.println("Иерархия подчинения (снизу вверх):");
        Sotrudnik current = this;
        int level = 0;
        while (current != null) {
            System.out.println("  " + level + ": " + current.fio + " - " + current.position);
            current = current.boss;
            level++;
        }
    }

}
