package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CursoEntity;

@Repository
public interface CursoDAO<T> extends JpaRepository<CursoEntity, Integer> {
	
}
