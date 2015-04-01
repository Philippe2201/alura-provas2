package br.com.caelum.alura.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.alura.dao.ProvaDao;
import br.com.caelum.alura.dao.ResolucaoDao;
import br.com.caelum.alura.model.Prova;
import br.com.caelum.alura.model.Resolucao;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.Validator;

@Controller
public class ResolucaoController {

	private Validator validator;
	private ResolucaoDao resolucaoDao;
	private ProvaDao provaDao;
	private Result result;

	@Inject
	public ResolucaoController(Validator valitadator, ProvaDao provaDao, ResolucaoDao resolucaoDao, Result result) {
		this.validator = valitadator;
		this.provaDao = provaDao;
		this.resolucaoDao = resolucaoDao;
		this.result = result;
	}

	public ResolucaoController() {
		this(null, null, null, null);
	}

	@Post
	public void adicionar(List<Integer> respostas, Long idProva, String emailAluno) {
		Prova prova = provaDao.encontrarProva(idProva);
		Resolucao resolucao = prova.criaResolucao(respostas, emailAluno);
		System.out.println("Resolucao que acabou de ser criada | " + resolucao);
		System.out.println("Quantidade de acertos: " + resolucao.getTotaldeAcertos());
		resolucaoDao.salvaResolucao(resolucao);
		result.forwardTo(this).resultado(resolucao.getId());
	}
	
	@Get
	public void resultado(Long resolucaoId){
		Resolucao resolucao = resolucaoDao.encontraResolucaoComRespostas(resolucaoId);
		result.include("resolucao", resolucao);
	}
}
