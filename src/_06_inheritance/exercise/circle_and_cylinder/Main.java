package _06_inheritance.exercise.circle_and_cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle("orange", 1.0);
        System.out.println(circle);

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(8.0);
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());

        cylinder = new Cylinder("Black",3.0, 6.0);
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());
    }
}
