package _12_java_collection_framework.exercise.crud_by_arraylist;

import java.util.Comparator;

public class DescendingProduct implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() < o2.getPrice()){
            return 1;
        }else if (o1.getPrice() > o2.getPrice()){
            return -1;
        }else {
            return 0;
        }
    }
}
