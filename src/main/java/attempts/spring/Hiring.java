package attempts.spring;

public class Hiring {

    private Department department;

    public Hiring(Department department) {
        this.department = department;
    }

    public void printInfo(){
        System.out.println(department.getName());
        System.out.println(department.getDepId());
    }
}
