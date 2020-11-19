package tdd.training.task.six;

/**
 * @author 孙继峰
 * @since 2020/11/19
 */
public class Converter {
    public int convertFootToInch(int foot) {
        return (int) LengthUnit.of(foot, "Foot").convertToInch();
    }

    public int convertYardToFoot(int yard) {
        return (int) LengthUnit.of(yard, "Yard").convertToFoot();
    }

    public int convertYardToInch(int yard) {
        return (int) LengthUnit.of(yard, "Yard").convertToInch();
    }
}
