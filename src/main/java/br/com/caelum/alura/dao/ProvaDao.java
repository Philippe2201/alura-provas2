package br.com.caelum.alura.dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.hibernate.Session;

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
		System.out.println(manager);
		manager.getTransaction().begin();
		return manager.find(Prova.class, prova);
	}

}
