package training.util;

public class Data {

    public int employeeId;
    public String name;
    public String email;
    public long phoneNumber;

    public <T> Data(int employeeId, String name, String email, long phoneNumber) {

        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
