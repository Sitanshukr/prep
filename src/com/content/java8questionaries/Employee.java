package com.content.java8questionaries;

import java.util.Objects;

public class Employee {
    public Employee(String name, int age) {
        this.name=name;
        this.age= String.valueOf(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    String name;
    String age;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same reference check
        if (obj == null || getClass() != obj.getClass()) return false; // Class check
        Employee person = (Employee) obj;
        return this.age.equals(person.age) && this.name.equals(person.name);

    }
    @Override
    public int hashCode() {
        return Integer.valueOf(this.age);
    }

}
