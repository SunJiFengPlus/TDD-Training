package tdd.training.task.four;

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
        StringBuilder resBuilder = new StringBuilder();
        if (isRelatedTo(3)) {
            resBuilder.append("fizz");
        }
        if (isRelatedTo(5)) {
            resBuilder.append("buzz");
        }
        return resBuilder.length() == 0 ? String.valueOf(number) : resBuilder.toString();
    }

    public boolean isRelatedTo(int n) {
        return number % n == 0 || String.valueOf(number).contains(String.valueOf(n));
    }
}