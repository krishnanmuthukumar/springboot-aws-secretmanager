package org.learning.springboot.aws.secretmanager;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SecretManagerController {

	@Value(value="${environment}")
	private String environment;

	@Value(value="${dbname}")
	private String dbname;

	@Value(value="${username}")
	private String username;

	@Value(value="${password}")
	private String password;

	@RequestMapping(value = "/secrets", method = RequestMethod.GET)
	public Map<String, Object> getSecretValues() {
		final Map<String, Object> map = new HashMap<>();
		map.put("environment", environment);
		map.put("dbname", dbname);
		map.put("username", username);
		map.put("password", password);
		return map;
	}
}
