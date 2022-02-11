package attempts.spring.classImpl;

import attempts.spring.Department;

public class CPlusPlusDepImpl implements Department {

    @Override
    public String getName() {
        return "Junior Developer";
    }

    @Override
    public String getDepId() {
        return "\"C++\"Dep";
    }
}
