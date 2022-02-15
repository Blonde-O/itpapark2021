package attempts.spring.one.classImpl;

import attempts.spring.one.Department;

public class DelphiDepImpl implements Department {

    @Override
    public String getName() {

        return "Junior Developer";
    }

    @Override
    public String getDepId() {
        return "DelphiDep";
    }
}
