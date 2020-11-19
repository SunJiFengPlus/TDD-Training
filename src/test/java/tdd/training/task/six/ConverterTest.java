package tdd.training.task.six;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 *
 * 1码 应该等于 3英尺
 * 1码 应该等于 36英寸
 *
 * @author 孙继峰
 * @since 2020/11/19
 */
public class ConverterTest {

    @DisplayName("输入1英尺,返回12英寸")
    @Test
    public void test1() {
        Converter converter = new Converter();
        int inch = converter.convertFootToInch(1);
        assertThat(inch).isEqualTo(12);
    }

    @DisplayName("输入2英尺,返回24英寸")
    @Test
    public void test2() {
        Converter converter = new Converter();
        int inch = converter.convertFootToInch(2);
        assertThat(inch).isEqualTo(24);
    }

    @DisplayName("输入1码,返回3英尺")
    @Test
    public void test3() {
        Converter converter = new Converter();
        int foot = converter.convertYardToFoot(1);
        assertThat(foot).isEqualTo(3);
    }

    @DisplayName("输入2码,返回6英尺")
    @Test
    public void test4() {
        Converter converter = new Converter();
        int foot = converter.convertYardToFoot(2);
        assertThat(foot).isEqualTo(6);
    }

    @DisplayName("输入1码,返回36英寸")
    @Test
    public void test5() {
        Converter converter = new Converter();
        int inch = converter.convertYardToInch(1);
        assertThat(inch).isEqualTo(36);
    }

    @DisplayName("输入2码,返回72英寸")
    @Test
    public void test6() {
        Converter converter = new Converter();
        int inch = converter.convertYardToInch(2);
        assertThat(inch).isEqualTo(72);
    }


}
