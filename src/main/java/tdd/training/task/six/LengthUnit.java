package tdd.training.task.six;

import java.util.Objects;

/**
 * @author 孙继峰
 * @since 2020/11/19
 */
public abstract class LengthUnit {
    public static LengthUnit of(int n, String unit) {
        if (Objects.equals(unit, "Foot")) {
            return new Foot(n);
        } else {
            return new Yard(n);
        }
    }

    abstract double convertToInch();
    abstract double convertToFoot();
    abstract double convertToYard();
}
