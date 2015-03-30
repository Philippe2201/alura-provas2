package br.com.caelum.alura.dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.alura.model.Resolucao;

public class ResolucaoDao {
	
	public EntityManager manager;
	
	@Inject
	public ResolucaoDao(EntityManager manager){
		this.manager = manager;
	}
	
	public ResolucaoDao(){
		this(null);
	}
	
	public void salvaResolucao(Resolucao resolucao){
		manager.persist(resolucao);
	}

}
