package demo_design_pattern.factory_pattern.demo_1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PACKAGE,ElementType.TYPE})
public @interface ShapeImplemented {
    Class<?>[] implementationsOfShape() default {};
}
