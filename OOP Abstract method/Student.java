package com.company;

public class Student extends User{
    private String name;
    private String surname;
    private String group;
    private double gpa;

    public Student(){

    }

    public Student(int id, String login, String password, String name, String surname, String name1, String surname1, String group, double gpa) {
        super(id, login, password, name, surname);
        this.name = name1;
        this.surname = surname1;
        this.group = group;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getUserData() {
        return "Student{" +
                "Name: " + getName() + '\'' +
                "Surname: " + getSurname() + '\'' +
                "Group: " + getGroup() + '\'' +
                "GPA: " + getGpa() + '\'' +
                '}';
    }

}
