package demo_design_pattern.factory_pattern.demo_1;

@ShapeImplemented
public class Rectangle implements Shape{

    @Override
    public void draw()
    {
        System.out.println("This is a rectangular");
    }
}
