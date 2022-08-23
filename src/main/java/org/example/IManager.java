package org.example;

public interface IManager {
    // A Manager can increaseSalary, hireEmployee, fireEmployee, and getNumberOfEmployeesSupervised
    // Please implement these methods

    public void increaseSalary(Employee e,double d);
    public void hireEmployee(Employee e);
    public void fireEmployee(Employee e);
    public void getNumberOfEmployeesSupervised();
}
