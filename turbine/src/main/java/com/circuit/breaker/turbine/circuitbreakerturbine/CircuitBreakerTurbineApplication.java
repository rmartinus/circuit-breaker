package com.circuit.breaker.turbine.circuitbreakerturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@EnableTurbineStream
@SpringBootApplication
public class CircuitBreakerTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircuitBreakerTurbineApplication.class, args);
	}

}

