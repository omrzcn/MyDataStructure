import org.w3c.dom.Node;

import java.util.NoSuchElementException;

public class MyStack <T>{
    public SNode<T> bottom;
    public SNode<T> top;
    int size ;


    public boolean isEmpty() {return bottom==null;} // if bottom is null, its empty

    public void push(T item){
        SNode<T> newNode = new SNode<>(item);

        if (isEmpty()){
            bottom=top=newNode;
        }else {
            top.next = newNode;
            top = newNode;
        }

        size++;

    }

    public T peek(){

        return (T) top.value;

    }

    public T pop(){
        SNode peekNode;

        if (isEmpty()){
            throw new NoSuchElementException();
        }
        // stack has one element
        if (top==bottom){
           peekNode = top;
           top=bottom=null;

        }else { // if i have more than one element
            peekNode = top;
            SNode prev = bottom;

            while (prev.next != top){
                prev = prev.next;
            }
            prev.next=null;
            top = prev;

        }
        size--;

        return (T)peekNode.value;

    }


}
