/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadegerenciamentodebolsas;

import java.util.List;

/**
 *
 * @author DELL
 */
public class Funcionario extends Usuario {
    private String siap;
    private String dataContratacao;
    List<Bolsa> bolsasCadastradas;

    public Funcionario() {
        super();
        this.siap = "";
        this.dataContratacao = "";
        this.bolsasCadastradas.clear();
    }

    public Funcionario(String siap, String dataContratacao, List<Bolsa> bolsasCadastradas, String nome, int idade, String CPF, String dataNascimento, String login, String senha, String telefone, String DataNascimento) {
        super(nome, idade, CPF, dataNascimento, login, senha, telefone, DataNascimento);
        this.siap = siap;
        this.dataContratacao = dataContratacao;
        this.bolsasCadastradas = bolsasCadastradas;
    }

    public String getSiap() {
        return siap;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public List<Bolsa> getBolsasCadastradas() {
        return bolsasCadastradas;
    }

    public void setSiap(String siap) {
        this.siap = siap;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public void setBolsasCadastradas(List<Bolsa> bolsasCadastradas) {
        this.bolsasCadastradas = bolsasCadastradas;
    }

    @Override
    public String toString() {
        super.toString();
        return "Funcionario{" + "siap=" + siap + ", dataContratacao=" + dataContratacao + ", bolsasCadastradas=" + bolsasCadastradas + '}';
    }
    
    public void editaDadosUsuario(String siap, String dataContratacao, List<Bolsa> bolsasCadastradas, String nome, int idade, String CPF, String dataNascimento, String login, String senha, String telefone, String DataNascimento) {
        super.editaDadosUsuario(nome, idade, CPF, dataNascimento, login, senha, telefone, DataNascimento);
        this.siap = siap;
        this.dataContratacao = dataContratacao;
        this.bolsasCadastradas = bolsasCadastradas;
    }
    
    @Override
    public void resetaDadosUsuario() {
        super.resetaDadosUsuario();
        this.siap = "";
        this.dataContratacao = "";
        this.bolsasCadastradas.clear();
    }
    
    
    
    
    
    
}
