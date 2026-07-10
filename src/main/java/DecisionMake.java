//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class DecisionMakingExample {
    public DecisionMakingExample() {
    }

    public static void main(String[] var0) {
        for(int var1 = 1; var1 <= 5; ++var1) {
            System.out.println("Count is: " + var1);
        }

        byte var3 = 85;
        if (var3 >= 90) {
            System.out.println("Grade: A");
        } else if (var3 >= 80) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }

        byte var2 = 3;
        switch (var2) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            default -> System.out.println("Invalid day");
        }

    }
}
