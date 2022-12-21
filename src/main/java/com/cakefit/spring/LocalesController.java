package com.cakefit.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LocalesController {
	@Autowired

	@Value("${title.generic}")
	private String titlePage;

	@GetMapping({ "/locales"})
	public String Home(Model model) {

		model.addAttribute("TituloPagina", titlePage);
		model.addAttribute("Nosotros", "NOSOTROS");
		model.addAttribute("Productos", "PRODUCTOS");
		model.addAttribute("Locales", "LOCALES");
		model.addAttribute("Contacto", "CONTACTO");

		model.addAttribute("Subtitle",
				"Si te encanta la comida sana pero no puedes decir que no a los pasteles, entonces nuestros pasteles son para ti.");
		return "local";

	}
}
