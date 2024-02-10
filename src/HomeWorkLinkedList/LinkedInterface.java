package HomeWorkLinkedList;

import java.util.LinkedList;

public interface LinkedInterface <E> {


    void addLast(E e);

    void addFirst(E e);


    E getElementByIndex(int counter);

    int size();


}
