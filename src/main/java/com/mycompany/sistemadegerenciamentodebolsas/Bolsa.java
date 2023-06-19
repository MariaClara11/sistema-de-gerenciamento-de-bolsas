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
    private List<String> preRequisitos;

    private float valor;
    private int quantidadeHoras;
    private String professorResponsavel;

    public Bolsa(String titulo, List<String> preRequisitos, float valor, int quantidadeHoras, String professorResponsavel) {
        this.titulo = titulo;
        this.preRequisitos = preRequisitos;
        this.valor = valor;
        this.quantidadeHoras = quantidadeHoras;
        this.professorResponsavel = professorResponsavel;
    }

    

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPreRequisitos(List<String> preRequisitos) {
        this.preRequisitos = preRequisitos;
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

    public String getTitulo() {
        return titulo;
    }

    public List<String> getPreRequisitos() {
        return preRequisitos;
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
    
}
    
    

