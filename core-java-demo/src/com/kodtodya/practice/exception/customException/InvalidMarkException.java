package com.kodtodya.practice.exception.customException;

public class InvalidMarkException extends Exception {
    private int errorCode;

    public InvalidMarkException(int errCode, String  message) {
        super(message);
        this.errorCode = errCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}
