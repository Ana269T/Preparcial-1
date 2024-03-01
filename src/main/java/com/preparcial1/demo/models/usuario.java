package com.preparcial1.demo.models;

import jakarta.persistence.*;

@Entity
@Table (name = "Usuario")
public class usuario {
	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "usuario")
    private String usuario;
    
    @Column(name = "contraseña")
    private String contrasena;
    
    @ManyToOne
    @JoinColumn(name = "rol_id", referencedColumnName = "id")
    private rol rol;

	public usuario() {
		super();
	}

	public usuario(Long id, String usuario, String contrasena, com.preparcial1.demo.models.rol rol) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.rol = rol;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public rol getRol() {
		return rol;
	}

	public void setRol(rol rol) {
		this.rol = rol;
	}

}
