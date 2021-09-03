package com.company;

public class MedicalShifts implements  Comparable<MedicalShifts> {
    private int number;
    private static int ID;
    private int myInt;
    private String name;

    public MedicalShifts(String nombre, int i) {
        myInt = ID++;
        name = nombre;
        this.number = i;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(MedicalShifts o) {
        return Integer.compare(this.getNumber(), o.getNumber());
    }

    public int getNumber() {
        return number;
    }

    public int getID()
    {
        return this.myInt;
    }

}
