package stack;

public class LinkedStack<E> implements Stack<E> {
    private LinkNode<E> top;

    public LinkedStack(){
        top = null;
    }
    @Override
    public E pop(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }

        E element = top.element();
        top = top.next();
        return element;
    }

    @Override
    public void push(E elem){
        top = new LinkNode<E>(elem, top);
    }

    @Override
    public void clear(){
        top = null;
    }

    @Override
    public boolean isEmpty(){
        return top == null;
    }
    
}
