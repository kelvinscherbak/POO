package br.edu.ifpr.palestra.modelo;



public class Palestrante {
	public String nome;
	public String cpf;
	public String endereco;
	public String rg;
	public String dataNascimento;
	public String cidadeNascimento;
	public String estadoNascimento;
	
	
	public Palestrante(String nome,String cpf,String endereco,String rg,String dataNascimento,String cidadeNascimento,String estadoNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.cidadeNascimento = cidadeNascimento;
		this.estadoNascimento = estadoNascimento;
		
	}
}
