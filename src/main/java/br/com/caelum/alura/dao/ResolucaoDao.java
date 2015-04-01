package br.com.caelum.alura.dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.caelum.alura.model.Resolucao;
import br.com.caelum.alura.model.Resposta;

public class ResolucaoDao {

	public EntityManager manager;
	private RespostaDao respostaDao;

	@Inject
	public ResolucaoDao(EntityManager manager, RespostaDao respostaDao) {
		this.manager = manager;
		this.respostaDao = respostaDao;
	}

	public ResolucaoDao() {
		this(null, null);
	}

	public void salvaResolucao(Resolucao resolucao) {
		manager.persist(resolucao);
		for (Resposta resposta : resolucao.getResposta()) {
			respostaDao.salvarResposta(resposta);
		}
	}

	public Resolucao encontraResolucao(Long id) {
		return manager.find(Resolucao.class, id);
	}

	// select * from Resolucao r, Resposta res where r.id = res.resolucao_id and
	// r.id = 15;
	public Resolucao encontraResolucaoComRespostas(Long resolucaoId) {
		String hql = "select reso from Resolucao reso join fetch reso.respostas resp where reso.id = :id";
		TypedQuery<Resolucao> query = manager.createQuery(hql, Resolucao.class);
		query.setParameter("id",resolucaoId);
		return query.getSingleResult();
	}

}
