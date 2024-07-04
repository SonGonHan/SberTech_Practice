package Figures;

import HelpToFigures.*;

public class Square extends Rectangle {

    public Square(Point LowerLeftCorner, double side) {
        super(LowerLeftCorner, side, side);
    }

    @Override
    public void draw() {
        System.out.println("Нарисован квадрат." +
                "\n\tКоординаты левого нижнего угла: " + point +
                "\n\tСторона: " + width +
                "\n\tЦвет: Черный");
    }

    @Override
    public void draw(Color color) {
        System.out.println("Нарисован квадрат." +
                "\n\tКоординаты левого нижнего угла: " + point +
                "\n\tСторона: " + width +
                "\n\tЦвет: " + color);
    }

}
