package tdd.training.task.five;

/**
 * @author 孙继峰
 * @since 2020/10/22
 */
public class GameNumber {
    int number;

    public GameNumber(int input) {
        this.number = input;
    }

    @Override
    public String toString() {
        if ((number % 3 == 0 || String.valueOf(number).contains("3")) && (number % 5 == 0 || String.valueOf(number).contains("5"))) {
            return "fizzbuzz";
        }
        if (number % 3 == 0 || String.valueOf(number).contains("3")) {
            return "fizz";
        }
        if (number % 5 == 0 || String.valueOf(number).contains("5")) {
            return "buzz";
        }
        return String.valueOf(number);
    }
}
