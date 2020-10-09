package tdd.training.task.one;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 第一次FizzBuzz训练: 19′38″
 */
public class FizzBuzzTest {
    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @DisplayName("输入1, 返回1")
    @Test
    public void testFizzBuzz1() {
        String res = fizzBuzz.calculate(1);

        assertThat(res).isEqualTo("1");
    }

    @DisplayName("输入2, 返回2")
    @Test
    public void testFizzBuzz2() {
        String res = fizzBuzz.calculate(2);

        assertThat(res).isEqualTo("2");
    }

    @DisplayName("输入3, 返回fizz")
    @Test
    public void testFizzBuzz3() {
        String res = fizzBuzz.calculate(3);

        assertThat(res).isEqualTo("fizz");
    }

    @DisplayName("输入5, 返回buzz")
    @Test
    public void testFizzBuzz4() {
        String res = fizzBuzz.calculate(5);

        assertThat(res).isEqualTo("buzz");
    }

    @DisplayName("输入15, 返回fizzbuzz")
    @Test
    public void testFizzBuzz5() {
        String res = fizzBuzz.calculate(15);

        assertThat(res).isEqualTo("fizzbuzz");
    }

}