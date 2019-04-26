package br.com.alura.treinamentos.rh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CicloController {

	@GetMapping("/ciclos/form")
	public String methodName(Model model, CicloForm form) {
		return "ciclos/form";
	}
}
