package br.com.kbssoftware.armarios.aula01;

import java.util.Date;

public class Pessoa {
    private String nome;
    private String email;
    private String telefone;
    private String senha;
    private boolean ativo;
    private Date dataAtualizacao;
    private Date dataCriacao;

    public Pessoa() {
    }

    public Pessoa(String nome, String email, String telefone, String senha, boolean ativo, Date dataAtualizacao, Date dataCriacao) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.ativo = ativo;
        this.dataAtualizacao = dataAtualizacao;
        this.dataCriacao = dataCriacao;
    }
    
    
    
    
    
    
}


    