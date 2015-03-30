package br.com.caelum.alura.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Prova {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String titulo;

	@Column(columnDefinition = "TEXT")
	private String observacao;

	@OneToMany(mappedBy = "prova", fetch = FetchType.EAGER)
	private List<Questao> questoes;

	public Prova() {

	}

	public Prova(Long id, String titulo, String observacao, List<Questao> questoes) {
		this.id = id;
		this.titulo = titulo;
		this.observacao = observacao;
		this.questoes = questoes;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public List<Questao> getQuestoes() {
		return questoes;
	}

	public void setQuestoes(List<Questao> questoes) {
		this.questoes = questoes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return titulo;
	}

}
