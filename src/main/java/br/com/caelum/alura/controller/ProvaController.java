package br.com.caelum.alura.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.alura.dao.ProvaDao;
import br.com.caelum.alura.model.Prova;
import br.com.caelum.alura.model.Questao;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.Validator;

@Controller
public class ProvaController {
	
	private final Result result;
	private final ProvaDao dao;
	private final Validator validator;
	
	@Inject
	public ProvaController(Result result, Validator validator, ProvaDao dao){
		this.result = result;
		this.validator = validator;
		this.dao = dao;
	}
	
	public ProvaController(){
		this(null, null, null);
	}
	@Get
	public void adicionar(){
		
	}
	@Get
	public void resolver(Long idProva){
		Prova prova = new Prova();
		prova.setId(idProva);
		
		prova = dao.encontrarProva(idProva);
		
		if(prova == null){
			result.include("mensagem", "A prova não foi encontrada");
		}
		
		result.include("prova", prova);
	}
	@Post
	public void adicionar(List<Questao> questoes, String titulo, String observacao) {
		Prova prova = new Prova(titulo, observacao,questoes);
		dao.salvaProva(prova);
		
	}

}