package br.senac.com.inicializacao;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.senac.com.domino.Aluno;
import br.senac.com.domino.Cidade;
import br.senac.com.domino.Emdereco;
import br.senac.com.domino.Estado;
import br.senac.com.domino.Usuario;
import br.senac.com.repositorio.AlunoRepositorio;
import br.senac.com.repositorio.CidadeRepositorio;
import br.senac.com.repositorio.EnderecoRepositorio;
import br.senac.com.repositorio.EstadoRepositorio;
import br.senac.com.repositorio.UsuarioRepositorio;


@Component
public class Init implements ApplicationListener<ContextRefreshedEvent>{

		@Autowired
		AlunoRepositorio alunoRepositorio;
		
		@Autowired
		EstadoRepositorio estadoRepositorio;
	
		@Autowired
		CidadeRepositorio cidadeRepositorio;
		
		@Autowired
		EnderecoRepositorio enderecoRepositorio;	
			
		@Autowired
		UsuarioRepositorio usuarioRepositorio;
		
		@Override
		public void onApplicationEvent(ContextRefreshedEvent event) {
			
			Aluno aluno1 = new Aluno();
			aluno1.setNome("Lucas");
			aluno1.setEmail("lucas@gmail.com");
			
			alunoRepositorio.save(aluno1);
			
			Usuario user1 = new Usuario();
			user1.setNome("Diego");
		
			usuarioRepositorio.save(user1);
		
		
			Aluno alunoGravado = alunoRepositorio.findByEmail("lucas@gmail.com");
		
			Estado estado1 = new Estado();
			estado1.setNome("Rio de Janeiro");

			Estado estado2 = new Estado();
			estado2.setNome("São Paulo");
			
			Cidade cidade1 = new Cidade();
			cidade1.setNome("Angra dos Reis");
			
			Cidade cidade2 = new Cidade();
			cidade2.setNome("Cabo Frio");
			
			Cidade cidade3 = new Cidade();
			cidade3.setNome("Mogi das Cruzes");					
			
			Cidade cidade4 = new Cidade();
			cidade4.setNome("Mogi das Cruzes");	
			
			estadoRepositorio.saveAll(Arrays.asList(estado1,estado2)); 
			
			cidadeRepositorio.saveAll(Arrays.asList(cidade1,cidade2,cidade3)); 			
		
			
			Emdereco end1 = new Emdereco();
			end1.setRua("Rua dos Andradas");
			end1.setNumero("20");
			end1.setBairro("centro");
			end1.setComplemento("Bloco B");
			end1.setCidade(cidade2);
			end1.setAluno(aluno1);
			
			Emdereco end2 = new Emdereco();
			end1.setRua("Rua dos Andradas");
			end1.setNumero("20");
			end1.setBairro("centro");
			end1.setComplemento("Bloco B");
			end1.setCidade(cidade2);
			end1.setAluno(aluno1);
			end1.setUsuario(user1);
			

			
			aluno1.getTelefones().addAll(Arrays.asList("12345678","12345698"));
			user1.getTelefones().addAll(Arrays.asList("12345678","12345698"));
			
			
			alunoRepositorio.save(aluno1);
			
			enderecoRepositorio.saveAll(Arrays.asList(end1,end2));
		}
}
