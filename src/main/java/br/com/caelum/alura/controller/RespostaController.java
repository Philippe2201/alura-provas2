package br.com.caelum.alura.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import br.com.caelum.alura.dao.ProvaDao;
import br.com.caelum.alura.dao.ResolucaoDao;
import br.com.caelum.alura.dao.RespostaDao;
import br.com.caelum.alura.model.Prova;
import br.com.caelum.alura.model.Questao;
import br.com.caelum.alura.model.Resolucao;
import br.com.caelum.alura.model.Resposta;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.validator.Validator;

@Controller
public class RespostaController {
	
	private Prova id;
	private Questao questao;
	private Resposta respostaAluno;
	private Validator validator;
	ResolucaoDao resolucaoDao;
	RespostaDao dao;
	Resolucao resolucao;	
	ProvaDao provaDao;
	
	@Inject
	public  RespostaController(Prova id, Questao questao, Resposta respostaAluno, Validator valitadator, 
			RespostaDao dao, Resolucao resolucao, ProvaDao provaDao, ResolucaoDao resolucaoDao){
		this.id = id;
		this.questao = questao;
		this.respostaAluno = respostaAluno;
		this.validator = valitadator;
		this.dao = dao;
		this.resolucao = resolucao;
		this.provaDao = provaDao;
		this.resolucaoDao = resolucaoDao;
	}
	
	public RespostaController(){
		this(null, null, null, null, null, null, null, null);	
	}

	
	@Path("resposta/adicionar") @Post
	public void adicionar(List<Integer> respostas, int idProva, String idAluno){
		
		
		//busca a prova no banco
		
		Prova prova = new Prova();
		prova.setId(Long.valueOf(idProva));
		
		prova = provaDao.encontrarProva(prova);
		
		Resolucao email = new Resolucao();
		email.setEmail(idAluno);
		List<Resposta> respostaList = new ArrayList<Resposta>();
			
		int index = 0;
		for(Questao questao : prova.getQuestoes()) {
			
			Resposta resposta = new Resposta();
			
			resposta.setQuestao(questao);
			resposta.setRespostaAluno(respostas.get(index));
			
			
			respostaList.add(resposta);
			index++;
		}
		Resolucao resolucao = new Resolucao();
		resolucao.setProva(prova);
		resolucao.setResposta(respostaList);
		resolucao.setEmail(idAluno);
		resolucaoDao.salvaResolucao(resolucao);
		
		
		
		System.out.println("oba");
	}
}
	

