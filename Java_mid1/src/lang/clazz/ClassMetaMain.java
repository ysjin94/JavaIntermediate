package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception {
        //get class info
        Class stringClass = String.class; // from Class
//        Class clazz1 = new String().getClass(); // from instance
//        Class clazz2 = Class.forName("java.lang.String"); // from String

        //Print out All field
        Field[] declaredFields = stringClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
//            System.out.println("field :" + declaredField);
            System.out.println("field :" + declaredField.getType() + " " + declaredField.getName()); ;
        }

        //Printout All method
        Method[] declaredMethods = stringClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("declaredMethod : " + declaredMethod);
        }

        //Print super class
        System.out.println("Superclass : " + stringClass.getSuperclass().getName());

        //Print interface
        Class[] interfaces = stringClass.getInterfaces();
        for (Class i : interfaces) {
            System.out.println("Interface: " + i.getName());
        }
    }
}
