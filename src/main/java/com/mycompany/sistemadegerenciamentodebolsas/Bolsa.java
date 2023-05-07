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
    private String SiapProfessor;
    private String PreRequisitos;
    private List<Disciplina> DiscilplinasRequisitadas;
    private float valor;
    private int quantidadeHoras;
    private String tipo;

    public Bolsa(String titulo, String SiapProfessor, String PreRequisitos, List<Disciplina> DiscilplinasRequisitadas, float valor, int quantidadeHoras, String tipo) {
        this.titulo = titulo;
        this.SiapProfessor = SiapProfessor;
        this.PreRequisitos = PreRequisitos;
        this.DiscilplinasRequisitadas = DiscilplinasRequisitadas;
        this.valor = valor;
        this.quantidadeHoras = quantidadeHoras;
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSiapProfessor() {
        return SiapProfessor;
    }

    public String getPreRequisitos() {
        return PreRequisitos;
    }

    public List<Disciplina> getDiscilplinasRequisitadas() {
        return DiscilplinasRequisitadas;
    }

    public float getValor() {
        return valor;
    }

    public int getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setSiapProfessor(String SiapProfessor) {
        this.SiapProfessor = SiapProfessor;
    }

    public void setPreRequisitos(String PreRequisitos) {
        this.PreRequisitos = PreRequisitos;
    }

    public void setDiscilplinasRequisitadas(List<Disciplina> DiscilplinasRequisitadas) {
        this.DiscilplinasRequisitadas = DiscilplinasRequisitadas;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setQuantidadeHoras(int quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Bolsa{" + "titulo=" + titulo + ", SiapProfessor=" + SiapProfessor + ", PreRequisitos=" + PreRequisitos + ", DiscilplinasRequisitadas=" + DiscilplinasRequisitadas + ", valor=" + valor + ", quantidadeHoras=" + quantidadeHoras + ", tipo=" + tipo + '}';
    }

}
