package br.senac.com.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senac.com.domino.Emdereco;

public interface EnderecoRepositorio extends JpaRepository<Emdereco,Integer> {
	
	

}
