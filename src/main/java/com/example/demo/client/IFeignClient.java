package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "Demo", url = "http://jsonplaceholder.typicode.com")
public interface IFeignClient {

	@GetMapping(value = "/posts")
	public String getData();

	@GetMapping(value = "/posts/{id}")
	public String getDataById(@RequestParam("id") String id);

}
