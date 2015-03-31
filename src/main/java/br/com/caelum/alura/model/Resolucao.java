package br.com.caelum.alura.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Resolucao {

	@ManyToOne
	private Prova prova;

	@Id
	@GeneratedValue
	private int id;

	private String email;
	
	@OneToMany(mappedBy = "resolucao", fetch = FetchType.EAGER)
	private List<Resposta> resposta = new ArrayList<Resposta>();
	
	public Resolucao() {
		// TODO Auto-generated constructor stub
	}

	public Resolucao(Prova prova, String emailAluno) {
		this.prova = prova;
		email = emailAluno;
	}

	public List<Resposta> getResposta() {
		return resposta;
	}

	public void setResposta(List<Resposta> resposta) {
		this.resposta = resposta;
	}

	public Prova getProva() {
		return prova;
	}

	public void setProva(Prova prova) {
		this.prova = prova;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void getTotaldeAcertos() {

	}

	public void getMedia() {

	}
}
