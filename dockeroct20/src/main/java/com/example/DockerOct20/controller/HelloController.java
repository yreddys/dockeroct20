package com.example.DockerOct20.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@GetMapping("/get")
String saveData() {
	return"Hello Reddy";
}
}
