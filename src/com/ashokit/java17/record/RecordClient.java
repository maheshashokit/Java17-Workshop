package com.ashokit.java17.record;

public class RecordClient {

    public static void main(String[] args) {

        System.out.println("******* Normal Immutable Class************");
        Person person = new Person("Ashok",35);
        System.out.println("person = " + person);
        System.out.println("Name::::" + person.getName() + " Age:::::" + person.getAge()) ;

        System.out.println();
        System.out.println("******* Record Immutable Class************");
        PersonRecord personRecord = new PersonRecord("Mahesh",35);
        System.out.println(personRecord);
        System.out.println("Name::::" + personRecord.name() + " Age:::::" + personRecord.age());
        PersonRecord.displayDetails();

    }
}
