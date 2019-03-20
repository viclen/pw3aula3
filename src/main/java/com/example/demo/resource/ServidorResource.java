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

import com.example.demo.entity.ServidorEntity;
import com.example.demo.service.ServidorService;

@RestController
@RequestMapping(value = "/servidores")
public class ServidorResource {
	
	@Autowired
	private ServidorService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List> listar() {		
		List<ServidorEntity> listaServidores = service.buscar();
		
		return ResponseEntity.ok(listaServidores);
	}
	
	@RequestMapping(method= RequestMethod.GET, value="/{id}")
	public ResponseEntity<ServidorEntity> buscar(@PathVariable Integer id){
		ServidorEntity Servidor = service.buscar(id);
		return ResponseEntity.ok(Servidor);
	}
}
