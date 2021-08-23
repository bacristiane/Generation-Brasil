package com.springboot.atividade08.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class Atividade08Controller {
	
	@GetMapping("/at1")
	public String at1() {
	return " A habilidade utilizada é atenção aos detalhes"
			+ " e a mentalidade é a de crescimento";
	}
	
	@GetMapping("/at2")
	public String at2() {
	return " O objetivo de aprendizagem para esta semana é"
			+ " realizar aplicações usando spring boot" ;
	}
	

}
