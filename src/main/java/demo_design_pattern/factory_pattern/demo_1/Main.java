package demo_design_pattern.factory_pattern.demo_1;
// Find more information about package-info
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Square shape = (Square) ShapeFactory.getShape(Square.class.getName());
        shape.draw();
        shape.drawInSquare("This is message for square");


    }
}
