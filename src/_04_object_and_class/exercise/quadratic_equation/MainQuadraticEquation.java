package _04_object_and_class.exercise.quadratic_equation;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0){
            System.out.println("Phương trình có hai nghiệm là: " +
                    "r1 = " + quadraticEquation.getRoot1() + " ; r2 = " + quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant() == 0){
            System.out.println("Phương trình có nghiệm kép: " +
                    "r1 = r2 = " + quadraticEquation.getRoot1());
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
