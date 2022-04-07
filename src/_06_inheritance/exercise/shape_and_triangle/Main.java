package _06_inheritance.exercise.shape_and_triangle;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("yellow",false);
        System.out.println(shape);

        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle(2.0, 3.0, 4.0);
        System.out.println(triangle);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());

        triangle = new Triangle("red", true, 4.0, 5.0, 6.0);
        System.out.println(triangle);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
    }
}
