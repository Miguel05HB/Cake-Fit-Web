package com.cakefit.spring.servicio;

import java.util.List;

import com.cakefit.spring.entidad.Contacto;

public interface ContactoServicio {
	public List<Contacto> listarTodosLosContactos();
	
	public Contacto guardarContacto(Contacto contacto);
	
	public Contacto obtenerContactoPorId(Long id);
	
	public Contacto actualizarEstudiante(Contacto contacto);
	
	public void eliminarContacto(Long id);
}
