interface Emp
{
    abstract double getsal();
    default double calIncentive(){
        return 0.0;
    }
    static double calcTotalIncome(Emp arr[])
    {
        double totalIncome = 0.0;
        for (Emp i : arr)
        {
            totalIncome = totalIncome + i.getsal() + i.calIncentive();
        }
        return totalIncome;
    }
}// end of employee class
class Manager implements Emp {
    private double basicSalary;
    private double dearnessAllowance;

    public Manager(double basicSalary, double dearnessAllowance) {
        this.basicSalary = basicSalary;
        this.dearnessAllowance = dearnessAllowance;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getDearnessAllowance() {
        return dearnessAllowance;
    }

    public void setDearnessAllowance(double dearnessAllowance) {
        this.dearnessAllowance = dearnessAllowance;
    }

    @Override
    public double getsal() {
        return basicSalary + dearnessAllowance;
    }

    @Override
    public double calIncentive() {
        return 0.2*basicSalary;
    }
}// end of Manager class

class Labor implements Emp {
    private int hour;
    private double rate;

    public Labor(int hour, double rate) {
        this.hour = hour;
        this.rate = rate;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double getsal() {
        return this.hour*this.rate;
    }

    @Override
    public double calIncentive() {
        double incentive;
        if (hour > 300)
        {
            incentive = 0.05 * getsal();
        }
        else {
            incentive = 0;
        }
        return incentive;
    }
}// end of lobor class

class clerk implements Emp
{
    double salary;

    public clerk(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getsal() {
        return this.salary;
    }
}
public class Main {
    public static void main(String[] args) {
        Emp e[] = new Emp[]{
                new clerk(25000),
                new Manager(35000, 3500),
                new Labor(15, 100),
                new clerk(22000),
                new Manager(30000, 3000)
        };
        System.out.println(Emp.calcTotalIncome(e));
    }
}