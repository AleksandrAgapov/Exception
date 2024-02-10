package HomeWorkLinkedList;

import java.util.Iterator;

public class LinkedContainer<E> implements LinkedInterface<E>, Iterable<E>, DescendingIterator<E>{

    private NodeLinked<E> fstNode;
    private NodeLinked<E> lstNode;
    private int size;

    public LinkedContainer() {
        lstNode = new NodeLinked<E>(null, fstNode, null);
        fstNode = new NodeLinked<E>(null, null, lstNode);
    }


    @Override
    public void addLast(Object o) {
        NodeLinked<E> prev = lstNode;
        prev.setCurrentElement((E) o);
        lstNode = new NodeLinked<E>(null, prev, null);
        prev.setNextElement(lstNode);
        size++;

    }


    @Override
    public void addFirst(Object o) {
        NodeLinked<E> next = fstNode;
        next.setCurrentElement((E) o);
        fstNode = new NodeLinked<>(null, null, next);
        next.setPrevElement(fstNode);
        size++;
    }

    @Override
    public E getElementByIndex(int counter) {

        NodeLinked<E> target = fstNode.getNextElement();
        for (int i = 0; i < counter; i++) {
            target = getNextElement(target);
        }

        return target.getCurrentElement();
    }

    private NodeLinked<E> getNextElement(NodeLinked<E> current) {
        return current.getNextElement();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "LinkedContainer{" +
                "fstNode=" + fstNode +
                ", lstNode=" + lstNode +
                ", size=" + size +
                '}';
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public E next() {
                return getElementByIndex(counter++);
            }
        };
    }

    @Override
    public Iterator<E> descendingIterator() {
        return new Iterator<E>() {
            int counter = size-1;
            @Override
            public boolean hasNext() {
                return counter >=0;
            }

            @Override
            public E next() {
                return getElementByIndex(counter--);
            }
        };
    }
}