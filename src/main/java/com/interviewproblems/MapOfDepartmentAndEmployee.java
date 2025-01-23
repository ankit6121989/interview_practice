package com.interviewproblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class MapOfDepartmentAndEmployee {
    public static void main(String[] args) {
        List<Employee> employee = Arrays.asList(
                new Employee("Alice", 28, 60000, "HR"),
                new Employee("Bob", 35, 75000, "Engineering"),
                new Employee("Charlie", 32, 90000, "Engineering"),
                new Employee("David", 40, 80000, "HR"),
                new Employee("Eva", 28, 70000, "Finance"),
                new Employee("Frank", 45, 95000, "Finance"));

        Map<String,List<String>> mapEmployee = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName,toList())));
        mapEmployee.entrySet().forEach(System.out::println);
    }

}

class Employee {
    String name;
    int age;
    double salary;
    String department;

    public Employee(String name, int age, double salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

