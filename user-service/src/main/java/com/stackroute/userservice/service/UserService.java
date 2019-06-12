<<<<<<< HEAD
/**
 * This interface is used to declare methods provided by user service
 */

=======
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
package com.stackroute.userservice.service;

import com.stackroute.userservice.domain.User;
import com.stackroute.userservice.exception.UserAlreadyExistException;
import com.stackroute.userservice.exception.UserNotFoundException;

import java.util.List;

public interface UserService {
<<<<<<< HEAD

=======
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
    public User saveUser(User user) throws UserAlreadyExistException;
    public List<User> getAllUsers();
    public User findById(int id) throws UserNotFoundException;
    public User findByName(String firstName) throws UserNotFoundException;
<<<<<<< HEAD

=======
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
}
