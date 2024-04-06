public class SalariedEmployee extends Employee {
    double weekelySalary;

    public SalariedEmployee(String first_name, String last_name, int ssn, double weekelySalary) {
        super(first_name, last_name, ssn);
        this.weekelySalary = weekelySalary;
    }

    double earnings()
    {
        return weekelySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +super.toString()+"\n"+
                "weekelySalary=" + weekelySalary +
                '}';
    }
}
