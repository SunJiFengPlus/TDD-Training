package tdd.training.task.six;

/**
 * @author 孙继峰
 * @since 2020/11/19
 */
public class Foot extends LengthUnit {
    private final int n;

    public Foot(int n) {
        this.n = n;
    }

    @Override
    double convertToInch() {
        return n * 12;
    }

    @Override
    double convertToFoot() {
        return 0;
    }

    @Override
    double convertToYard() {
        return 0;
    }
}
