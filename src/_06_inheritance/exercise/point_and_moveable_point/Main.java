package _06_inheritance.exercise.point_and_moveable_point;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point = new Point(6,9);
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint(1.0f,1.0f,1.0f,1.0f);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());

    }
}
