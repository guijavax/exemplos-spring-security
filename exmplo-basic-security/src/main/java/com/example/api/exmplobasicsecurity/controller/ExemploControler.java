package com.example.api.exmplobasicsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exemplo")
public class ExemploControler {

	@GetMapping(value = "/teste")
	public String teste() {
		return "<h1>FUncionou</h1>";
	}
}
