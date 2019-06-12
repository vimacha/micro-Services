<<<<<<< HEAD
/**
 * This is main class for muzix service application
 */

=======
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
package com.stackroute.muzixService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableCaching
@EnableEurekaClient
public class MuzixService {

	public static void main(String[] args) {
		SpringApplication.run(MuzixService.class, args);
	}

}
