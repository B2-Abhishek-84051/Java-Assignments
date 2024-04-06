package com.app.org;

public class Employee {
    int id;
    String name;
    String deptId;
    static double basic;
    static int idGenerator = 0;


    public int getId() {
        return id;
    }

    public void setId() {
        this.id = ++idGenerator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public static int getIdGenerator() {
        return idGenerator;
    }

    public static void setIdGenerator(int idGenerator) {
        Employee.idGenerator = idGenerator;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", deptId='" + deptId + '\'' +
                ", basic=" + basic;
    }
}
