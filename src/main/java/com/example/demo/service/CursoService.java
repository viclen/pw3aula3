package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CursoDAO;
import com.example.demo.entity.CursoEntity;
import com.example.demo.exceptions.ObjetoNaoEncontradoException;

@Service
public class CursoService {
	
	@Autowired
	private CursoDAO dao;

	public List<CursoEntity> buscar() {
		return dao.findAll();
	}
	
	public CursoEntity buscar(Integer id) {
		Optional<CursoEntity> curso = dao.findById(id);
		return curso.orElseThrow(() -> new ObjetoNaoEncontradoException("Xablau"));
	}
	
	public CursoEntity salvar(CursoEntity obj) {
		obj.setId(null);
		return (CursoEntity) dao.save(obj);
	}
}
