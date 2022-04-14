package _11_dsa_stack_queue.exercise.demerging_by_queue;

import java.util.*;

public class EmployeeManagement {
    public static void main(String[] args) {
        Queue<Employee> maleQueue = new LinkedList<>();
        Queue<Employee> femaleQueue = new LinkedList<>();
        Employee[] employees = new Employee[6];
        employees[0] = new Employee("Phuc", true, 20);
        employees[1] = new Employee("Duy", true, 26);
        employees[2] = new Employee("Trung", true, 18);
        employees[3] = new Employee("Uyen", false, 24);
        employees[4] = new Employee("Ha", false, 25);
        employees[5] = new Employee("Nhung", false, 26);
        Arrays.sort(employees);
        for (Employee item: employees) {
            System.out.println(item);
        }
        for (Employee item: employees) {
            if (item.isGender()){
                maleQueue.add(item);
            }else {
                femaleQueue.add(item);
            }
        }
        List<Employee> arrSort = new ArrayList<>();
        while (!femaleQueue.isEmpty()){
            arrSort.add(femaleQueue.remove());
        }
        while (!maleQueue.isEmpty()){
            arrSort.add(maleQueue.remove());
        }
        System.out.println("        -------------------");
        System.out.println("-----------------------------------");
        System.out.println("        -------------------");
        System.out.println("After - sort");
        for (Employee item: arrSort) {
            System.out.println(item);
        }
    }
}
