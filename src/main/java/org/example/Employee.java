package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class Employee {
    private final String fullName;
    private int department;
    private int salary;
    private static int counter = 1;
    public final int id;

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String fullName, int department, int salary) {
        if (!StringUtils.isEmpty(fullName)&& StringUtils.isAlphaSpace(fullName)){
        String[] fullNameEmployee = fullName.split(" ");
        String lastName = fullNameEmployee[0];
        String firstName = fullNameEmployee[1];
        String patronymic = fullNameEmployee[2];
            firstName= StringUtils.capitalize(firstName);
            lastName= StringUtils.capitalize(lastName);
            patronymic=StringUtils.capitalize(patronymic);
        fullName= lastName+ " "+firstName+" "+ patronymic;
        this.fullName =fullName;
        }
        else {throw new RuntimeException("400 Bad Request");}
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && fullName.equals(employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary);
    }
}
