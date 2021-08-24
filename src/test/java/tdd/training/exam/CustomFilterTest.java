package tdd.training.exam;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CustomFilterTest {
    
    /**
     * 过滤掉出现次数不为 1 的数
     * 输入 [1,2,1,3,5,6,5,7,6,1],输出 [2,3,7]
     */
    @Test
    public void testDistinct1() {
        CustomFilter customFilter = new CustomFilter(Arrays.asList(1, 2, 1, 3, 5, 6, 5, 7, 6, 1));
        List<Integer> res = customFilter.distinct();
        assertThat(res).containsAll(Arrays.asList(2,3,7));
    }
}