public class Number {

    public double divideNums(Double divisible, double divider) throws ArithmeticException {
        if (divider == 0)
            throw new ArithmeticException();
        return divisible / divider;
    }

}
