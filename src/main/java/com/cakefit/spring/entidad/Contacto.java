package com.cakefit.spring.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "contacto")
public class Contacto {
	@Override
	public String toString() {
		return "Contacto [idUsuario=" + idUsuario + ", nombres=" + nombres + ", apellidos=" + apellidos + ", correo="
				+ correo + ", celular=" + celular + ", asunto=" + asunto + ", comentario=" + comentario + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	@NotBlank(message = "Debe ingresar su Nombre")
	@Column(name = "nombre", nullable = false, length = 50)
	private String nombres;
	@NotBlank(message = "Debe ingresar su Apellido")
	@Column(name = "apellido", nullable = false, length = 50)
	private String apellidos;
	@NotBlank(message = "Debe ingresar su Correo Electronico")
	@Column(name = "correo", nullable = false, length = 50, unique = true)
	private String correo;
	@NotBlank(message = "Debe ingresar su numero de Celular")
	@Column(name = "celular", nullable = false, length = 9, unique = true)
	private Long celular;
	@NotBlank(message = "Debe ingresar su Asunto")
	@Column(name = "asunto", nullable = false, length = 50)
	private String asunto;
	@NotBlank(message = "Debe ingresar su Comentario")
	@Column(name = "comentario", nullable = false)
	private String comentario;

	

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	
	public Long getCelular() {
		return celular;
	}

	public void setCelular(Long celular) {
		this.celular = celular;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

}
