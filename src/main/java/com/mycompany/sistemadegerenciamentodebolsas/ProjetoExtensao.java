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
public class ProjetoExtensao extends Bolsa {
    private String area;
    private String coordenador;
    private String local;
    
    public ProjetoExtensao(String titulo, String preRequisitos, List<Disciplina> disciplinasRequisitadas, float valor, int quantidadeHoras, String professorResponsavel, String area, String coordenador, String local) {
        super(titulo, preRequisitos, disciplinasRequisitadas, valor, quantidadeHoras, professorResponsavel);
        this.area = area;
        this.coordenador = coordenador;
        this.local = local;
    }
    
    public String getArea() {
        return area;
    }
    
    public String getCoordenador() {
        return coordenador;
    }
    
    public String getLocal() {
        return local;
    }
    
    public void setArea(String area) {
        this.area = area;
    }
    
    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }
    
    public void setLocal(String local) {
        this.local = local;
    }
    
    @Override
    public String toString() {
        return "ProjetoExtensao{" +
                "titulo='" + getTitulo() + '\'' +
                ", preRequisitos='" + getPreRequisitos() + '\'' +
                ", disciplinasRequisitadas=" + getDisciplinasRequisitadas() +
                ", valor=" + getValor() +
                ", quantidadeHoras=" + getQuantidadeHoras() +
                ", professorResponsavel='" + getProfessorResponsavel() + '\'' +
                ", area='" + area + '\'' +
                ", coordenador='" + coordenador + '\'' +
                ", local='" + local + '\'' +
                '}';
    }
}

