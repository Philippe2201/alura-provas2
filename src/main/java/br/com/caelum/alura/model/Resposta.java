package br.com.caelum.alura.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Resposta {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	private Questao questao;
	
	private int respostaAluno;
	
	@ManyToOne
	private Resolucao resolucao;

	public Resposta(Questao questao, int respostaAluno, Resolucao resolucao){
		this.questao = questao;
		this.respostaAluno = respostaAluno;
		this.resolucao = resolucao;
	}
	
	public Resposta(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Questao getQuestao() {
		return questao;
	}

	public void setQuestao(Questao questao) {
		this.questao = questao;
	}

	public int getRespostaAluno() {
		return respostaAluno;
	}

	public void setRespostaAluno(int respostaAluno) {
		this.respostaAluno = respostaAluno;
	}
	
	public Resolucao getResolucao() {
		return resolucao;
	}

	public void setResolucao(Resolucao resolucao) {
		this.resolucao = resolucao;
	}

}
