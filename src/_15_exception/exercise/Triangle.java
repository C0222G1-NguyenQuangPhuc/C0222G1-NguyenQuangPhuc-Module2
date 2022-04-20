package _15_exception.exercise;

import java.awt.*;
import java.util.Scanner;

public class Triangle {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        System.out.println("Enter length of Side 1:");
        double side1 = checkNegativeTriangleSide();

        System.out.println("Enter length of Side 2:");
        double side2 = checkNegativeTriangleSide();

        System.out.println("Enter length of Side 2:");
        double side3 = checkNegativeTriangleSide();

        illegalTriangleException(side1,side2,side3);

    }

    public static double checkNegativeTriangleSide(){
        boolean isChecked = true;
        double num = 0;
        while (isChecked){
            try {
                isChecked = false;
                num = Double.parseDouble(sc.nextLine());
                if (num <= 0){
                    throw new NegativeTriangleSideException("Please enter Positive number.");
                }else {
                    return num;
                }
            }catch (NegativeTriangleSideException e){
                System.out.println(e.getMessage());
                isChecked = true;
            }catch (NumberFormatException e){
                System.out.println("Please enter number.");
                isChecked = true;
            }
        }
        return num;
    }

    public static void illegalTriangleException(double side1, double side2, double side3){
        try {
            if (side1 + side2 < side3 ||
                    side2 + side3 < side1 ||
                    side1 + side3 < side2){
                throw new IllegalTriangleException("This is not a side of Triangle.");
            }else {
                System.out.println("Sides Of Triangle: ");
                System.out.println("Side 1 = " + side1);
                System.out.println("Side 2 = " + side2);
                System.out.println("Side 3 = " + side3);
            }
        }catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
    }
}
