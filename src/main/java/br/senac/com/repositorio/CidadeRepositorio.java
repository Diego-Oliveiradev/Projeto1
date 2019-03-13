package br.senac.com.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;

import br.senac.com.domino.Cidade;

public interface CidadeRepositorio extends JpaRepository<Cidade,Integer>{
	
	

}
