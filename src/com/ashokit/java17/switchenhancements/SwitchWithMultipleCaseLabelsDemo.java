package com.ashokit.java17.switchenhancements;

public class SwitchWithMultipleCaseLabelsDemo {

    public static void beforeJava17WithMultipleCaseValue(int number){
        switch(number) {
            case 1:
                System.out.println("one");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("two, three, or four");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }

    public static void java17WithMultipleCaseValue(int number){
        switch (number) {
            case 1 -> System.out.println("one");
            case 2, 3, 4 -> System.out.println("two, three, or four");
            default -> System.out.println("unknown");
        }
    }

    public static void main(String[] args) {
        System.out.println("*******Before Java17 Version *******");
        beforeJava17WithMultipleCaseValue(2);
        beforeJava17WithMultipleCaseValue(3);
        beforeJava17WithMultipleCaseValue(4);

        System.out.println();

        System.out.println("*******Java17 Version *******");
        java17WithMultipleCaseValue(2);
        java17WithMultipleCaseValue(3);
        java17WithMultipleCaseValue(4);
    }
}
