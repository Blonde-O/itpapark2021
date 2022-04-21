package lesson13;

public class Employee {
    private final String fio;
    private final int number;
    private final int workAge;

    public Employee(String fio, int number, int workAge) {
        this.fio = fio;
        this.number = number;
        this.workAge = workAge;
    }

    public String getFio() { return fio;}

    public int getNumber() {
        return number;
    }

    public int getWorkAge() {
        return workAge;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ФИО ='" + fio + '\'' +
                ", Табельный номер=" + number +
                ", Стаж работы=" + workAge +
                '}';
    }

}
