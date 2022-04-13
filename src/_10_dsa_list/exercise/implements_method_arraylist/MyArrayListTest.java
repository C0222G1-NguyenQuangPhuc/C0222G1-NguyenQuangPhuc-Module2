package _10_dsa_list.exercise.implements_method_arraylist;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        System.out.println(myArrayList);
        myArrayList.add(2,4);
        System.out.println(myArrayList);
        myArrayList.add(5,10);
        System.out.println(myArrayList);
        System.out.println(myArrayList.get(6));
        System.out.println(myArrayList.indexOf(11));
        System.out.println(myArrayList.contains(4));
        MyArrayList<Integer> newArrayList = myArrayList.clone();
        System.out.println(newArrayList);
        System.out.println(newArrayList.remove(5));
        System.out.println(newArrayList);
    }
}
