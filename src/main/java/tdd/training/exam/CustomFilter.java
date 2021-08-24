package tdd.training.exam;


import com.google.common.collect.HashMultiset;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author 孙继峰
 * @since 2021/8/23
 */
public class CustomFilter {
    
    List<Integer> input;
    
    public CustomFilter(List<Integer> asList) {
        input = asList;
    }
    
    public List<Integer> distinct() {
        HashMultiset<Integer> counter = input.stream().collect(Collectors.toCollection(HashMultiset::create));
        return input.stream().distinct()
                .filter(a -> Objects.equals(counter.count(a), 1))
                .collect(Collectors.toList());
    }
}
