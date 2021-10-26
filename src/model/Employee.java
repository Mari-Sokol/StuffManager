package model;

import model.AbstractPerson;

final public class Employee extends AbstractPerson {

    private final String department;
    private final int age;
    private final String phone;
    private final String position;
    private final String gender;

    public Employee(String name, String department, String position, String gender, int age, String phone) {
        super(name);
        this.department = department;
        this.age = age;
        this.phone = phone;
        this.position = position;
        this.gender = gender;
    }

    public Employee(String name, String department, int age, String phone, String position, String gender) {
        super();
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public String getGender() {
        return gender;
    }


    public String think() {
        return "I'm a employee";
    }
}

