package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.AlunoEntity;

@Repository
public interface AlunoDAO<T> extends JpaRepository<AlunoEntity, Integer> {

}
