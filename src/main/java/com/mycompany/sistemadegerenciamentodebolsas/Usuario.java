/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadegerenciamentodebolsas;

import java.util.Date;

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
public abstract class Usuario {
    private String nome;
    private int idade;
    private String CPF;
    private String dataNascimento;
    private String senha;
    private String telefone;
    private Date dataDeInscricao;

    public Usuario(){
        this.nome = "";
        this.idade = 0;
        this.CPF = "";
        this.dataNascimento = "";
        this.senha = "";
        this.telefone = "";
    };
    
    public Usuario(String nome, int idade, String CPF, String dataNascimento, String senha, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.telefone = telefone;
        this.dataDeInscricao = new Date(); // para aparecer inscrito desde hoje
    }

    public Date getDataDeInscricao() {
        return dataDeInscricao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCPF() {
        return CPF;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }


    public String getSenha() {
        return senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void editaDadosUsuario(String nome, int idade, String CPF, String dataNascimento, String senha, String telefone, String DataNascimento) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.telefone = telefone;
    }
    
    public void resetaDadosUsuario() {
        this.nome = "";
        this.idade = 0;
        this.CPF = "";
        this.dataNascimento = "";
        this.senha = "";
        this.telefone = "";
    }
    
    public abstract String retornaId();

    @Override
    public String toString() {
        return "nome=" + nome + ", idade=" + idade + ", CPF=" + CPF + ", dataNascimento=" + dataNascimento + ", senha=" + senha + ", telefone=" + telefone;
    }
}
