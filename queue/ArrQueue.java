package queue;

public class ArrQueue<E> implements queue<E>{
    private static final int defaultSize = 10;
    private int rear;
    private int front;
    private int maxSize;
    private int count;
    private E[] arrList;

    ArrQueue(){
        this(defaultSize);
    }
    ArrQueue(int size){
        maxSize = size+1;
        rear = 0; front = 1;
        arrList = (E[]) new Object[maxSize];
    }
    public void clear(){// clear all elemts in the que
        rear = 0; front = 1;
    } 
    public boolean isEmpty(){ // check if its empty
        if(((rear+2) % maxSize) == 0){
           return true; 
        }else{return false;}
    } 
    public E dequeue(){// remove an element and returun the removed elemtent
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty"); // trow an error
        }
        E elem = arrList[front];
        arrList[front] = null;
        front = (front+1)% maxSize;
        return elem;
    }
    public void enqueue(E elem){// insert an element
        if(isEmpty()){
            throw new IllegalStateException("Queue is full"); //  throw an error
        }
        rear = (rear+1) % maxSize;
        arrList[rear] = elem;
        count++;
    } 
    public int length(){// return the lenght of the que
        return count;
    } 
}
