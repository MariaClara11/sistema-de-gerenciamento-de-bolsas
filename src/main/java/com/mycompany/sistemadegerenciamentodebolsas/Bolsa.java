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
    private List<Disciplina> preRequisitos;
    private String tipo;
    private float valor;
    private int quantidadeHoras;
    private int vagas;
    private String professorResponsavel;
    private String metodoEntrada;
    
    public Bolsa(String titulo, String tipo, String professorResponsavel, float valor, int quantidadeHoras, String metodoEntrada, int vagas, List<Disciplina> preRequisitos) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.professorResponsavel = professorResponsavel;
        this.valor = valor;
        this.quantidadeHoras = quantidadeHoras;
        this.metodoEntrada = metodoEntrada;
        this.vagas = vagas;
        this.preRequisitos = preRequisitos;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPreRequisitos(List<Disciplina> preRequisitos) {
        this.preRequisitos = preRequisitos;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setQuantidadeHoras(int quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public void setProfessorResponsavel(String professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public void setMetodoEntrada(String metodoEntrada) {
        this.metodoEntrada = metodoEntrada;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Disciplina> getPreRequisitos() {
        return preRequisitos;
    }

    public String getTipo() {
        return tipo;
    }

    public float getValor() {
        return valor;
    }

    public int getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public int getVagas() {
        return vagas;
    }

    public String getProfessorResponsavel() {
        return professorResponsavel;
    }

    public String getMetodoEntrada() {
        return metodoEntrada;
    }




    
    
}
    
    

