package by.itstep.exception;

public class TransactionNotFound extends RuntimeException{
    public TransactionNotFound(String message){
        super(message);
    }
}
