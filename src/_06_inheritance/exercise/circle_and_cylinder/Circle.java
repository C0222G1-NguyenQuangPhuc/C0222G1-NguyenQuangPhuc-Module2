package _06_inheritance.exercise.circle_and_cylinder;

public class Circle {
    private String color = "yellow";
    private double radius = 3.0;

    public Circle() {
    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "A circle with color of "
                + getColor()
                + " and with radius = "
                + getRadius();
    }
}
