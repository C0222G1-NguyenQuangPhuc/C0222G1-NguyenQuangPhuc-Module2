package _07_abstract_class_and_interface.exercise.colorable;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(4,7);
        shapes[1] = new Square(5);
        shapes[2] = new Circle(3);
        System.out.println("Element of shapes is: ");
        for (Shape item: shapes) {
            System.out.println(item.getArea());
            if (item instanceof Colorable){
                System.out.println("Shape Square has a colorable");
                ((Square) item).howToColor();
            }
        }
    }
}
