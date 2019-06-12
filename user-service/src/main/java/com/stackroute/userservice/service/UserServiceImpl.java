<<<<<<< HEAD
/**
 * This class provides implementation for user service methods
 */

=======
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
package com.stackroute.userservice.service;

import com.stackroute.userservice.domain.User;
import com.stackroute.userservice.exception.UserAlreadyExistException;
import com.stackroute.userservice.exception.UserNotFoundException;
import com.stackroute.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Value;
=======
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

<<<<<<< HEAD
    private UserRepository userRepository;

    @Value("${spring.userAlreadyExist}")
    private String userAlreadyExist;

    @Value("${spring.userNotFound}")
    private String userNotFound;
=======
    UserRepository userRepository;
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

<<<<<<< HEAD
    //This method is used to save a user in database
=======
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
   @Override
   public User saveUser(User user) throws UserAlreadyExistException {
       if(userRepository.existsById(user.getId()))
       {
<<<<<<< HEAD
           throw  new UserAlreadyExistException(userAlreadyExist);
=======
           throw  new UserAlreadyExistException("User already exist ");
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
       }
       User savedUser=userRepository.save(user);
       if(savedUser == null)
       {
<<<<<<< HEAD
           throw new UserAlreadyExistException(userAlreadyExist);
=======
           throw new UserAlreadyExistException("User already exist ");
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
       }
       return savedUser;
   }

<<<<<<< HEAD
   //This method is to get all users from database
=======
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

<<<<<<< HEAD
    //This method is used to find a user by its id
=======
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
    @Override
    public User findById(int id) throws UserNotFoundException {
       User user1 =null;
       if(userRepository.existsById(id))
       {
           user1=userRepository.findById(id).get();
           if(user1==null){
<<<<<<< HEAD
               throw new UserNotFoundException(userNotFound);
=======
               throw new UserNotFoundException("User Not Found");
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
           }
       }
        return user1;
    }

<<<<<<< HEAD
    //This method is used to find a user by its name
=======
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
    @Override
    public User findByName(String firstName) throws UserNotFoundException{
       User user=null;
       user=userRepository.findByName(firstName);
       if(user==null){
<<<<<<< HEAD
           throw new UserNotFoundException(userNotFound);
=======
           throw new UserNotFoundException("User not found");
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
       }
       return user;
    }
}
