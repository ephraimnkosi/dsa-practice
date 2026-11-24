package queue;

public interface queue<E> {
    public void clear(); // clear all elemts in the que
    public boolean isEmpty(); // check if its empty
    public E dequeue();// remove an element and returun the removed elemtent
    public void enqueue(E elem); // insert an element
    public int length(); // return the lenght of the que
}
