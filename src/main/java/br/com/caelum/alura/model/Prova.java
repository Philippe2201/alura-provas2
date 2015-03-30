package br.com.caelum.alura.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Prova {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String titulo;
	
	private String obsercacao;
	
	@OneToMany
	private List<Questao> questoes;
	

	public String getObsercacao() {
		return obsercacao;
	}

	public void setObsercacao(String obsercacao) {
		this.obsercacao = obsercacao;
	}

	public List<Questao> getQuestoes() {
		return questoes;
	}

	public void setQuestoes(List<Questao> questoes) {
		this.questoes = questoes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public String toString(){
		return titulo;
	}

}
