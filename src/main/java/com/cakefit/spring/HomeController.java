package com.cakefit.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class HomeController {

	@Value("${title.generic}")
	private String titlePage;

	@GetMapping({ "/home", "/inicio", "/", "/Home", "/Inicio" })
	public String Home(Model model) {

		model.addAttribute("TituloPagina", titlePage);
		model.addAttribute("Nosotros", "NOSOTROS");
		model.addAttribute("Productos", "PRODUCTOS");
		model.addAttribute("Locales", "LOCALES");
		model.addAttribute("Contacto", "CONTACTO");

		model.addAttribute("Subtitle",
				"Si te encanta la comida sana pero no puedes decir que no a los pasteles, entonces nuestros pasteles son para ti.");
		return "Home";

	}
	
	@GetMapping("/contacto")
	
	public String FormContacto(Model model) {
		model.addAttribute("TituloPagina", titlePage);
		model.addAttribute("Nosotros", "NOSOTROS");
		model.addAttribute("Productos", "PRODUCTOS");
		model.addAttribute("Locales", "LOCALES");
		model.addAttribute("Contacto", "CONTACTO");
		return "Contacto";
	}
	
@GetMapping("/registro")
	
	public String Registro(Model model) {
		model.addAttribute("TituloPagina", titlePage);
		model.addAttribute("Nosotros", "NOSOTROS");
		model.addAttribute("Productos", "PRODUCTOS");
		model.addAttribute("Locales", "LOCALES");
		model.addAttribute("Contacto", "CONTACTO");
		return "registro";
	}

}
