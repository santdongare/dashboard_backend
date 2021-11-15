package com.springrest.springrest.controller;




import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/Myapp")
public class MyController {
	
	@Autowired
	private RestTemplate restTemplate;
	@GetMapping("/countries")
	private List<Object> getCountries()
	{
		String url="http://localhost:3000/countries";
		//RestTemplate restTemplate=new RestTemplate();
		Object[] objects = restTemplate.getForObject(url,Object[].class);
		return Arrays.asList(objects);
	}
}