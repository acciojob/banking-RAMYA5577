package com.driver;

public class InsufficientBalanceException extends Throwable {
    public InsufficientBalanceException(String s)  {
        super(s);
    }
}
