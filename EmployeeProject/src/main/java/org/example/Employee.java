package org.example;

import jakarta.persistence.Entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Employee {
    public Employee(Long id, String name, int age, String employeeClass, String subjects, int attendance) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmpClass() {
        return empClass;
    }

    public void setEmpClass(String empClass) {
        this.empClass = empClass;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public double getAttendance() {
        return attendance;
    }

    public void setAttendance(double attendance) {
        this.attendance = attendance;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String empClass;

    @ElementCollection
    private List<String> subjects;

    private double attendance;
}
