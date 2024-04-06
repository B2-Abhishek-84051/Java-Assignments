public class CommissionEmployee extends Employee {
    double grossSales;
    double commissionRate;

    CommissionEmployee()
    {}

    public CommissionEmployee(String first_name, String last_name, int ssn,double grossSales, double commissionRate) {
        super(first_name, last_name, ssn);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    double earnings()
    {
        return commissionRate+grossSales;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +super.toString()+"\n"+
                "grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                '}';
    }
}
