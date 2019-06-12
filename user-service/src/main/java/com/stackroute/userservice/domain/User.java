<<<<<<< HEAD
/**
 * This class is used as a domain entity
 */

=======
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
package com.stackroute.userservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    int id;
    String firstName;
    String lastName;
    int age;
<<<<<<< HEAD
=======

>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
}
