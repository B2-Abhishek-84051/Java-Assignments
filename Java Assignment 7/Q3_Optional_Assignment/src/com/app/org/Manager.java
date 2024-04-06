package com.app.org;

public class Manager extends Employee {

    double performanceBonus;

    double computeNetSalary()
    {
        return basic + this.performanceBonus;
    }

    public double getPerformanceBonus() {
        return performanceBonus;
    }

    public void setPerformanceBonus(double performanceBonus) {
        this.performanceBonus = performanceBonus;
    }

    @Override
    public String toString() {
        return "Manager ["+super.toString()+"\n"+
                "performanceBonus=" + performanceBonus +"\n Net Salary = "+
                computeNetSalary()+
                ']';
    }
}

