/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadegerenciamentodebolsas;

/**
 * Autores do trabalho:
 *
 * Nome: Maria Clara Ribeiro de Menezes Matricula: 202165101AC
 *
 * Nome: Igor Titoneli Almeida Matricula: 202165064AB
 *
 * Nome: Christian Rafael De Oliveira Coelho Matricula: 202065249AC
 *
 * Nome: Marlon Ruffo Nascimento Matricula: 202065165AC
 */
import java.util.*;

public class Aluno extends Usuario {

    private String matricula;
    private String dataIngresso;
    Set<Disciplina> disciplinas;

    public Aluno() {
        super();
        this.matricula = "";
        this.dataIngresso = "";
        this.disciplinas = new HashSet<>();
    }

    public Aluno(String matricula, String nome, String CPF, String dataNascimento, String senha) {
        super(nome, 0, CPF, dataNascimento, senha, "");
        this.matricula = matricula;
        this.disciplinas = new HashSet<>();
    }

   

    public String getMatricula() {
        return matricula;
    }
    
    public String getDataIngresso() {
        return dataIngresso;
    }

    public Set<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setDataIngresso(String dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public void setDisciplinas(Set<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }


    

    @Override
    public String retornaId() {
        return this.matricula;
    }

  

    

}
