package com.ashokit.java17.switchenhancements;

public class SwitchStatementWithReturnValue {

    static String formatter(Object obj) {
        return switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s  -> "String: " + s;
            case null      -> "Null value";
            default        -> "Unknown type";
        };
    }

    static String classifyNumber(Number number) {
        return switch (number) {
            case Integer i -> i % 2 == 0 ? "Even Integer" : "Odd Integer";
            case Double d  -> d > 0 ? "Positive Double" : "Non-positive Double";
            default        -> "Unknown Number";
        };
    }


    public static void main(String[] args) {
        String formatterValue = formatter(25);
        System.out.println("formatterValue = " + formatterValue);

        String numberResult = classifyNumber(10);
        System.out.println("numberResult = " + numberResult);

        String doubleNumberResult = classifyNumber(-25.368);
        System.out.println("doubleNumberResult = " + doubleNumberResult);

    }
}
