package src.com.dsa.stack;

import java.lang.reflect.Array;

import java.util.Arrays;

import src.com.exception.ArrayBoundException;

public class Stack<T> {

    private T[] elements;
    private  int top;

    private int size;


    /**
     * Args constructor
     *
     * @param clazz || Array type
     * @param capacity || Array size
     */
     public Stack(Class<T> clazz, int capacity) {
         elements = (T[]) Array.newInstance(clazz, capacity);
         this.top = -1;
         this.size = capacity;
     }
    /**
     * Push element to stack
     *
     * @param element
     */
    public void push(T element)  {
        try{
            if(!isFull()){
                elements[++top]= element;
            }else {
                throw new ArrayBoundException("Array out of bound");
            }
        }catch (ArrayBoundException exception){
            System.out.println(exception);
        }
    }

    /**
     * Pop element
     *
     * @return <T>
     *
     */
    public T pop(){
            if(isEmpty()){
                System.exit(-1);
            }
            return (T)elements[top--];
    }

    public  Boolean isEmpty(){
        return top == -1;
    }

    public  Boolean isFull(){
        return top == size - 1;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}

