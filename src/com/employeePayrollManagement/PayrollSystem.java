package com.employeePayrollManagement;

import java.util.ArrayList;

public class PayrollSystem {
    private ArrayList <Employee>employeeList;
    public PayrollSystem(){
        employeeList=new ArrayList<>();
    }
   public void addEmp(Employee emp){
        employeeList.add(emp);
   }
   public void removeEmp(int id){
        Employee emptoRemove=null;
        for(Employee emp:employeeList){
            if (emp.getId()==id){
                emptoRemove=emp;
                break;
            }
        }
        if (emptoRemove!=null){
            employeeList.remove(emptoRemove);
        }
   }
   public void DisplayEmp(){
       if (employeeList.isEmpty()){
           System.out.println("no EMployee Available");
       }
       for(Employee emp:employeeList){

           System.out.println(emp);
       }
   }
}
