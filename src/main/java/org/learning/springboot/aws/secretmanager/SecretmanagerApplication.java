package org.learning.springboot.aws.secretmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SecretmanagerApplication implements CommandLineRunner{
	
	@Autowired
	private Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(SecretmanagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Secret is : "+ environment.getProperty("mysecret"));
	}

}
