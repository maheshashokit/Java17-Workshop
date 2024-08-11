package com.ashokit.java17.switchenhancements;

public class PatternMatchingSwitchDemo {

    public static String beforePatternMatching(Object o) {
        String formatted = "unknown";
        if (o instanceof Integer i) {
            formatted = String.format("int %d", i);
        } else if (o instanceof Long l) {
            formatted = String.format("long %d", l);
        } else if (o instanceof Double d) {
            formatted = String.format("double %f", d);
        } else if (o instanceof String s) {
            formatted = String.format("String %s", s);
        }
        return formatted;
    }

    static String patternMatching(Object obj) {
        return switch (obj) {
            case Integer i -> String.format("Integer %d", i);
            case Long l    -> String.format("long %d", l);
            case Double d  -> String.format("double %f", d);
            case String s  -> String.format("String %s", s);
            default        -> obj.toString();
        };
    }


    public static void main(String[] args) {
        String beforeJava17 = beforePatternMatching(10);
        System.out.println("beforeJava17 = " + beforeJava17);

        String patternMatching = patternMatching("AshokIT");
        System.out.println("patternMatching = " + patternMatching);


    }
}
