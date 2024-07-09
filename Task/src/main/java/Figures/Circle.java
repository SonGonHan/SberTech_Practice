package Figures;

import HelpToFigures.*;

public class Circle extends Figure implements Drawable {

    private double radius;

    public Circle(Point Center, double radius) {
        super(Center);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("Нарисован круг." +
                        "\n\tКоординаты центра: " + point +
                        "\n\tРадиус: " + radius +
                        "\n\tЦвет: Черный");
    }

    @Override
    public void draw(Color color){
        System.out.println("Нарисован круг." +
                "\n\tКоординаты центра: " + point +
                "\n\tРадиус: " + radius +
                "\n\tЦвет: " + color);
    }
}
