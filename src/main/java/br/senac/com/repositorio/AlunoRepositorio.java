package br.senac.com.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.senac.com.domino.Aluno;

@Repository
public interface AlunoRepositorio extends JpaRepository<Aluno, Integer> {

}
