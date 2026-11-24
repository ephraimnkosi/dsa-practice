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

    public E element() {
        return element;
    }

    public LinkNode<E> next() {
        return next;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public void setNext(LinkNode<E> next) {
        this.next = next;
    }
}
