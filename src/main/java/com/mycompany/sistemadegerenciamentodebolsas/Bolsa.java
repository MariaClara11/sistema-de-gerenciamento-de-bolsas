/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadegerenciamentodebolsas;
import java.util.*;
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
public class Bolsa {
    private String titulo;
    private String preRequisitos;
    private List<Disciplina> disciplinasRequisitadas;
    private float valor;
    private int quantidadeHoras;
    private String professorResponsavel;
    
    public Bolsa(String titulo, String preRequisitos, List<Disciplina> disciplinasRequisitadas, float valor, int quantidadeHoras, String professorResponsavel) {
        this.titulo = titulo;
        this.preRequisitos = preRequisitos;
        this.disciplinasRequisitadas = disciplinasRequisitadas;
        this.valor = valor;
        this.quantidadeHoras = quantidadeHoras;
        this.professorResponsavel = professorResponsavel;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getPreRequisitos() {
        return preRequisitos;
    }

    public List<Disciplina> getDisciplinasRequisitadas() {
        return disciplinasRequisitadas;
    }

    public float getValor() {
        return valor;
    }

    public int getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public String getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPreRequisitos(String preRequisitos) {
        this.preRequisitos = preRequisitos;
    }

    public void setDisciplinasRequisitadas(List<Disciplina> disciplinasRequisitadas) {
        this.disciplinasRequisitadas = disciplinasRequisitadas;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setQuantidadeHoras(int quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public void setProfessorResponsavel(String professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    @Override
    public String toString() {
        return "Bolsa{" +
                "titulo='" + titulo + '\'' +
                ", preRequisitos='" + preRequisitos + '\'' +
                ", disciplinasRequisitadas=" + disciplinasRequisitadas +
                ", valor=" + valor +
                ", quantidadeHoras=" + quantidadeHoras +
                ", professorResponsavel='" + professorResponsavel + '\'' +
                '}';
    }
}

