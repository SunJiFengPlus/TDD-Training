package tdd.training.task.two;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 第一次FizzBuzz训练: 12′33″
 *
 * 快捷键:
 * control + R 运行当前context, 之前 command + R 运行当前测试类的全部方法后, 当前测试类就是context
 * command + shift + T 在测试类与被测试类之前切换
 *
 * @author 孙继峰
 * @since 2020/10/12
 */
public class GameNumberTest {
    @DisplayName("输入1返回1")
    @Test
    public void test1() {
        GameNumber gameNumber = new GameNumber(1);

        assertThat(gameNumber.toString()).isEqualTo("1");
    }

    @DisplayName("输入2返回2")
    @Test
    public void test2() {
        GameNumber gameNumber = new GameNumber(2);
        assertThat(gameNumber.toString()).isEqualTo("2");
    }

    @DisplayName("输入3返回fizz")
    @Test
    public void test3() {
        GameNumber gameNumber = new GameNumber(3);
        assertThat(gameNumber.toString()).isEqualTo("fizz");
    }

    @DisplayName("输入5返回buzz")
    @Test
    public void test4() {
        GameNumber gameNumber = new GameNumber(5);
        assertThat(gameNumber.toString()).isEqualTo("buzz");
    }

    @DisplayName("输入15返回fizzbuzz")
    @Test
    public void test5() {
        GameNumber gameNumber = new GameNumber(15);
        assertThat(gameNumber.toString()).isEqualTo("fizzbuzz");
    }
}
