/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadegerenciamentodebolsas;
import java.util.*;
/**
 *
 * @author marlo
 */
public class Bolsa {
    private String titulo;
    private String professor;
    private List<String> preRequisitos;
    private float valor;
    private int quantidadeHoras;
    private String tipo;
    
    public Bolsa(String titulo, String professor, List<String> preRequisitos, float valor, int quantidadeHoras, String tipo) {
        this.titulo = titulo;
        this.professor = professor;
        this.preRequisitos = preRequisitos;
        this.valor = valor;
        this.quantidadeHoras = quantidadeHoras;
        this.tipo = tipo;
        
    }
    
    public String getTitulo() {
        return this.titulo;
    }
    public String getProfessor() {
        return this.professor;
    }
    public float getValor() {
        return this.valor;
    }
    public int getQuantidadeHoras() {
        return this.quantidadeHoras;
    }
    public String getPreRequisitos() {
        String lista = ""; //inicio da lista de pre-requisitos vazia
        for (String preRequisito : preRequisitos) {
            lista += preRequisito + ", ";
        }
        return lista.substring(0, lista.length() - 2); // remove a última vírgula e espaço
    }
    public String getTipo(String tipo) {
        return this.tipo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setProfessor(String professor) {
        this.professor = professor;
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
    public void setPreRequisitos(String preRequisitos) {
        this.preRequisitos.add(preRequisitos);
    }
    @Override
    public String toString() {
        return "Bolsa{" + "titulo=" + titulo + ", professor=" + professor + ", preRequisitos=" + preRequisitos + ", valor=" + valor + ", quantidadeHoras=" + quantidadeHoras + ", tipo=" + tipo + '}';
    }
}
