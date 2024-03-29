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
    private String siape;
    private String dataContratacao;
    
    public Professor(String siape, String nome, String CPF, String dataNascimento, String senha) {
        super(nome, CPF, dataNascimento, senha, "");
        this.siape = siape;
        this.dataContratacao = "";
    }

    public String getSiape() {
        return siape;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    
    
    //O professor cadastra a bolsa
    public Projeto cadastraBolsa(String titulo, int tipo, String professor, float valor, int cargaHoraria, String metodoEntrada, int vagas, List<String> preRequisitos){
        Projeto bolsa;
        if (tipo == 1){
            bolsa = new Monitoria(titulo, preRequisitos, valor, cargaHoraria, vagas, professor, metodoEntrada);
        }else if(tipo == 2){
            bolsa = new IniciacaoCientifica(titulo, preRequisitos, valor, cargaHoraria, vagas, professor, metodoEntrada);
        }else if(tipo == 3){
            bolsa = new TreinamentoProfissional(titulo, preRequisitos, valor, cargaHoraria, vagas, professor, metodoEntrada);
        }else{
            bolsa = new Extensao(titulo, preRequisitos, valor, cargaHoraria, vagas, professor, metodoEntrada);
        }
        return bolsa;
    }
    
    @Override 
    public String retornaId(){
        return siape;
    }
}
