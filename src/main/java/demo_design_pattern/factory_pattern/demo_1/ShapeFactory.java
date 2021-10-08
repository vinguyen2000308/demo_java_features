package demo_design_pattern.factory_pattern.demo_1;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class ShapeFactory {

    // How to make this become factory
    public static List<String> getImplementedClass() {
        Package[] packages = Package.getPackages();
        List<String> classNameList = new ArrayList<>();
        for (Package p : packages) {
            ShapeImplemented annotation = p.getAnnotation(ShapeImplemented.class);
            if (annotation != null) {
                Class<?>[] implementations = annotation.implementationsOfShape();
                for (Class<?> impl : implementations)
                    classNameList.add(impl.getName());
            }
        }
        return classNameList;
    }

    public static  Shape getShape(String shapeType) throws ClassNotFoundException {
        List<String> implementedClasses = getImplementedClass();
        if (shapeType == null)
            return null;
        for (String implementedClass: implementedClasses) {
            if (implementedClass.equalsIgnoreCase(shapeType)) {
                Class<?> aClass = Class.forName(shapeType);
                try {
                    Object iClass = aClass.getDeclaredConstructor().newInstance();
                    return (Shape) iClass;
                } catch (InstantiationException | IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
