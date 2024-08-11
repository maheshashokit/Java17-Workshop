package com.ashokit.java17.switchenhancements;

public class SwitchStatementWithNullHandling {

    public static void testFooBar(String s) {
        if (s == null) {
            System.out.println("oops!");
            return;
        }
        switch (s) {
            case "Foo", "Bar" -> System.out.println("Great");
            default           -> System.out.println("Ok");
        }
    }

    public static String describe(Object obj) {
        return switch (obj) {
            case null      -> "It's null!";
            case Integer i -> "An Integer";
            case String s  -> "A String";
            default        -> "Something else";
        };
    }

    public static void main(String[] args) {
        testFooBar(null);

        String message = describe("Welcome To AshokIT");
        System.out.println("message = " + message);

        String messageNullValue = describe(null);
        System.out.println("messageNullValue = " + messageNullValue);
    }
}
