package HomeWorkLikedList2;

import List.ArrayIterator;

import java.util.Iterator;

public class LinkList<T> implements GBLinkedList<T> {

    private Node<T> head;

    private int size = 0;

    @Override
    public String toString() {
        return "LinkList{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }

    @Override
    public void add(T elem) {
        Node<T> newNode = new Node<>();
        newNode.value = elem;
        newNode.next = head;
        newNode.previous = null;

        if (head != null) {
            head.previous = newNode;

        }
        head = newNode;

        size++;
    }



    @Override
    public void remove(int index) {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException(("Index:" + index + "Size:" + size()));

        if (index == 0) {
            head = head.next;
            head.previous = null;

        } else {
            Node<T> current = head;
            for (int i = 0; i != index; i++) {
                current = current.next;
            }
            if (current.next != null) {
                current.next.previous = current.previous;
                current.previous.next = current.next;
            }

        }

        size--;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException(("Index:" + index + "Size:" + size()));
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;


        }
        return current.value;
    }


    @Override
    public int size() {
        return size;
    }

//    @Override
//    public Iterator<T> iterator() {
//
//        return new ArrayIterator<>(toArray());
//    }
//
//    @SuppressWarnings("unchecked")
//    public T[] toArray() {
//        int size = size();
//        T[] result = null;
//        try {
//            result = (T[]) new Object[size];
//        } catch (ClassCastException e) {
//            e.printStackTrace();
//        }
//        for (int i = 0; i < size; i++) {
//            result[i] = get(i);
//        }
//        return result;
//    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {


            Node<T> prev = null;
            Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                prev = current;
                current = current.next;
                return prev.value;
            }
        };
    }
}


