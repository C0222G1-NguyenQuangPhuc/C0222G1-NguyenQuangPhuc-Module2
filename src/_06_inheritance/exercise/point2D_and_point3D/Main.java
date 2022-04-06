package _06_inheritance.exercise.point2D_and_point3D;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2,4);
        System.out.println(point2D);

        point2D = new Point2D();
        System.out.println(point2D);

        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(7,8, 9);
        System.out.println(point3D);
    }
}
