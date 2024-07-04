package HelpToFigures;

abstract public class Figure {

    protected final Point point;

    protected Figure(Point point) {
        this.point = point;
    }

    public abstract double area();
    public abstract double perimeter();

}
