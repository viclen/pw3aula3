package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.TurmaEntity;

@Repository
public interface TurmaDAO<T> extends JpaRepository<TurmaEntity, Integer> {

}
