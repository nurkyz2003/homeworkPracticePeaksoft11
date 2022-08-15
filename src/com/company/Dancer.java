package com.company;

public class Dancer extends Person{
    private String groupName;
    public Dancer(String name, String designation,String groupName){
        super(name, designation);
        this.groupName = groupName;
    }
    public String getGroupName() {
        return groupName;
    }
    public String dancing(){
        return "Dancing TikTik dances";
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "Name = " + getName() + '\n' +
                "Designation = " + getDesignation() + '\n'  + learn() + '\n'  + walk() +
                '\n' + eat() +
                "GroupName = " + groupName + '\n' + dancing() +
                '}' + "\n---------------------------------------------------";
    }
}
