package exercise_test_access_modifier;

import java.util.Scanner;

public class ListOfStudent {
    static Scanner sc = new Scanner(System.in);
    static Students[] obj = new Students[1000];
    public static void main(String[] args) {
        obj[0] = new Students("Kirv", 18, "Danang", 10);
        obj[1] = new Students("John", 18, "Danang", 10);
        obj[2] = new Students("Susan", 18, "Danang", 10);
        obj[3] = new Students("Yasuo", 18, "Danang", 10);
        while (true){
            System.out.println("1. Display");
            System.out.println("2. Add");
            System.out.println("3. Delete");
            System.out.println("0. Exit");
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
                    System.out.println("Thử lại");
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
        System.out.print("Nhập tên sinh viên: ");
        String nameStudent = sc.nextLine();
        System.out.print("Nhập tuổi sinh viên: ");
        int ageStudent = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập địa chỉ sinh viên: ");
        String addressStudent = sc.nextLine();
        System.out.print("Nhập điểm sinh viên: ");
        double pointStudent = Double.parseDouble(sc.nextLine());
        Students newStudent = new Students(nameStudent, ageStudent, addressStudent, pointStudent);
        int k = 0;
        for (int i = 0; i < obj.length ; i++) {
            if (obj[i] == null){
                k = i;
                break;
            }
        }
        obj[k] = newStudent;
        display();
    }

    private static void deleteStudent(){
        System.out.print("Nhập vị trí sinh viên muốn xóa: ");
        int index = Integer.parseInt(sc.nextLine());
        for (int i = (index - 1); i < obj.length ; i++) {
            if(obj[i] != null){
                obj[i] = obj[i + 1];
            }
        }
        System.out.println("Danh sách sau khi xóa: ");
        display();
    }
}
