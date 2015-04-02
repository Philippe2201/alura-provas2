package br.com.caelum.alura.dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.alura.model.Prova;
import br.com.caelum.alura.model.Questao;

public class ProvaDao {

	public EntityManager manager;

	@Inject
	public ProvaDao(EntityManager manager) {
		this.manager = manager;
	}

	public ProvaDao() {
		this(null);
	}

	public Prova encontrarProva(Long id) {
		return manager.find(Prova.class, id);
	}

	public void salvaProva(Prova prova) {
		manager.persist(prova);
		
		for (Questao questao : prova.getQuestoes()) {
			manager.persist(questao);
		}
	
		
	}

}