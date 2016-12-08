package com.etorrus.exceptions;


public class DocumentExistException extends Exception {
    public DocumentExistException() {
    }
    public DocumentExistException(String message) {
        super(message);
    }
}
