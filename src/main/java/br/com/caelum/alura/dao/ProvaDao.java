package br.com.caelum.alura.dao;

import java.math.BigInteger;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.alura.model.Prova;

public class ProvaDao {
	
	public EntityManager manager;
	
	@Inject
	public ProvaDao(EntityManager manager){
		this.manager = manager;
	}
	
	public ProvaDao(){
		this(null);
	}
	
	public Prova encontrarProva(Prova prova){
		return manager.find(Prova.class, prova.getId());
	}

}