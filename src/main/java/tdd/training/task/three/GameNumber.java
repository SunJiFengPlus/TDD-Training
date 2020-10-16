package tdd.training.task.three;

/**
 * @author 孙继峰
 * @since 2020/10/16
 */
public class GameNumber {
    private final int number;

    public GameNumber(int input) {
        this.number = input;
    }

    @Override
    public String toString() {
        if (number % 3 == 0 && String.valueOf(number).contains("5")) {
            return "fizzbuzz";
        }
        if (number % 3 == 0 && number % 5 == 0) {
            return "fizzbuzz";
        }
        if (String.valueOf(number).contains("3") && number % 5 == 0) {
            return "fizzbuzz";
        }
        if (String.valueOf(number).contains("3") && String.valueOf(number).contains("5")){
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