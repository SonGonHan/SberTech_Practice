import Figures.*;
import HelpToFigures.Color;
import HelpToFigures.Point;

public class PaintExample {
    public static void main(String[] args) {
        Point point = new Point(0, 0);
        Circle circle = new Circle(point, 5);
        Rectangle rectangle = new Rectangle(point, 5, 7);
        Square square = new Square(point, 5);
        Triangle triangle = new Triangle(point, 5, 4, 6, 10, 15);
        System.out.println(FigureUtil.area(triangle));
        System.out.println(FigureUtil.perimeter(rectangle));
        FigureUtil.draw(square);
        FigureUtil.draw(circle, Color.BLUE);
    }
}
