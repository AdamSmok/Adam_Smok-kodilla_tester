package com.kodilla.exception.homework6_5;

class OrderDoesntExistException extends Exception {
    public OrderDoesntExistException(String message) {
        super(message);
    }
}