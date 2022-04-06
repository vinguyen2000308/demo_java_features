package _1_demo_annotation._1_will_throw;


public class TestClass {


    @MustEnterByHand(enterValue = "Nguyen Van Vi")
    public void testCase1() {
        System.out.println("This is test case 1");
    }
}
