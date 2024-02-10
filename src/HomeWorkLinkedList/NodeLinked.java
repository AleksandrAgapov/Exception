package HomeWorkLinkedList;

public class NodeLinked<E> {
    private E CurrentElement;
    private NodeLinked<E> nextElement;
    private NodeLinked<E> prevElement;

    public NodeLinked(E element, NodeLinked<E> nextElement, NodeLinked<E> prevElement) {
        this.CurrentElement = element;
        this.nextElement = nextElement;
        this.prevElement = prevElement;
    }

    public E getCurrentElement() {
        return CurrentElement;
    }

    public NodeLinked<E> getNextElement() {
        return nextElement;
    }

    public NodeLinked<E> getPrevElement() {
        return prevElement;
    }

    public void setCurrentElement(E currentElement) {
        CurrentElement = currentElement;
    }

    public void setNextElement(NodeLinked<E> nextElement) {
        this.nextElement = nextElement;
    }

    public void setPrevElement(NodeLinked<E> prevElement) {
        this.prevElement = prevElement;
    }


    @Override
    public String toString() {
        return "NodeLinked{" +
                "CurrentElement=" + CurrentElement +
                '}';
    }
}
