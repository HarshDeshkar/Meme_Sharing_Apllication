package com.crio.starter.exceptions;



import org.springframework.http.HttpStatus;

/**
 * This exception should be thrown when a user tries to post an invalid meme.
 */

public class InvalidPostException extends ApplicationError{
    
    private static final String DEFAULT_MESSAGE = "The post you are trying to create is not valid."; 

    public InvalidPostException() {
        super(DEFAULT_MESSAGE, HttpStatus.CONFLICT);
    }

    public InvalidPostException(String messageString) {
        super(messageString, HttpStatus.CONFLICT);
    }
}