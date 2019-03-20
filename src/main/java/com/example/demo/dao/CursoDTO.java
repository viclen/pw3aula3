package com.example.demo.dao;

import java.io.Serializable;

import com.example.demo.entity.CursoEntity;

public class CursoDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome, nivel;
	
	public CursoDTO(CursoEntity curso) {
		super();
		this.id = curso.getId();
		this.nome = curso.getNome();
		this.nivel = curso.getNivel();
	}
	
	public CursoDTO() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
	

}
