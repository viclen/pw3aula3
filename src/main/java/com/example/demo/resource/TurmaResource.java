package com.example.demo.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TurmaEntity;
import com.example.demo.service.TurmaService;

@RestController
@RequestMapping(value = "/turmas")
public class TurmaResource {
	
	@Autowired
	private TurmaService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List> listar() {		
		List<TurmaEntity> listaTurmas = service.buscar();
		
		return ResponseEntity.ok(listaTurmas);
	}
	
	@RequestMapping(method= RequestMethod.GET, value="/{id}")
	public ResponseEntity<TurmaEntity> buscar(@PathVariable Integer id){
		TurmaEntity Turma = service.buscar(id);
		return ResponseEntity.ok(Turma);
	}
}
