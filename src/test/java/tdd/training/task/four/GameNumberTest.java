package tdd.training.task.four;

import tdd.training.task.four.GameNumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 第四次tdd训练: 重构
 * 新的不变, 旧的创建, 一步替换, 旧的再见
 *
 * @author 孙继峰
 * @since 2020/10/16
 */
public class GameNumberTest {
    /**
     * 包含3或能被3整除, 那就是 fizz
     * 包含5或能被5整除, 那就是 buzz
     *
     * 大胆猜想, 合理假设, 谨慎求证 (由发散到收束的过程)
     *
     * 能被3整除的 -> fizz
     * 包含3的 -> fizz
     * 既包含3又能被3整除的 -> fizz
     * 能被5整除的 -> buzz
     * 包含5的 -> buzz
     * 既包含5又能被5整除的 -> buzz
     * 既包含3又包含5 -> fizzbuzz
     * 既包含3又能被5整除的 -> fizzbuzz
     * 既能被3整除又能被5整除的 -> fizzbuzz
     * 既能被3整除又包含5的 -> fizzbuzz
     */
    @ParameterizedTest
    @CsvSource({
            "1,1",
            "2,2",
            "3,fizz",
            "5,buzz",
            "23,fizz",
            "52,buzz",
            "33,fizz",
            "55,buzz",
            "53,fizzbuzz",
            "30,fizzbuzz",
            "15,fizzbuzz",
            "51,fizzbuzz",
            "935,fizzbuzz"
    })
    public void test(int input, String output) {
        GameNumber gameNumber = new GameNumber(input);
        assertThat(gameNumber.toString()).isEqualTo(output);
    }
}
