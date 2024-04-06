public class BasePlusCommissionEmployee extends CommissionEmployee {
    double baseSalary;

    public BasePlusCommissionEmployee(String first_name, String last_name, int ssn,double grossSales, double commissionRate, double baseSalary) {
        super(first_name, last_name, ssn, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{, first_name='" + first_name  + "', last_name='" + last_name +"', ssn=" + ssn +"\n"+
                "baseSalary=" + baseSalary +
                ", grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                '}';
    }
    double earning()
    {
        return (commissionRate + baseSalary);
    }
}
