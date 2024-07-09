package Figures;

import HelpToFigures.*;

public class Triangle extends Figure implements Drawable{

    private double sideAB;
    private double sideAC;
    private double sideBC;
    private double angleA;
    private double angleABToAxisX;

    public Triangle(Point pointA, double sideAB, double sideAC, double sideBC, double angleA, double angleABToAxisX) {
        super(pointA);
        this.sideAB = sideAB;
        this.sideAC = sideAC;
        this.sideBC = sideBC;
        this.angleA = angleA;
        this.angleABToAxisX = angleABToAxisX;
    }

    @Override
    public double area() {
        return Math.abs(sideAB * sideAC * 0.5 * Math.sin(angleA));
    }

    @Override
    public double perimeter() {
        return sideAB + sideAC + sideBC;
    }

    @Override
    public void draw() {
        System.out.println("Нарисован Треугольник." +
                "\n\tКоординаты точки A: " + point +
                "\n\tУгол между стороной AB и осью X: " + angleABToAxisX +
                "\n\tУгол A: " + angleA +
                "\n\tСторона AB: " + sideAB +
                "\n\tСторона AC: " + sideAC +
                "\n\tСторона BC: " + sideBC +
                "\n\tЦвет: Черный");
    }

    @Override
    public void draw(Color color) {
        System.out.println("Нарисован Треугольник." +
                "\n\tКоординаты точки A: " + point +
                "\n\tУгол между стороной AB и осью X: " + angleABToAxisX +
                "\n\tУгол A: " + angleA +
                "\n\tСторона AB: " + sideAB +
                "\n\tСторона AC: " + sideAC +
                "\n\tСторона BC: " + sideBC +
                "\n\tЦвет: " + color);
    }
}
