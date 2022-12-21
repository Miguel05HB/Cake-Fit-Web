package com.cakefit.spring.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cakefit.spring.entidad.Contacto;
import com.cakefit.spring.servicio.ContactoServicio;

@Controller
public class ContactoControlador {
	@Autowired
	
	private ContactoServicio servicio;
	@Value("${title.generic}")
	private String titlePage;
	
	
	
	@GetMapping({"/contactos/form"})
	public String listarContactos(Model modelo) {
		modelo.addAttribute("TituloPagina", titlePage);
		modelo.addAttribute("contactos" , servicio.listarTodosLosContactos());
		return "ListarContacto";
	}
	
	
	
	@GetMapping({ "/contactos" })
	public String crearContactoFormulario(Model modelo) {
		Contacto contacto = new Contacto();
		modelo.addAttribute("contacto", contacto);
		modelo.addAttribute("Nosotros", "NOSOTROS");
		modelo.addAttribute("Productos", "PRODUCTOS");
		modelo.addAttribute("Locales", "LOCALES");
		modelo.addAttribute("Contacto", "CONTACTO");
		modelo.addAttribute("TituloPagina", titlePage);
		return "Contacto";
	}
	
	@PostMapping({"/contactos"})
	public String guardarEstudiante(@ModelAttribute("contacto") Contacto contacto) {
		servicio.guardarContacto(contacto);
		return "redirect:/contactos/form";
	}
	
	
	@GetMapping("/contactos/editar/{id}")
	public String mostrarFormularioEditar(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("TituloPagina", titlePage);
		modelo.addAttribute("contacto", servicio.obtenerContactoPorId(id));
		return "editar_contacto";
	}
	
	@PostMapping("/contactos/{id}")
	public String actualizarContactos(@PathVariable Long id, @ModelAttribute("contacto") Contacto contacto, Model modelo) {
		Contacto contactoExistente = servicio.obtenerContactoPorId(id);
		contactoExistente.setIdUsuario(id);
		contactoExistente.setNombres(contacto.getNombres());
		contactoExistente.setApellidos(contacto.getApellidos());
		contactoExistente.setCorreo(contacto.getCorreo());
		contactoExistente.setCelular(contacto.getCelular());
		contactoExistente.setAsunto(contacto.getAsunto());
		contactoExistente.setComentario(contacto.getComentario());
		
		servicio.actualizarEstudiante(contactoExistente);
		return "redirect:/contactos/form";
	}
	
	@GetMapping("/contactos/{id}")
	public String eliminarContacto(@PathVariable Long id) {
		servicio.eliminarContacto(id);
		return "redirect:/contactos/form";
	}
}
