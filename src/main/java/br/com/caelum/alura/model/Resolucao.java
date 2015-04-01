package br.com.caelum.alura.model;

import java.math.RoundingMode;
import java.text.DecimalFormat;
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
	private Long id;

	private String email;
	
	@OneToMany(mappedBy = "resolucao", fetch = FetchType.EAGER)
	private List<Resposta> respostas = new ArrayList<Resposta>();
	
	public Resolucao() {

	}

	public Resolucao(Prova prova, String emailAluno) {
		this.prova = prova;
		email = emailAluno;
	}

	public List<Resposta> getResposta() {
		return respostas;
	}

	public void setResposta(List<Resposta> resposta) {
		this.respostas = resposta;
	}

	public Prova getProva() {
		return prova;
	}

	public void setProva(Prova prova) {
		this.prova = prova;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString(){
		return "Resolucao id: " + id + " Quantidade de respostas: " + respostas.size();
	}

	public int getTotaldeAcertos() {
		int totalDeAcertos = 0;
		for(Resposta r : respostas){
			if(r.getQuestao().getRespostaCerta() == r.getRespostaAluno()) totalDeAcertos++;
		}
		return totalDeAcertos;
	}
	
	public double getNota(){
		double totalDeAcertos = getTotaldeAcertos();
		double totalDeQuestoes = prova.getQuestoes().size();
		double nota = 10*(totalDeAcertos/totalDeQuestoes);
		
		DecimalFormat df = new DecimalFormat("#.#");
		df.setRoundingMode(RoundingMode.UP);
		nota = Double.parseDouble(df.format(nota));
		return nota;
	}
	
	public int getNumeroDeQuestoes(){
		return prova.getQuestoes().size();
	}

}
