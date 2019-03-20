package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.AlunoEntity;
import com.example.demo.entity.ServidorEntity;

@Repository
public interface ServidorDAO<T> extends JpaRepository<ServidorEntity, Integer> {

}
