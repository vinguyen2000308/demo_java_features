package _2_demo_inner_classes.vd_2_6;

public class ClassA {

    private static final String MY_NAME = "Nguyen Van Vi";
    private int age;

    public static class ClassB {

        public void printName() {
            System.out.println(MY_NAME);
        }

    }
}
