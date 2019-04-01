package com.savenko.mycollection;



public class CollectionException extends RuntimeException{

  private String message;

    public CollectionException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

