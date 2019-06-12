<<<<<<< HEAD
/**
 * This interface act as repository for user service and extends JpaRepository interface.
 */

=======
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
package com.stackroute.userservice.repository;

import com.stackroute.userservice.domain.User;
import com.stackroute.userservice.exception.UserNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    @Query("select u from User u where u.firstName=:firstName")
    public User findByName(@Param("firstName") String firstName) throws UserNotFoundException;
}
