package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.client.IFeignClient;

@RestController
public class FeignController {

	@Autowired
	IFeignClient iClient;

	@GetMapping(value = "/findAll")
	public String getData() {
		return iClient.getData();
	}

	@GetMapping(value = "/findUserById")
	public String getDataById(@RequestParam String id) {
		return iClient.getDataById(id);
	}

	@GetMapping(value = "/getId/{id}")
	public String printId(@PathVariable String id) {
		return "Message from Controller " + id;
	}

	@GetMapping(value = "/values/{name}")
	public String getValuesById(@PathVariable("name") String name,@RequestParam("result") String result) {
		return name + result;
	}
}
