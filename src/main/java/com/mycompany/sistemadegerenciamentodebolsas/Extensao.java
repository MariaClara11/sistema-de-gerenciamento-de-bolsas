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
public class Extensao extends Projeto{
    
    public Extensao(String titulo, List<String> preRequisitos, float valor, int quantidadeHoras, int vagas, String professorResponsavel, String metodoEntrada) {
        super(titulo, preRequisitos, valor, quantidadeHoras, vagas, professorResponsavel, metodoEntrada);
    }

    @Override
    public String retornaTipo() {
        return "Bolsa Extensao";
    }
    
        
    
}
