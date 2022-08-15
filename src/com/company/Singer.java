package com.company;

public class Singer extends Person{
    private String bandName;
    public Singer(String name, String designation, String bandName){
        super(name, designation);
        this.bandName = bandName;
    }
    public String getBandName() {
        return bandName;
    }
    public String singing(){
        return "Signing american songs";
    }
    public String playGitar(){
        return "Play in Gitar";
    }

    @Override
    public String toString() {
        return "Singer{" +
                "Name = " + getName() + '\n' +
                "Designation = " + getDesignation() + "BandName = " + bandName + '\n' +
                  learn() + '\n' + walk() +
                '\n' + eat() + '\n'  + singing() + '\n' + playGitar() +
                '}'  + "\n---------------------------------------------------";
    }
}
