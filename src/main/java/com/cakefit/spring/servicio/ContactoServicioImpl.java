package com.cakefit.spring.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakefit.spring.entidad.Contacto;
import com.cakefit.spring.repositorio.ContactoRepositorio;

@Service
public class ContactoServicioImpl implements ContactoServicio {

	@Autowired
	private ContactoRepositorio repositorio;

	@Override
	public List<Contacto> listarTodosLosContactos() {

		return repositorio.findAll();
	}

	@Override
	public Contacto guardarContacto(Contacto contacto) {

		return repositorio.save(contacto);
	}

	@Override
	public Contacto obtenerContactoPorId(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Contacto actualizarEstudiante(Contacto contacto) {
		return repositorio.save(contacto);
	}

	@Override
	public void eliminarContacto(Long id) {
		repositorio.deleteById(id);
	}

}
