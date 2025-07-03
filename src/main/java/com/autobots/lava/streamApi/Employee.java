package com.autobots.lava.streamApi;

public class Employee {

    private int id;
    private String name;
    private int age;
    private int salary;
    private String department;

    public Employee(int id,String name,int age,int salary,String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }
}
