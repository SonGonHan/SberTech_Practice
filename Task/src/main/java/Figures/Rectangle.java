package Figures;

import HelpToFigures.*;

public class Rectangle extends Figure implements Drawable {

    protected double width, height;

    public Rectangle(Point LowerLeftCorner, double width, double height) {
        super(LowerLeftCorner);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return (width + height) * 2;
    }

    @Override
    public void draw() {
        System.out.println("Нарисован прямоугольник." +
                "\n\tКоординаты левого нижнего угла: " + point +
                "\n\tШирина: " + width +
                "\n\tВысота: " + height +
                "\n\tЦвет: Черный");
    }

    @Override
    public void draw(Color color) {
        System.out.println("Нарисован прямоугольник." +
                "\n\tКоординаты левого нижнего угла: " + point +
                "\n\tШирина: " + width +
                "\n\tВысота: " + height +
                "\n\tЦвет: " + color);
    }
}
