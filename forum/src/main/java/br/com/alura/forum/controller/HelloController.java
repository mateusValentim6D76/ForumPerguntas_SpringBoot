package br.com.alura.forum.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping("/{nome}")
	public String hello(@PathVariable String nome) {
		return "Hello World " + nome;
	}
}
