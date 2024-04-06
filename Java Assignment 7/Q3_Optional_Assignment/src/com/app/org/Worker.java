package com.app.org;

public class Worker extends Employee{
    double hoursWorked;
    double hourlyRate;
    double computeNetSalary()
    {
        return basic+(hoursWorked*hourlyRate);
    }
    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return "Worker : "+super.toString()+"\n"+
                "hoursWorked=" + hoursWorked + ", hourlyRate=" + hourlyRate +"\nNet Salary = "+"\n Net Salary = "+computeNetSalary();
    }
}
