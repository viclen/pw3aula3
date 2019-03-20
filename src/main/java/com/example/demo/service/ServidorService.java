package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ServidorDAO;
import com.example.demo.entity.ServidorEntity;

@Service
public class ServidorService {
	
	@Autowired
	private ServidorDAO dao;

	public List<ServidorEntity> buscar() {
		return dao.findAll();
	}
	
	public ServidorEntity buscar(Integer id) {
		Optional<ServidorEntity> servidor = dao.findById(id);
		return servidor.orElse(null);
	}
	
}
