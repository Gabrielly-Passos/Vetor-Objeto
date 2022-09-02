package br.com.fiap.beans;

public class Aluno {

	  private String nome;
	  private double media;
	  private int faltas;
	  private int idade;
	  
	  public Aluno(String n, double m, int f, int i) {
	   nome = n;
	   media = m;
	   faltas = f;
	   idade = i;
	  }
	  
	  public Aluno() {
		  }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
