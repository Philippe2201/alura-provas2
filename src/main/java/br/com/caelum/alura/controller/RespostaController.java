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
	
	public  RespostaController(Prova id, Questao questao, Resposta respostaAluno, Validator valitadator){
		this.id = id;
		this.questao = questao;
		this.respostaAluno = respostaAluno;
		this.validator = valitadator;
	}
	@Inject
	public RespostaController(){
		this(null, null, null, null);
		
	}

	@Inject
	RespostaDao dao;

	@Inject
	Resolucao resolucao;
	
	@Inject
	ProvaDao provaDao;

	
	@Path("resposta/adicionar") @Post
	public void adicionar(List<String> respostas, int idProva, String idAluno){
		
		//busca a prova no banco
		
		Prova prova = new Prova();
		prova.setId(Long.valueOf(idProva));
		
		prova = provaDao.encontrarProva(prova);
		
		Resolucao email = new Resolucao();
		email.setEmail(idAluno);
//		List<Resposta> respostaList = new ArrayList<Resposta>();
		//preenchendo as respostas
				
		int index = 0;
		for(Questao questao : prova.getQuestoes()) {
			
			Resposta resposta = new Resposta();
			
			resposta.setQuestao(questao);
			resposta.setRespostaAluno(Integer.parseInt(respostas.get(index)));
			
			//dao.salvarResposta(resposta);
			System.out.println(resposta);
			index++;
		}
//		Resolucao resolucao = new Resolucao();
//		resolucao.setProva(prova);
//		resolucao.set(respostaList);
		
		
		System.out.println("oba");
	}
}
	

