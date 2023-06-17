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
public class ProjetoExtensao extends Bolsa{
    
    public ProjetoExtensao(String titulo, String SiapProfessor, String PreRequisitos, List<Disciplina> DiscilplinasRequisitadas, float valor, int quantidadeHoras, String tipo) {
        super(titulo, SiapProfessor, PreRequisitos, DiscilplinasRequisitadas, valor, quantidadeHoras, tipo);
    }
    
}
