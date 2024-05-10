package com.kodilla.exception.homework;

class OrderDoesntExistException extends Exception {
    public OrderDoesntExistException(String message) {
        super(message);
    }
}