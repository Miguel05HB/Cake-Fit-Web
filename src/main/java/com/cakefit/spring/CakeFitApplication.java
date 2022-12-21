package com.cakefit.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cakefit.spring.entidad.Contacto;
import com.cakefit.spring.repositorio.ContactoRepositorio;

@SpringBootApplication
public class CakeFitApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CakeFitApplication.class, args);
	}
	
	@Autowired
	private ContactoRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {
		/*Contacto contacto1 = new Contacto("Miguel Angel", "Huayre Bergaray", "huayremiguel@gmail.com", "954789632", "Prueba 1", "Esto solo es una prueba");
		repositorio.save(contacto1);
		
		Contacto contacto2 = new Contacto("Luis", "Hernandez", "luisangel@gmail.com", "963852741", "Prueba 2", "Esto solo es una prueba 2");
		repositorio.save(contacto2);
		*/
	}

}
