package HomeWorkLikedList2;

public interface GBLinkedList <T> extends Iterable<T> {


void add(T elem);

void remove(int index);
T get(int index);
int size();

}
