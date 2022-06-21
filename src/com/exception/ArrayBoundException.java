package src.com.exception;

public class ArrayBoundException extends Exception{

    public ArrayBoundException(){

    }

    public ArrayBoundException(String errorMessage){
        super(errorMessage);
    }

}
