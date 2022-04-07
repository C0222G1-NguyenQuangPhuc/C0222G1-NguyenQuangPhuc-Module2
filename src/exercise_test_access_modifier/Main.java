package exercise_test_access_modifier;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Students[] obj = new Students[1000];
    static int count;
    static {
        obj[0] = new Students("Kirv", 18, "Danang", 10);
        obj[1] = new Students("John", 18, "Danang", 10);
        obj[2] = new Students("Susan", 18, "Danang", 10);
        obj[3] = new Students("Yasuo", 18, "Danang", 10);
        count = 4;
    }
    public static void main(String[] args) {
        while (true){
            System.out.println("1. Display");
            System.out.println("2. Add");
            System.out.println("3. Delete");
            System.out.println("0. Exit");
            System.out.print("Select Option: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    display();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Retry");
            }
        }
    }

    private static void display(){
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] != null){
                System.out.println("Id: " + (i + 1) + " " + obj[i]);
            }
        }
    }

    private static void addStudent(){
        System.out.print("Input name of student: ");
        String nameStudent = sc.nextLine();
        System.out.print("Input age of student: ");
        int ageStudent = Integer.parseInt(sc.nextLine());
        System.out.print("Input address of student: ");
        String addressStudent = sc.nextLine();
        System.out.print("Input point of student: ");
        double pointStudent = Double.parseDouble(sc.nextLine());
        Students newStudent = new Students(nameStudent, ageStudent, addressStudent, pointStudent);
        int k = 0;
        for (int i = count; i < obj.length ; i++) {
            if (obj[i] == null){
                k = i;
                break;
            }
        }
        count++;
        obj[k] = newStudent;
        display();
    }

    private static void deleteStudent(){
        System.out.print("Input the position want to remove ");
        int index = Integer.parseInt(sc.nextLine());
        for (int i = (index - 1); i < obj.length ; i++) {
            if(obj[i] != null){
                obj[i] = obj[i + 1];
            }
        }
        System.out.println("List after remove ");
        display();
    }
}
