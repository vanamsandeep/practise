package training.util;

import java.util.List;

public class Employee {

    public int employeeId;
    public String name;
    public String email;
    public List<Integer> phoneNumbers;

    public <T> Employee(int employeeId, String name, String email, List<T> phoneNumbers) {

        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
        this.phoneNumbers = (List<Integer>) phoneNumbers;
    }
}
