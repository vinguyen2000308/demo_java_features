package _2_demo_inner_classes.vd_2_4;

import java.util.Random;

public class RandomInteger {
    protected Random rand = new Random();
    public int getValue() {
        return rand.nextInt();
    }
}
