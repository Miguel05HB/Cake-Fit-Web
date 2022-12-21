package com.cakefit.spring.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cakefit.spring.entidad.Contacto;

@Repository
public interface ContactoRepositorio extends JpaRepository<Contacto, Long>{
	
}
