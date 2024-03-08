package com.example.FlightBookingAppBookings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.SpringVersion;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FlightBookingAppBookingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightBookingAppBookingsApplication.class, args);
		System.out.println(SpringVersion.getVersion());
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
