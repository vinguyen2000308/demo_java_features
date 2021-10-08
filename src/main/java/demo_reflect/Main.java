package demo_reflect;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class cls = Class.forName("AdminAPI");
        Method methodList[] = cls.getDeclaredMethods();
        // Get field list
        // Get method list
        for (int i = 0; i < methodList.length; i++) {
                Method m = methodList[i];
            System.out.println(m.getName());
            System.out.println("Decl class"  + m.getDeclaringClass());
            // Get Parameter List
            Class pvec[] = m.getParameterTypes();
            for (int j = 0; j < pvec.length; j++)
                System.out.println("param #" + j + " " + pvec[j]);
            Class evec[] = m.getExceptionTypes();
            // Get Return Type List
            for (int j = 0; j < evec.length; j++)
                System.out.println("exc #" + j + " " + evec[j]);
            System.out.println("return type = " + m.getReturnType());
            System.out.println("-----");
        }
        // Invoke Methods by Name
        Class  partypes[] = new Class[2];
        for (int i = 0; i < methodList.length; i++) {
            Method m = methodList[i];
            if (m.getName().equalsIgnoreCase("add")) {
                // Get parameter info
                Class paraTypes[] = m.getParameterTypes();
                Class inputParamTypes[] = new Class[paraTypes.length];
                for (int j = 0; j < paraTypes.length; j++) {
                    inputParamTypes[j] = paraTypes[j];
                }
                Method meth = cls.getMethod(m.getName(),paraTypes);
                Object argList[] = new Object[paraTypes.length];
                for (int j = 0; j < argList.length; j++) {
                    argList[j] = getValue(partypes[j]);
                }
            }
        }
    }

    private static Object getValue(Class parType) {
        if (parType.getTypeName().equalsIgnoreCase("String"))
            return new String("This is string");
        if (parType.getTypeName().equalsIgnoreCase(Integer.class.getName()))
            return Math.random();
        throw new IllegalArgumentException();
    }
}
