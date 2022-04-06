package _2_demo_inner_classes.vd_2_5;

import _2_demo_inner_classes.vd_2_4.RandomInteger;

public class Main {
    public static void main(String[] args) {
        new Object() {
            // An instance initializer
            {
                System.out.println("Hello from an anonymous class.");
            }
        }; // A semi-colon is necessary to end the statement
    }

    public RandomInteger getRandomInteger() {
        // Anonymous inner class that inherits the RandomInteger class
        return new RandomInteger() {
            public int getValue() {
                // Get two random integers and return
                // the average ignoring the fraction part
                long n1 = rand.nextInt();
                long n2 = rand.nextInt();
                int value = (int)((n1 + n2)/2);
                return value;
            }
        };
    }
}

