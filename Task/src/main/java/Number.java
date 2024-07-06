public class Number {

    Change change = new Change();

    public double increaseByFive(Double num) {
        num += 2;
        return change.increaseByThree(num);
    }

    public double decreaseByFive(double num) {
        num -= 2;
        return change.decreaseByThree(num);
    }

}
