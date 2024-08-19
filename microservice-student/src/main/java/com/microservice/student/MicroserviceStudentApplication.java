package com.microservice.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//con esta notacion estamos diciendo que este microservicio va hacer un cliente de eureka
//esta notacion no es obligatoria pero es bueno tenerla explicitamente
@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceStudentApplication.class, args);
	}

}
