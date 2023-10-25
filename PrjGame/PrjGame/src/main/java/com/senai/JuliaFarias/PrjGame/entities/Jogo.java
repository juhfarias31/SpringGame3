package com.senai.JuliaFarias.PrjGame.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "jogo")
public class Jogo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name = "nome")
	private String name;
	
	@Column(name = "plataforma")
	private String plataform;
	
	
	public Long getId() {
		return Id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPlataform() {
		return plataform;
	}
	
	public void setId(Long id) {
		this.Id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPlataform(String plataform) {
		this.plataform = plataform;
	}
}