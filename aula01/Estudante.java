package br.com.kbssoftware.armarios.aula01;

import java.util.Date;

public class Estudante extends Pessoa { 
    private String ra;
   
    public Estudante() {
   
    }

    public Estudante(String ra, String nome, String email, String telefone, String senha, boolean ativo, Date dataAtualizacao, Date dataCriacao) {
        super(nome, email, telefone, senha, ativo, dataAtualizacao, dataCriacao);
        this.ra = ra;
    }

    public Estudante(String ra) {
        this.ra = ra;
    }

    
    
    
    
  
}
