package br.com.caelum.alura.dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.alura.model.Resolucao;
import br.com.caelum.alura.model.Resposta;

public class ResolucaoDao {
	
	public EntityManager manager;
	private RespostaDao respostaDao;
	
	@Inject
	public ResolucaoDao(EntityManager manager,RespostaDao respostaDao){
		this.manager = manager;
		this.respostaDao = respostaDao;
	}
	
	public ResolucaoDao(){
		this(null,null);
	}
	
	public void salvaResolucao(Resolucao resolucao){
		manager.persist(resolucao);
		for(Resposta resposta : resolucao.getResposta()){
			respostaDao.salvarResposta(resposta);
		}
	}
	
	public Resolucao encontraResolucao(Long id){
		return manager.find(Resolucao.class, id);
	}

}
