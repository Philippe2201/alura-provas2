package br.com.caelum.alura.dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.alura.model.Resposta;

public class RespostaDao {

	public EntityManager manager;

	@Inject
	public RespostaDao(EntityManager manager) {
		this.manager = manager;
	}

	public RespostaDao() {
		this(null);
	}

	public void salvarResposta(Resposta resposta) {
		manager.persist(resposta);
	}

	public Resposta buscarReposta(Resposta resposta) {
		System.out.println(manager + " manager da respostaDao");
		resposta = manager.find(Resposta.class, resposta.getId());
		return resposta;
	}

}
