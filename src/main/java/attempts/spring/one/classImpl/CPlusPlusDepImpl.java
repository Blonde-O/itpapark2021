package attempts.spring.one.classImpl;

import attempts.spring.one.Department;

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