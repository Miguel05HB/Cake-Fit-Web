package com.cakefit.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistroController {
	@Autowired

	@Value("${title.generic}")
	private String titlePage;
	@GetMapping({"/registro", "/Registro"})

	public String Registro(Model model) {
		model.addAttribute("TituloPagina", titlePage);
		model.addAttribute("Nosotros", "NOSOTROS");
		model.addAttribute("Productos", "PRODUCTOS");
		model.addAttribute("Locales", "LOCALES");
		model.addAttribute("Contacto", "CONTACTO");
		return "registro";
	}
}
