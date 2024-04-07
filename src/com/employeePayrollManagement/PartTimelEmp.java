package com.employeePayrollManagement;

public class PartTimelEmp extends Employee{
    private int hoursWorked;
    private double hourlyCharge;

    public PartTimelEmp(int id, String name, int hoursWorked, double hourlyCharge) {
        super(id, name);
        this.hoursWorked = hoursWorked;
        this.hourlyCharge = hourlyCharge;
    }

    @Override
    double CalSalary() {
        double totalSal=0;
        totalSal=hoursWorked*hourlyCharge;
        return totalSal;
    }
}
