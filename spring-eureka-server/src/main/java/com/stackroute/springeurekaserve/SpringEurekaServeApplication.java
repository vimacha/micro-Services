<<<<<<< HEAD
/**
 * This class act as a eureka server that is used to register micro-services on server
 */

=======
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
package com.stackroute.springeurekaserve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class SpringEurekaServeApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringEurekaServeApplication.class, args);
	}

}
