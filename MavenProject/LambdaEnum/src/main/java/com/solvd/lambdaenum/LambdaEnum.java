
package com.solvd.lambdaenum;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import exceptions.CustomException;

public class LambdaEnum {

    public static void main(String[] args) {
        // Lambda function 1: Predicate
        Predicate<Integer> isEven = num -> num % 2 == 0;

        // Lambda function 2: Function
        Function<Integer, String> toString = value -> "Number: " + value;

        // Lambda function 3: Consumer
        Consumer<String> printMessage = message -> System.out.println(message);

        // Lambda function 4: Supplier
        Supplier<Double> randomDouble = () -> Math.random();

        // Lambda function 5: BinaryOperator
        BinaryOperator<Integer> add = (a, b) -> a + b;

        // Usage examples
        System.out.println(isEven.test(4));               // true
        System.out.println(toString.apply(10));           // Number: 10
        printMessage.accept("Hello, Lambda!");            // Hello, Lambda!
        System.out.println("Random Double: " + randomDouble.get());
        System.out.println("Sum: " + add.apply(5, 7));     // Sum: 12

        // Custom Lambda function 1: Concatenate two strings
        BiFunction<String, String, String> concatenateStrings = (a, b) -> a + b;

        // Custom Lambda function 2: Compare two objects
        BiPredicate<Integer, Integer> isGreaterThan = (x, y) -> x > y;

        // Custom Lambda function 3: Get the first element from a list
        Function<List<? extends Number>, Number> getFirstElement = list -> list.get(0);

        // Custom Lambda function examples
        System.out.println(concatenateStrings.apply("Hello, ", "World!"));  // Hello, World!
        System.out.println(isGreaterThan.test(5, 3));                        // true
        System.out.println(getFirstElement.apply(Arrays.asList(1, 2, 3)));   // 1
    }
}
