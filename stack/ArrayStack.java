package stack;

public class ArrayStack<E> implements Stack<E>{
    private static final int defaultSize = 10;
    private int size;
    private int top; // number of elemnts in the array
    private E[] array;

    ArrayStack(){
        size = defaultSize;
        top = 0;
        array = (E[]) new Object[defaultSize];
    }

    ArrayStack(int size){
        this.size = size;
        top = 0;
        array = (E[]) new Object[size];
    }

    @Override 
    public E pop(){ // poping an elemt 
        if(isEmpty()){throw new IllegalStateException("Stack is empty");}
        
        E element = array[--top];
        array[top] = null;

        return element;
        
    }
    @Override
    public void push(E elem){
        if(top >= size){
            System.out.println("stack is full");
        }else{array[top++] = elem;}
    }
    @Override
    public void clear(){  
        for(int i = 0; i < top; i++){
            array[i] = null;
        }
            top = 0;
    }
    @Override
    public boolean isEmpty(){
        if(top == 0){
            return true;
        }
        else{
            return false;
        }
    }
}