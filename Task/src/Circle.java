public class Circle {
    private final int radius;
    private final Colors color;

    public Circle(int radius, Colors color) {
        this.radius = radius;
        this.color = color;
    }

    public double area() {
        return radius * radius * Math.PI;
    }

    public double perimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Радиус: " + radius +
                "\nЦвет: " + color +
                "\nПериметр: " + perimeter() +
                "\nПлощадь: " + area();
    }
}
