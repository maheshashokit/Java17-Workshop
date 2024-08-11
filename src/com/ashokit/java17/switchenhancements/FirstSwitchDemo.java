package com.ashokit.java17.switchenhancements;

public class FirstSwitchDemo {

    public static void beforeJava17SwitchStatement(int number){
        String result;
        switch(number) {
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            default:
                result = "unknown";
                break;
        }
        System.out.println("Before Java17 = " + result);
    }

    public static void java17SwitchStatement(int number){

        String value = switch(number){
            case 1  ->  "One";
            case 2  ->  "Two";
            default -> "default Value";
        };
        System.out.println("Java17 = " + value);

    }

    public static void main(String[] args) {
        beforeJava17SwitchStatement(1);
        java17SwitchStatement(1);
    }
}
