package edu.dio.java.POO.Construtores;

public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
    public Pessoa (String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
    
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String newendereco) {
		endereco = newendereco;
	}
	//...
	//setters de nome e cpf ?
}
