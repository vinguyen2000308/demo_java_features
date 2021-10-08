
package demo_design_pattern.factory_pattern.demo_1;

@ShapeImplemented
public class Square implements Shape {

    @Override
    public void draw() {

        System.out.println("This is a square");
    }
    public void drawInSquare(String message)
    {
        System.out.println("Message: " + message);
    }
}
