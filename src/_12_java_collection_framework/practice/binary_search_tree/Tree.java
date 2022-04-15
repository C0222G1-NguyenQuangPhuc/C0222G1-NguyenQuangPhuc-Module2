package _12_java_collection_framework.practice.binary_search_tree;

public interface Tree<E> {
    public boolean insert(E e);
    public void inorder();
    public int getSize();
}
