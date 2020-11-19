package tdd.training.task.six;

/**
 * @author 孙继峰
 * @since 2020/11/19
 */
public abstract class LengthUnit {
    public static LengthUnit ofFoot(int n) {
        return new Foot(n);
    }
    public static LengthUnit ofYard(int n) {
        return new Yard(n);
    }


    abstract double convertToInch();
    abstract double convertToFoot();
    abstract double convertToYard();
}
