package com.joketem.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class JokeController {

	@RequestMapping("api/joke")
	public String hello() {

		final String uri = "http://joketem-node.herokuapp.com/api/joke";

	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);

		return result;
	}
	
}