package br.com.kbssoftware.armarios.aula01;

import java.util.Date;


public class Reserva {
   private Pessoa pessoa;
   private Armario armario;
   private Date dataHoraDevolucao;
   private Date dataHoraEmprestimo;

    public Reserva() {
    }

    public Reserva(Pessoa pessoa, Armario armario, Date dataHoraDevolucao, Date dataHoraEmprestimo) {
        this.pessoa = pessoa;
        this.armario = armario;
        this.dataHoraDevolucao = dataHoraDevolucao;
        this.dataHoraEmprestimo = dataHoraEmprestimo;
    }

    public Armario getArmario() {
        return armario;
    }

    public Date getDataHoraDevolucao() {
        return dataHoraDevolucao;
    }

    public Date getDataHoraEmprestimo() {
        return dataHoraEmprestimo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setArmario(Armario armario) {
        this.armario = armario;
    }

    public void setDataHoraDevolucao(Date dataHoraDevolucao) {
        this.dataHoraDevolucao = dataHoraDevolucao;
    }

    public void setDataHoraEmprestimo(Date dataHoraEmprestimo) {
        this.dataHoraEmprestimo = dataHoraEmprestimo;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
    
   

    
   
   
   
   
}
