package com.klef.dev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class ClientController {
@GetMapping("/")
public String demo() {
	return "Spring Boot";
}
@GetMapping("/demo")
public String test() {
	return "Spring Boot Test";
}
@GetMapping("/home")
public String home() {
	return "Spring Boot Home";
}

}
