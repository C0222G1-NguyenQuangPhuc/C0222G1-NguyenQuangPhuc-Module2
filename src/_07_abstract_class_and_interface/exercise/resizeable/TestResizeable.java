package _07_abstract_class_and_interface.exercise.resizeable;

public class TestResizeable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(2,4);
        shapes[1] = new Square(3);
        shapes[2] = new Circle(5);
        System.out.println("Before resize");
        for (Shape item : shapes) {
            System.out.println(item.getArea());
        }
        double randomResize = Math.floor(Math.random() * 100) + 1;
        System.out.println("Resize: " + randomResize + " percent");
        System.out.println("After resize");
        for (Shape item: shapes) {
            item.resize(randomResize);
            System.out.println(item.getArea());
        }

    }
}
