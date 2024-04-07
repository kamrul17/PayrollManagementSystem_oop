package com.employeePayrollManagement;

public class FullTimeEmp extends Employee{

    private double Monthly_sal;

    public FullTimeEmp(int id, String name, double monthly_sal) {
        super(id, name);
        Monthly_sal = monthly_sal;
    }


    @Override
    double CalSalary() {
        return Monthly_sal;
    }
}
