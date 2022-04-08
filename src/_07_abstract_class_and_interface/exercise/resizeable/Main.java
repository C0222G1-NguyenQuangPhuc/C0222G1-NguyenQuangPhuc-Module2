package _07_abstract_class_and_interface.exercise.resizeable;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5);
        System.out.println(circle);
        circle.resize(2);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle);
        rectangle.resize(1.5);
        System.out.println(rectangle);
    }
}
