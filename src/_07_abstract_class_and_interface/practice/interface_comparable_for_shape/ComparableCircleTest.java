package _07_abstract_class_and_interface.practice.interface_comparable_for_shape;


public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("indigo", false, 3.5);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        ComparableCircle temp;
        for (int i = 0; i < circles.length ; i++) {
            for (int j = 0; j < i ; j++) {
                if((circles[j].getRadius()) > (circles[i].getRadius())){
                    temp = circles[i];
                    circles[i] = circles[j];
                    circles[j] = temp;
                }
            }
        }

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
