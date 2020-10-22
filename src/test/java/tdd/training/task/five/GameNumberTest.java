package tdd.training.task.five;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * tdd第五次训练: 11'38″
 *
 * 短板:
 * 对键位不熟悉, 像 & % 5 这种总是按错
 * 在测试用例里创建类的时候默认是在test目录下创建, 需要手动点选main目录
 *
 * 还有另外一个发现, 我的完成时间与我拆分出的case数量有关
 *
 * @author 孙继峰
 * @since 2020/10/22
 */
public class GameNumberTest {
    @ParameterizedTest
    @CsvSource({
            "1,1",
            "3,fizz",
            "5,buzz",
            "15,fizzbuzz",
            "52,buzz",
            "31,fizz",
            "35,fizzbuzz"
    })
    public void fizzbuzzTest(int input, String output) {
        GameNumber gameNumber = new GameNumber(input);
        assertThat(gameNumber.toString()).isEqualTo(output);
    }
}
