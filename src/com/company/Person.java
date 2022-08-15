package com.company;

public class Person {
    private String name;
    private String designation;

    public Person(String name,String designation ) {
        this.name = name;
        this.designation = designation;
    }
    public String learn(){
        return "learning something new";
    }
    public String walk(){
        return "walks when wants";
    }
    public String eat(){
        return "eat when wants";
    }
    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
