package org.learning.springboot.aws.secretmanager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;


public class Config {

	@Value("${mysecret}")
	private String mysecret;

	public Config() {
		super();
	}
	
	@Bean
	public void getSecret(){
		System.out.println("mysecret::" + mysecret);
	}

}
