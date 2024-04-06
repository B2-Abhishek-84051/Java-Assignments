public class HourlyEmployee extends Employee {
    double wage;
    double hours;

    public HourlyEmployee() {
        this("first", "last", 0, 0,0);
    }

    public HourlyEmployee(String first_name, String last_name, int ssn, double wage, double hours) {
        super(first_name, last_name, ssn);
        this.wage = wage;
        this.hours = hours;
    }

    double earnings()
    {
        double earning = 0;
        if (hours <= 40)
        {
            earning = wage*hours;
        }
        else if (hours > 40)
        {
            earning = (40*wage + (hours-40)*wage*1.5);
        }
        return earning;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +super.toString()+"\n"+
                "wage=" + wage +
                ", hours=" + hours +
                '}';
    }
}
