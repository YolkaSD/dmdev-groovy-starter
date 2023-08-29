package org.example.less9

import java.util.function.Function
import java.util.stream.Stream

class ClosureRunner {
    static void main(String[] args) {
        Function<Integer, Integer> function = value -> value + value

//        def result = function.apply(5)
//        println result

        Closure closure = {
//            println it
            it + it
        }

        def result = closure.call(5)
        println result

        Stream.of(1, 2, 3, 4, 5)
//                .map(value -> value + value)
//                .map(function)
                .map(closure)
//                .map(String::valueOf)
                .map(String.&valueOf)
                .forEach(System.out::println)

    }
}
