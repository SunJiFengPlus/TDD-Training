package tdd.training.task.one;

import java.util.stream.Stream;

/**
 * @author 孙继峰
 * @since 2020/10/9
 */
public class FizzBuzz {
    public static String calculate(int input) {
        if (input % 3 == 0 && input % 5 == 0) {
            return "fizzbuzz";
        } else if (input % 3 == 0) {
            return "fizz";
        } else if (input % 5 == 0) {
            return "buzz";
        } else {
            return String.valueOf(input);
        }
    }

    public static void main(String[] args) {
        Stream.iterate(1, i -> i+1)
                .limit(100)
                .map(FizzBuzz::calculate)
                .forEach(System.out::println);
    }
}
