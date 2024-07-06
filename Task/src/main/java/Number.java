public class Number {

    Change change = new Change();

    public Number(){}

    public Number(Change change) {
        this.change = change;
    }

    public double increaseByNine(Double num) {
        for (int i = 0; i < 3; ++i) {
            num = change.increaseByThree(num);
        }
        return num;
    }

    public double decreaseBySix(double num) {
        for (int i = 0; i < 2; ++i) {
            num = change.decreaseByThree(num);
        }
        return num;
    }

}
