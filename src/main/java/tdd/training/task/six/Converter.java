package tdd.training.task.six;

/**
 * @author 孙继峰
 * @since 2020/11/19
 */
public class Converter {
    public int convertFootToInch(int foot) {
        return (int) LengthUnit.ofFoot(foot).convertToInch();
    }

    public int convertYardToFoot(int yard) {
        return (int) LengthUnit.ofYard(yard).convertToFoot();
    }

    public int convertYardToInch(int yard) {
        return (int) LengthUnit.ofYard(yard).convertToInch();
    }
}
