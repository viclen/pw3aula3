package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AlunoDAO;
import com.example.demo.entity.AlunoEntity;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoDAO dao;

	public List<AlunoEntity> buscar() {
		return dao.findAll();
	}
	
	public AlunoEntity buscar(Integer id) {
		Optional<AlunoEntity> Aluno = dao.findById(id);
		return Aluno.orElse(null);
	}
	
}
