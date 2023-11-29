package by.itstep.exception;

import by.itstep.dto.Transaction;

public class TransactionNotUnique extends RuntimeException {
    public TransactionNotUnique(String message) {
        super(message);
    }
}
