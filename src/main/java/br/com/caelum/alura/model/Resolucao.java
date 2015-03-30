package br.com.caelum.alura.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

 @Entity
public class Resolucao {
	 
	@ManyToOne 
	private Prova pova;
	
	@Id @GeneratedValue 
	private int id;
	
	private String email;
	
	public Prova getPova() {
		return pova;
	}

	public void setPova(Prova pova) {
		this.pova = pova;
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
