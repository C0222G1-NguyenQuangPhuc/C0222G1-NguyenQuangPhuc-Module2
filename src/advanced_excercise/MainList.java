package advanced_excercise;

import java.util.Scanner;

public class MainList {
    static Scanner sc = new Scanner(System.in);
    static Person[] arr = new Person[100];
    static int count;

    static {
        Person student1 = new Student("Phúc", 24, true, 5);
        arr[0] = student1;
        Person teacher1 = new Teacher("Tiến", 30, true, 5000000);
        arr[1] = teacher1;
        Person student2 = new Student("Duy", 27, true, 10);
        arr[2] = student2;
        Person teacher2 = new Teacher("Hà", 26, false, 4000000);
        arr[3] = teacher2;
        count = 4;
    }

    public static void main(String[] args) {
        boolean check = true;
        while (check) {
            System.out.println("1. Display");
            System.out.println("2. Add new");
            System.out.println("3. Delete");
            System.out.println("0. Exit");
            System.out.print("Select Option: ");
            switch (Integer.parseInt(sc.nextLine())) {
                case 1:
                    displayList();
                    break;
                case 2:
                    addNew();
                    break;
                case 3:
                    delete();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Retry");
                    break;
            }
        }
    }

    private static void displayList() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list of teacher");
            System.out.println("2. Display list of student");
            System.out.println("0. Return main menu");
            switch (Integer.parseInt(sc.nextLine())) {
                case 1: {
                    for (int i = 0; i < count; i++) {
                        if (arr[i] instanceof Teacher) {
                            System.out.println(arr[i]);
                        }
                    }
                    break;
                }
                case 2: {
                    for (int i = 0; i < count; i++) {
                        if (arr[i] instanceof Student) {
                            System.out.println(arr[i]);
                        }
                    }
                    break;
                }
                case 0:
                    check = false;
                    break;
                default:
                    System.out.println("Retry");
                    break;
            }
        }
    }

    private static void addNew() {
        int salary, point;
        System.out.println("1. Add new teacher");
        System.out.println("2. Add new student");
        int choose = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the name");
        String name = sc.nextLine();
        System.out.println("Enter the age");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Choose Gender");
        System.out.println("1. Nam / 2. Nữ");
        int chooseGender = Integer.parseInt(sc.nextLine());
        boolean comfirmGender;
        if (chooseGender == 1) {
            comfirmGender = true;
        } else
            comfirmGender = false;
        if (choose == 1) {
            System.out.println("Enter salary");
            salary = Integer.parseInt(sc.nextLine());
            Person newTeacher = new Teacher(name, age, comfirmGender, salary);
            arr[findNull()] = newTeacher;
            count++;
        } else {
            System.out.println("Enter point");
            point = Integer.parseInt(sc.nextLine());
            Person newStudent = new Student(name, age, comfirmGender, point);
            arr[findNull()] = newStudent;
            count++;
        }
        System.out.println("Add new successful");
    }

    public static int findNull() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                return i;
            }
        }
        return 0;
    }

    public static void sortArray(int index) {
        for (int i = index; i < count; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("Delete successful");
    }

    public static void delete() {
        boolean check = true;
        while (check) {
            System.out.println("1. Delete teacher");
            System.out.println("2. Delete student");
            System.out.println("0. Return main menu");
            int option = Integer.parseInt(sc.nextLine());
            System.out.println("Input name want to delete");
            String nameDetele = sc.nextLine();
            switch (option){
                case 1:
                case 2:
                    for (int i = 0; i < count; i++) {
                        if (option == 1) {
                            if (arr[i] instanceof Teacher) {
                                if (arr[i].getName().equals(nameDetele)) {
                                    sortArray(i);
                                    break;
                                }
                            }
                        } else {
                            if (arr[i] instanceof Student) {
                                if (arr[i].getName().equals(nameDetele)) {
                                    sortArray(i);
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 0:
                    check = false;
                    break;
                default:
                    System.out.println("Retry");
            }
        }
    }
}
