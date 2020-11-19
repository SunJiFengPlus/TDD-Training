package tdd.training.task.six;

/**
 * @author 孙继峰
 * @since 2020/11/19
 */
public class Yard extends LengthUnit {
    private final int n;

    public Yard(int n) {
        this.n = n;
    }

    @Override
    double convertToInch() {
        return n * 36;
    }

    @Override
    double convertToFoot() {
        return n * 3;
    }

    @Override
    double convertToYard() {
        return 0;
    }
}
