package _1_demo_annotation._2_java_json;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface JsonField {

    public String value() default "";
    // value -> single element annotation
    // allows uses of our annotation to supply a single parameter to the annotation without specifying the name of the parameter

    // How to process



}
