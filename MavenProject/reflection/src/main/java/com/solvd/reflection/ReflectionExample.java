
package com.solvd.reflection;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.List;

public class ReflectionExample {
    public static void main(String[] args) {
        // Reflect on BaseClass
        Class<?> baseClass = BaseClass.class;
        printClassInformation(baseClass);

        // Create an object of BaseClass using reflection
        try {
            Object baseObject = baseClass.getDeclaredConstructor().newInstance();
            invokeMethod(baseObject, "baseMethod");
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }

        // Perform similar reflection operations on other classes in the hierarchy
        // ...

        // Example of Java streams
        List<String> stringList = Arrays.asList("apple", "banana", "orange", "grape");
        stringList.stream()
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    private static void printClassInformation(Class<?> clazz) {
        System.out.println("Class: " + clazz.getName());

        // Extract information about fields
        System.out.println("Fields:");
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println("  " + Modifier.toString(field.getModifiers()) + " " +
                    field.getType().getSimpleName() + " " + field.getName());
        }

        // Extract information about constructors
        System.out.println("Constructors:");
        for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
            System.out.println("  " + Modifier.toString(constructor.getModifiers()) + " " +
                    constructor.getName() + "(" + Arrays.toString(constructor.getParameterTypes()) + ")");
        }

        // Extract information about methods
        System.out.println("Methods:");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println("  " + Modifier.toString(method.getModifiers()) + " " +
                    method.getReturnType().getSimpleName() + " " + method.getName() +
                    "(" + Arrays.toString(method.getParameterTypes()) + ")");
        }

        System.out.println();
    }

    private static void invokeMethod(Object object, String methodName) {
        try {
            Method method = object.getClass().getDeclaredMethod(methodName);
            method.setAccessible(true);
            method.invoke(object);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
