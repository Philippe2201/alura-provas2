package br.com.caelum.alura.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.alura.dao.ProvaDao;
import br.com.caelum.alura.dao.ResolucaoDao;
import br.com.caelum.alura.model.Prova;
import br.com.caelum.alura.model.Resolucao;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.validator.Validator;

@Controller
public class ResolucaoController {

	private Validator validator;
	private ResolucaoDao resolucaoDao;
	private ProvaDao provaDao;

	@Inject
	public ResolucaoController(Validator valitadator, ProvaDao provaDao, ResolucaoDao resolucaoDao) {
		this.validator = valitadator;
		this.provaDao = provaDao;
		this.resolucaoDao = resolucaoDao;
	}

	public ResolucaoController() {
		this(null, null, null);
	}

	@Post
	public void adicionar(List<Integer> respostas, Long idProva, String emailAluno) {
		Prova prova = provaDao.encontrarProva(idProva);
		Resolucao resolucao = prova.criaResolucao(respostas, emailAluno);
		resolucaoDao.salvaResolucao(resolucao);
	}
}
