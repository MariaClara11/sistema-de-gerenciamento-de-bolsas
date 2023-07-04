/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadegerenciamentodebolsas;

import java.util.List;

/**
 * Autores do trabalho:
 *
 * Nome: Maria Clara Ribeiro de Menezes Matricula: 202165101AC
 *
 * Nome: Igor Titoneli Almeida Matricula: 202165064AB
 *
 * Nome: Christian Rafael De Oliveira Coelho Matricula: 202065249AC
 *
 * Nome: Marlon Ruffo Nascimento Matricula: 202065165AC
 */
public class Extensao extends Projeto{
    
    public Extensao(String titulo, List<String> preRequisitos, float valor, int quantidadeHoras, int vagas, String professorResponsavel, String metodoEntrada) {
        super(titulo, preRequisitos, valor, quantidadeHoras, vagas, professorResponsavel, metodoEntrada);
    }

    @Override
    public String retornaTipo() {
        return "Bolsa Extensao";
    }
    
        
    
}
