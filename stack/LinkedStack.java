package stack;

public class LinkedStack<E> implements Stack<E> {
    private LinkNode<E> top;

    public LinkedStack(){
        top = null;
    }
    @Override 
    public E pop(){
        if(top == null){ return null;}
        E element = top.element();
        LinkNode temp = top;
        top = top.next();
        temp.setSetNext(null);
        return element;

    }
    public void push(E elem){}
    public void clear(){}
    public boolean isEmpty(){
        return top == null;
    }
    
}
