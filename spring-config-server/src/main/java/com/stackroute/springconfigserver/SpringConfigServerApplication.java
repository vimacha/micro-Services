<<<<<<< HEAD
/**
 * created by sakshi
 * This class is used to fetch properties from centralized config repository
 */

=======
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
package com.stackroute.springconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigServerApplication.class, args);
	}

}
