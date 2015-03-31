package br.com.caelum.alura.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

 @Entity
public class Resolucao {
	 
	@ManyToOne 
	private Prova prova;
	
	@Id @GeneratedValue 
	private int id;
	private String email;
	
//	private List<Reposta> resposta;
//	
//	
//		
//	public List<Reposta> getResposta() {
//		return resposta;
//	}
//
//	public void setResposta(List<Reposta> resposta) {
//		this.resposta = resposta;
//	}


	
	
	
//atributo  lista de respota aluno 
	
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
	
	public void getTotaldeAcertos(){
		
		
	}
	
	public void getMedia(){
		
		
	}
}
