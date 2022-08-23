package org.example;

import java.util.ArrayList;

public class Manager extends Employee implements IManager{
    private ArrayList<Employee> employees=new ArrayList<Employee>();
//attribute of manager is employees which has to be used in the method getNumberOfEmployeesSupervised???
public Manager(int id, String firstName, String lastName, int age, double salary, String department) {
    super(id, firstName, lastName, age, salary, department);

}
    public Manager(int id, String firstName, String lastName, int age, double salary, String department, ArrayList<Employee> employees) {
        super(id, firstName, lastName, age, salary, department);
        this.employees = employees;
    }

    public ArrayList<Employee> getEmployees() {
        System.out.println(this.getFirstName()+ " "+this.getLastName()+"'s employees : ");
        if (employees.size() != 0) {
            for (int i = 0; i <employees.size(); i++) {
                System.out.println(employees.get(i).getFirstName()+" "+employees.get(i).getLastName());
            }
        }
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public void increaseSalary(Employee e,double d) {
    e.setSalary(e.getSalary()+d);
        System.out.println(e.getFirstName()+" "+e.getLastName()+" "+"'s salary is increased "+d +" CHF. New Salary : "+ e.getSalary());
    }

    @Override
    public void hireEmployee(Employee e) {
        employees.add(e);
        System.out.println(e.getFirstName() +" is hired!");
    }

    @Override
    public void fireEmployee(Employee e) {
        employees.remove(e);
        System.out.println(e.getFirstName() +" is fired!");
    }

    @Override
    public void getNumberOfEmployeesSupervised() {

        System.out.println(this.getFirstName()+" has "+ this.employees.size()+" employees.");
    }

    // A Manager has numberOfEmployeesSupervised attribute additionally.
    // Please implement necessary methods to get and set these attributes of Manager

}
