package _06_inheritance.exercise.circle_and_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        this("Orange",2.0, 5.0);
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }

    public double getVolume(){
        return Math.pow(getRadius(), 2) * height * Math.PI;
    }

    @Override
    public String toString() {
        return "A Cylinder with color of "
                + getColor()
                + " with radius = "
                + getRadius()
                + " with height = "
                + getHeight();
    }
}
