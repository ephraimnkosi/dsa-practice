package stack;

public class LinkNode<E> {
    private E element;
    private LinkNode<E> next;

    public LinkNode(){
        this.element = null;
        this.next = null;
    }
    public LinkNode(E element, LinkNode<E> next) {
    this.element = element;
    this.next = next;
}
