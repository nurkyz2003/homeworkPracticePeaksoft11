package com.company;

public class Programmer extends Person{
    private String companyName;
    public Programmer(String name,String designation,String companyName){
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
    public String coding(){
        return "Coding in LeetCood";
    }

    @Override
    public String toString() {
        return "Programmer{" +
        "Name = " + getName() + '\n' +
                "Designation = " + getDesignation() + '\n' +
                "CompanyName = " + companyName + '\n' + learn() + '\n' + walk() +
                '\n'  + eat() + '\n'  + coding() +
                '}'  + "\n---------------------------------------------------";
    }
}
