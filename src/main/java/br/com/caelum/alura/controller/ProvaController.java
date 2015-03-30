package br.com.caelum.alura.controller;

import javax.inject.Inject;

import br.com.caelum.alura.dao.ProvaDao;
import br.com.caelum.alura.model.Prova;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.Validator;

@Controller
public class ProvaController {
	
	private final Result result;
	private  ProvaDao dao;
	private final Validator validator;
	//private final Mailer mailer;
	
	@Inject
	public ProvaController(Result result, Validator validator){
		this.result = result;
		this.validator = validator;
	}
	
	public ProvaController(){
		this(null, null);
	}
	
	@Get()
	public void resolver(int idProva){
		Prova prova = new Prova();
		prova.setId(idProva);
		
		dao.encontrarProva(prova);
		
		//prova.toString();
	}
	
	@Get("/teste")
	public void teste(){
		System.out.println("teste!");
	}
}
