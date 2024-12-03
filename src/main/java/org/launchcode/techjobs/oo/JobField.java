package org.launchcode.techjobs.oo;

public abstract class JobField {

    //what fields do Employer, Location, Position Type and Location all have in common?
        //private int id;
    //    private static int nextId = 1;
    //    private String value;

    //Which constructors are the same in all four classes
        //the empty constructors
        //the constructor with String value as an argument

    //what getters and setters do all of the classes share
        //getValue
        //getId
        //setValue

    //which custom methods are identical in all the classes
        //toString
            //confused about hashCode
            //confused about equals
            //these are slightly different for each class, but not sure if
            //maybe that is an error and those need to be fixed?
            //or they are supposed to be slightly different?

    private int id;
    private static int nextId = 1;
    private String value;


    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }



    @Override
    public String toString() {
        return value;
    }

    public abstract boolean equals();




}
