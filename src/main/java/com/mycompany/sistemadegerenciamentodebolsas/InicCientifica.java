/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadegerenciamentodebolsas;

import java.util.List;

/**
 *
 * @author Marlon Ruffo
 */
public class InicCientifica extends Bolsa {
   private int duracao; 

    public InicCientifica(int duracao, String titulo, String preRequisitos, List<Disciplina> disciplinasRequisitadas, float valor, int quantidadeHoras, String professorResponsavel) {
        super(titulo, preRequisitos, disciplinasRequisitadas, valor, quantidadeHoras, professorResponsavel);
        this.duracao = duracao;
    }
}





    

    

