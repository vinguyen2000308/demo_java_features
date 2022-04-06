package _1_demo_annotation._1_will_throw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Class<TestClass> testClassClass = TestClass.class;
        Method[] declaredMethods = testClassClass.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; i++) {
            Method declaredMethod = declaredMethods[i];
            Annotation[] annotations = declaredMethod.getAnnotations();
            for (int j = 0; j < annotations.length; j++) {
                Annotation annotation = annotations[j];
                if (annotation.annotationType().getSimpleName().equals(MustEnterByHand.class.getSimpleName())) {
                    String enteredValue = ((MustEnterByHand) annotation).enterValue();
                    if (Objects.nonNull(enteredValue))
                        System.out.println(enteredValue);
                    else {
                        String s = scanner.nextLine();
                        System.out.println(s);
                    }
                }
            }
        }
    }

    public static void testAnnotation() {
        // get class object reference
        Class<TestClass> testCaseClass = TestClass.class;

        // Get all annotations on the class declaration
        Annotation[] allAnns = testCaseClass.getAnnotations();
        printInfo(allAnns);

        // Get all annotations on the method declaration
        Method[] methodAnns = testCaseClass.getDeclaredMethods();
        for (int i = 0; i < methodAnns.length; i++) {
            Method methodInfo = methodAnns[i];
            System.out.println("Annotations for method:" + methodInfo.getName());
            Annotation[] annotations = methodInfo.getAnnotations();
            printInfo(annotations);

        }

    }

    public static void printInfo(Annotation[] allAnns) {
        System.out.println("Annotation count: " + allAnns.length);
        // Print all annotations
        for (Annotation ann : allAnns) {
            System.out.println(ann.annotationType());
        }


    }

    @TestCase(willThrow = IllegalAccessException.class)
    public static void testCase1() {
        System.out.println("Hallo");
    }
}
