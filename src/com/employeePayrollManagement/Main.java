package com.employeePayrollManagement;

public class Main {
    public static void main(String [] args){
PayrollSystem pr=new PayrollSystem();
FullTimeEmp fe=new FullTimeEmp(1,"golu",1000.00);
FullTimeEmp fe1=new FullTimeEmp(2,"golu3",12000.00);
FullTimeEmp fe2=new FullTimeEmp(3,"golu4",10300.00);
pr.addEmp(fe);
pr.addEmp(fe1);
pr.addEmp(fe2);

PartTimelEmp pe=new PartTimelEmp(21,"sahil",5,1000);
PartTimelEmp pe2=new PartTimelEmp(22,"sahil22",6,2000);
pr.addEmp(pe);
pr.addEmp(pe2);
pr.DisplayEmp();
        System.out.println("After Removing few Employee-------");
pr.removeEmp(3);
pr.removeEmp(21);


pr.DisplayEmp();


    }
}
