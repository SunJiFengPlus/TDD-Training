package tdd.training.exam;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author 孙继峰
 * @since 2021/8/23
 */
public class Distinct {
    
    List<Integer> input;
    
    public Distinct(List<Integer> asList) {
        input = asList;
    }
    
    public List<Integer> distinct() {
        HashMap<Integer, Integer> map = new HashMap<>();
        input.forEach(i -> map.compute(i, (k, v) -> {
            if (Objects.isNull(v)) {
                return 1;
            }
            return v + 1;
        }));
        return map.entrySet()
                .stream()
                .filter(a -> Objects.equals(a.getValue(), 1))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
