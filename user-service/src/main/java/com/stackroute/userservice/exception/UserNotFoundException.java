<<<<<<< HEAD
/**
 * This class is a custom defined exception class
 */

=======
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
package com.stackroute.userservice.exception;

public class UserNotFoundException extends  Exception {
    private String message;

    public UserNotFoundException() {
    }

    public UserNotFoundException(String message) {
        this.message = message;
    }
}
