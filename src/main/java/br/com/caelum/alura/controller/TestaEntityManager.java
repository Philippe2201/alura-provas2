package br.com.caelum.alura.controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestaEntityManager {
	public static void main(String[] args) {
		
		EntityManagerFactory em = Persistence.createEntityManagerFactory("Prova");
		em.close();
	}
}
