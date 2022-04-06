package _2_demo_inner_classes.vd_2_4;

public class Main {
    public static void main(String[] args) {
        // Generate random integers using the RandomIntegerLocal class
        RandomLocal local = new RandomLocal();
        RandomInteger rLocal = local.getRandomInteger();
        System.out.println("\nRandom integers using local inner class:");
        System.out.println(rLocal.getValue());
        System.out.println(rLocal.getValue());
        System.out.println(rLocal.getValue());

    }

}
