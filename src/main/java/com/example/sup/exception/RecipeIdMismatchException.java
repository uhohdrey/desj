package com.example.sup.exception;

public class RecipeIdMismatchException extends RuntimeException {

    public RecipeIdMismatchException() {
        super();
    }

    public RecipeIdMismatchException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public RecipeIdMismatchException(final String message) {
        super(message);
    }

    public RecipeIdMismatchException(final Throwable cause) {
        super(cause);
    }
}