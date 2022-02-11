package attempts.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HiringRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classContext = new ClassPathXmlApplicationContext("hiringContext.xml");
        Hiring hiring = classContext.getBean("hiringDepartment", Hiring.class);
        Hiring hiring1 = classContext.getBean("hiringDepartment1", Hiring.class);
        Hiring hiring2 = classContext.getBean("hiringDepartment2", Hiring.class);
        Hiring [] hiringArray= new Hiring [] {hiring,hiring1,hiring2};
        for (Hiring hirings: hiringArray){
            hirings.printInfo();
        }
        classContext.close();

    }
}
