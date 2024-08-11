package com.ashokit.java17.record;

public record PersonRecord(String name, int age) {

    //Defining the Static fields in record class
    public static final String DEFAULT_PERSON_NAME = "MAHESH";

    //Overriding the record class constructor
    public PersonRecord(String name,int age){
        this.name = name;
        this.age = age;
    }

    //Defining instance method in record class
    public String convertNameUpperCase(){
        return name.toUpperCase();
    }

    //Defining static method in record class
    public static void displayDetails(){
        System.out.println("Inside the PersonRecord static displayDetails()......." + DEFAULT_PERSON_NAME);
    }
}
//NOTE : We can't define the non-static fields inside record class
//Record can't extend any other class because by default every record class parent class in record.
//By default all record class implicitly defined as final hence extension is not possible.
//record class can implement no of interfaces.