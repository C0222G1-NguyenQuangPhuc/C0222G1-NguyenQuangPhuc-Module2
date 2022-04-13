package _10_dsa_list.exercise.implements_method_arraylist;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity > 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    public int size() {
        return this.size = size;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(5);
        }
        elements[size] = e;
        size++;
        return true;
    }

    public void add(int index, E element) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index: " + index);
        } else if (elements.length == size) {
            ensureCapacity(5);
        }

        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < this.size - 1; i++) {
            str += elements[i] + ", ";
        }
        str += elements[this.size - 1];
        return "[" + str + "]";
    }

    public int indexOf(E o) {
        int index = -1;
        for (int i = 0; i < size ; i++) {
            if (this.elements[i].equals(o)){
                return i;
            }
        }
        return index;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public boolean contains(E o){
        return this.indexOf(o) >= 0;
    }

    public MyArrayList<E> clone(){
        MyArrayList<E> arrayClone = new MyArrayList<>();
        arrayClone.elements = Arrays.copyOf(this.elements, this.size);
        arrayClone.size = this.size;
        return arrayClone;
    }

    public E remove(int index){
        if (index < 0 || index > elements.length){
            throw new IllegalArgumentException("Error index: " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }
}
