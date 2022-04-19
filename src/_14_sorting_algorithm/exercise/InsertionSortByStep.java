package _14_sorting_algorithm.exercise;

import java.util.Arrays;

public class InsertionSortByStep {
    static int[] arr = {4, 7, 5, 9, 10, 8, 6, 3, 2, 1};

    public static void main(String[] args) {
        System.out.println("Mảng ban đầu: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Bắt đầu sort:--------------------");
        insertionSortByStep(arr);
        System.out.println("Mảng sau khi sort:-----------------");
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSortByStep(int[] arg) {
        for (int i = 1; i < arg.length; i++) {
            /* Đặt phần tử so sánh ở vị trí index arg[1] */
            System.out.println("Current Element ở vòng lặp thứ: " + i);
            int currentElement = arg[i];
            System.out.println("Current Element = " + currentElement);
            /* Khởi tạo j ngoài for để truy xuất j */
            int j;

            /* Duyệt for mảng con từ j = i -1
               với điều kiện j >= 0 và phần tử thứ j phải lớn hơn phần tử hiện tại */
            for (j = i - 1; j >= 0 && arg[j] > currentElement; j--) {

                /* Tiến hành gán phần tử tiếp theo bắt đầu từ j bằng arg[j]
                   và thực hiện đến khi j < 0 hoặc arg[j] < currentElemet */
                arg[j + 1] = arg[j];

                System.out.println("Phần tử tại index: " + (j + 1) + " sau khi được gán = " + arg[j + 1]);

                System.out.println("Mảng sau khi đã sắp xếp lại mảng con");
                System.out.println(Arrays.toString(arg));
            }

            System.out.println("j khi ra khỏi for trong = " + j);
            System.out.println("Phần tử tại index " + (j + 1) + " được gán lại = " + currentElement);
            arg[j + 1] = currentElement;
            System.out.println("------------" + "Mảng sau khi kết thúc vòng lặp thứ: " + i + "---------");
            System.out.println(Arrays.toString(arg));
        }
    }
}
