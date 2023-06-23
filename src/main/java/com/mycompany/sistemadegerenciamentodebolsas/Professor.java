/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadegerenciamentodebolsas;

import java.util.ArrayList;
import java.util.List;

/**
 *Autores do trabalho:
 * 
 * Nome: Maria Clara Ribeiro de Menezes
 * Matricula: 202165101AC
 * 
 * Nome: Igor Titoneli Almeida
 * Matricula: 202165064AB
 * 
 * Nome: Christian Rafael De Oliveira Coelho
 * Matricula: 202065249AC
 * 
 * Nome: Marlon Ruffo Nascimento
 * Matricula: 202065165AC
 */
public class Professor extends Usuario {
    private String siap;
    private String dataContratacao;
    List<Bolsa> bolsasCadastradas;
    /*
    public Professor() {
        super();
        this.siap = "";
        this.dataContratacao = "";
        this.bolsasCadastradas.clear();
    }
    */
    public Professor(String siape, String nome, String CPF, String dataNascimento, String senha) {
        super(nome, 0, CPF, dataNascimento, senha, "");
        this.siap = siape;
        this.dataContratacao = "";
        this.bolsasCadastradas = new ArrayList<>();
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
        return "Funcionario{" + super.toString()+ ", siap=" + siap + ", dataContratacao=" + dataContratacao + ", bolsasCadastradas=" + bolsasCadastradas + '}';
    }
    
    public void editaDadosUsuario(String siap, String dataContratacao, List<Bolsa> bolsasCadastradas, String nome, int idade, String CPF, String dataNascimento, String login, String senha, String telefone, String DataNascimento) {
        super.editaDadosUsuario(nome, idade, CPF, dataNascimento, senha, telefone, DataNascimento);
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
    
    //O professor cadastra a bolsa
    public Bolsa cadastraBolsa(String titulo, String tipo, String professor, float valor, int cargaHoraria, String metodoEntrada, int vagas, List<String> preRequisitos){
        
        Bolsa bolsa = new Bolsa(titulo, preRequisitos, tipo, valor, cargaHoraria, vagas, professor, metodoEntrada, null);
        bolsasCadastradas.add(bolsa);
        return bolsa;
    }
}
