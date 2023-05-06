/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadegerenciamentodebolsas;

import java.util.*;

/**
 *
 * @author igor
 */
public class Disciplina {
    private String nome;
    private String codigo;
    private int creditos;
    private List<String> preRequisitos = new ArrayList<>();

    public Disciplina(String nome, String codigo, int creditos, List<String> preRequisitos, String metodoAvaliacao, int quantAlunos, String[] Salas) {
        this.nome = nome;
        this.codigo = codigo;
        this.creditos = creditos;
        this.preRequisitos = preRequisitos;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public List<String> getPreRequisitos() {
        return preRequisitos;
    }
    
    public String getPreRequisitosString() {
        
        String lista = ""; //inicio da lista de pre-requisitos vazia
        for (String preRequisito : preRequisitos) {
            lista += preRequisito + ", ";
        }
        return lista.substring(0, lista.length() - 2); // remove a última vírgula e espaço
    }
        
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    public void setPreRequisitos(String preRequisitos) {
        this.preRequisitos.add(preRequisitos);
    }
    
    @Override
    public String toString() {
        return "Disciplina{" + "nome=" + nome + ", codigo=" + codigo + ", creditos=" + creditos + ", preRequisitos=" + preRequisitos + '}';
    }

}
