package br.senac.com.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.senac.com.domino.Estado;



@Repository
public interface EstadoRepositorio extends JpaRepository<Estado,Integer>{
	

}
