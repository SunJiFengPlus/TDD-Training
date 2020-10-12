package tdd.training.task.two;

/**
 * @author 孙继峰
 * @since 2020/10/12
 */
public class GameNumber {
    private final int number;

    public GameNumber(int i) {
        this.number = i;
    }

    @Override
    public String toString() {
        if (number % 3 == 0 && number % 5 == 0) {
            return "fizzbuzz";
        } else if (number % 3 == 0) {
            return "fizz";
        } else if (number % 5 == 0) {
            return "buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
