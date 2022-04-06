package _05_accces_modifier_static.exercise.circle;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this(1.0,"red");
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.pow(getRadius(),2) * Math.PI;
    }
}
