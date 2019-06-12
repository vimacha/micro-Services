<<<<<<< HEAD
/**
 * This class is used as controller for user service
 */

=======
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
package com.stackroute.userservice.controller;

import com.stackroute.userservice.domain.User;
import com.stackroute.userservice.exception.UserAlreadyExistException;
import com.stackroute.userservice.exception.UserNotFoundException;
import com.stackroute.userservice.repository.UserRepository;
import com.stackroute.userservice.service.UserService;
import javassist.bytecode.stackmap.BasicBlock;
<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Value;
=======
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="api/v1")
public class UserController {

<<<<<<< HEAD
    @Value("${spring.userNotFound}")
    private String userNotFound;

=======
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

<<<<<<< HEAD
    //This method post user in the database
=======
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
    @PostMapping("User")
    public ResponseEntity<?> saveUser(@RequestBody User user)
    {
        ResponseEntity responseEntity;
        try {
            userService.saveUser(user);
            responseEntity=new ResponseEntity<String>("Successfully created ", HttpStatus.CREATED);
        }
<<<<<<< HEAD
        catch (UserAlreadyExistException ex)
        {
            responseEntity=new ResponseEntity<String>(ex.getMessage(),HttpStatus.ALREADY_REPORTED);
        }
        return  responseEntity;
    }

    //This method get users from the database
=======
        catch (/*Exception*/UserAlreadyExistException ex)
        {
            responseEntity=new ResponseEntity<String>(ex.getMessage(),HttpStatus.CONFLICT);
        }
        return  responseEntity;
    }
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
    @GetMapping("User")
    public ResponseEntity<?> getAllUsers()
    {
        return  new ResponseEntity<List<User>>(userService.getAllUsers(),HttpStatus.OK);
    }

<<<<<<< HEAD
    //This method get a particular user from database
=======
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
    @GetMapping("User1/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") int id)
    {
        ResponseEntity responseEntity;
        try {
            User user=userService.findById(id);
            if(user==null){
<<<<<<< HEAD
                responseEntity=new ResponseEntity<String>(userNotFound,HttpStatus.NOT_FOUND);
=======
                responseEntity=new ResponseEntity<String>("User Not found",HttpStatus.OK);
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
            }
            else {
                responseEntity = new ResponseEntity<String>("User found", HttpStatus.OK);
            }
        }
        catch(UserNotFoundException ex)
        {
<<<<<<< HEAD
            responseEntity=new ResponseEntity<String>(ex.getMessage(),HttpStatus.NOT_FOUND);
=======
            responseEntity=new ResponseEntity<String>(ex.getMessage(),HttpStatus.CONFLICT);
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
        }
        return  responseEntity;
    }

<<<<<<< HEAD
    //This method get a user from database by its name
=======
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
    @GetMapping("User2/{firstName}")
    public ResponseEntity<?> findByName(@PathVariable("firstName") String firstName){
        ResponseEntity responseEntity;
        try {
            User user=userService.findByName(firstName);
            if(user==null){
<<<<<<< HEAD
                responseEntity=new ResponseEntity<String>(userNotFound,HttpStatus.NOT_FOUND);
=======
                responseEntity=new ResponseEntity<String>("User Not found",HttpStatus.CONFLICT);
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
            }
            else {
                responseEntity = new ResponseEntity<String>("User found", HttpStatus.OK);
            }
        }
        catch(UserNotFoundException ex)
        {
<<<<<<< HEAD
            responseEntity=new ResponseEntity<String>(ex.getMessage(),HttpStatus.NOT_FOUND);
=======
            responseEntity=new ResponseEntity<String>(ex.getMessage(),HttpStatus.CONFLICT);
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
        }
        return responseEntity;
    }
}
