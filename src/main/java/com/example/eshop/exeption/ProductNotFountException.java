package com.example.eshop.exeption;

public class ProductNotFountException extends  RuntimeException{
    public ProductNotFountException(String message) {
        super(message);
    }
}
