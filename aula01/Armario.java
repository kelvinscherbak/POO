package br.com.kbssoftware.armarios.aula01;

public class Armario {
  
    private String numero;
    private boolean ativo;
    private String observacoes;

    public Armario() {
    }

    public Armario(String numero, boolean ativo, String observacoes) {
        this.numero = numero;
        this.ativo = ativo;
        this.observacoes = observacoes;
    }

    public String getNumero() {
        return numero;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    
    
    
    
    
}

