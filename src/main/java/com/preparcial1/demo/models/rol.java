package com.preparcial1.demo.models;


import jakarta.persistence.*;
import java.util.List;


@Entity
@Table(name = "rol")
public class rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @OneToMany(mappedBy = "rol")
    private List<usuario> usuarios;

	public rol() {
		super();
	}

	public rol(Long id, String nombre, List<usuario> usuarios) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.usuarios = usuarios;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<usuario> usuarios) {
		this.usuarios = usuarios;
	}
    
}
