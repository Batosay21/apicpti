package br.com.empresa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Teste {
	
	@RequestMapping("/oi")
	public String mensagem() {
		return "hello world";
	}
	
	@RequestMapping("/msg")
public String converter (@RequestParam String texto) {
		return texto.toUpperCase();
}
}
