package app.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.spring.gradle.dependencymanagement.org.apache.maven.model.Model;

@RestController
@RequestMapping(path = "/")
public class smapleController {
	@GetMapping
	public String add(Model model) {
		return "index";
	}

}
