<<<<<<< HEAD
/**
 * This class act as gateway for all micro services
 */

=======
>>>>>>> 9d23a298676a8d3ca78510da89c62c2db999c643
package com.stackroute.springgatewayapi;

import com.stackroute.springgatewayapi.filters.ErrorFilter;
import com.stackroute.springgatewayapi.filters.PostFilter;
import com.stackroute.springgatewayapi.filters.PreFilter;
import com.stackroute.springgatewayapi.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class SpringGatewayApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGatewayApiApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}

}
