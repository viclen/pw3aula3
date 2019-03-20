package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.AlunoDAO;
import com.example.demo.dao.CursoDAO;
import com.example.demo.dao.TurmaDAO;
import com.example.demo.entity.AlunoEntity;
import com.example.demo.entity.CursoEntity;
import com.example.demo.entity.TurmaEntity;

@SpringBootApplication
public class ProjetoAulaApplication implements CommandLineRunner {
	
	
	@Autowired
	private CursoDAO cursoDAO;
	
	@Autowired
	private TurmaDAO turmaDAO;
	
	@Autowired
	private AlunoDAO alunoDAO;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoAulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		CursoEntity c1 = new CursoEntity(null, "SI", "Superior", "Noturno");
		CursoEntity c2 = new CursoEntity(null, "TMSI", "Medio", "Diurno");
		CursoEntity c3 = new CursoEntity(null, "ASD", "SSSsdd", "Noturno");
		CursoEntity c4 = new CursoEntity(null, "SI", "Superior", "Noturno");

		TurmaEntity turma1 = new TurmaEntity(null, "Turma 1", 5, c1);
		TurmaEntity turma2 = new TurmaEntity(null, "Turma 2", 3, c1);
		TurmaEntity turma3 = new TurmaEntity(null, "Turma 3", 1, c2);

		c1.getTurmas().addAll(Arrays.asList(turma1,turma2));
		c2.getTurmas().addAll(Arrays.asList(turma3));

		AlunoEntity a1 = new AlunoEntity(null,"aluno 1","1234124214","2343444444","jo@ozinho.com");
		AlunoEntity a2 = new AlunoEntity(null,"aluno 2","1234124214","2343444444","jo@ozinho.com");
		
		turma1.getAlunos().addAll(Arrays.asList(a1,a2));
		
		alunoDAO.saveAll(Arrays.asList(a1,a2));
		
		cursoDAO.saveAll(Arrays.asList(c1,c2,c3,c4));
		
		turmaDAO.saveAll(Arrays.asList(turma1,turma2,turma3));
	}

}
