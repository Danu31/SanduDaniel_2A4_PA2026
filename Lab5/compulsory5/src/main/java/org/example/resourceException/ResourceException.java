package org.example.resourceException;

public class ResourceException extends Exception {
    public ResourceException(String message) {
        super(message);
    }

    public ResourceException(Exception exception) {
        super(exception);
    }
}
