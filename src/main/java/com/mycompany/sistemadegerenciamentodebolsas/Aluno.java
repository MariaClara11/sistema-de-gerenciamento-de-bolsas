/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadegerenciamentodebolsas;

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
import java.util.*;

public class Aluno extends Usuario{
    private String matricula;
    private String contaBancaria;
    private int ira;
    private String dataIngresso;
    List<Disciplina> disciplinas;

    public Aluno() {
        super();
        this.matricula = "";
        this.contaBancaria = "";
        this.ira = 0;
        this.dataIngresso = "";
        this.disciplinas = new ArrayList<>();
    }

    public Aluno(String matricula, String nome, String CPF, String dataNascimento, String senha) {
        super(nome,0, CPF, dataNascimento, senha, "");
        this.matricula = matricula;
    }
    
    public Aluno(String matricula, String contaBancaria, int ira, String dataIngresso, List<Disciplina> disciplinas, String nome, int idade, String CPF, String dataNascimento, String senha, String telefone) {
        super(nome, idade, CPF, dataNascimento, senha, telefone);
        this.matricula = matricula;
        this.contaBancaria = contaBancaria;
        this.ira = ira;
        this.dataIngresso = dataIngresso;
        this.disciplinas = disciplinas;
    }

    
    public Aluno(String matricula, String contaBancaria, int ira, String dataIngresso, String nome, int idade, String CPF, String dataNascimento, String senha, String telefone) {
        super(nome, idade, CPF, dataNascimento, senha, telefone);
        this.matricula = matricula;
        this.contaBancaria = contaBancaria;
        this.ira = ira;
        this.dataIngresso = dataIngresso;
        this.disciplinas = new ArrayList<>();
    }
    
    public String getMatricula() {
        return matricula;
    }

    public String getContaBancaria() {
        return contaBancaria;
    }

    public int getIra() {
        return ira;
    }

    public String getDataIngresso() {
        return dataIngresso;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    public void setIra(int ira) {
        this.ira = ira;
    }

    public void setDataIngresso(String dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return"Aluno{" + super.toString()+ ", matricula=" + matricula + ", contaBancaria=" + contaBancaria + ", ira=" + ira + ", dataIngresso=" + dataIngresso + ", disciplinas=" + disciplinas + '}';
    }
    
    public void editaDadosUsuario(String matricula, String contaBancaria, int ira, String dataIngresso, List<Disciplina> disciplinas, String nome, int idade, String CPF, String dataNascimento, String login, String senha, String telefone, String DataNascimento) {
        super.editaDadosUsuario(nome, idade, CPF, dataNascimento, senha, telefone, DataNascimento);
        this.matricula = matricula;
        this.contaBancaria = contaBancaria;
        this.ira = ira;
        this.dataIngresso = dataIngresso;
        this.disciplinas = disciplinas;
    }
    
    @Override
    public void resetaDadosUsuario() {
        super.resetaDadosUsuario();
        this.matricula = "";
        this.contaBancaria = "";
        this.ira = 0;
        this.dataIngresso = "";
        this.disciplinas.clear();
    }

    
    
}
