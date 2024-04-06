public class Employee {
    String first_name;
    String last_name;
    int ssn;

    public Employee() {
    }

    public Employee(String first_name, String last_name, int ssn) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", ssn=" + ssn;
    }
}
