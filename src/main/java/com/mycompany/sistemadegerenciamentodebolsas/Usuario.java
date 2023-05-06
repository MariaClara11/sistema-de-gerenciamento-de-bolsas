/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadegerenciamentodebolsas;

/**
 *
 * @author DELL
 */
public class Usuario {
    private String nome;
    private int idade;
    private String CPF;
    private String dataNascimento;
    private String login;
    private String senha;
    private String telefone;

    public Usuario(){
        this.nome = "";
        this.idade = 0;
        this.CPF = "";
        this.dataNascimento = "";
        this.login = "";
        this.senha = "";
        this.telefone = "";
    };
    
    public Usuario(String nome, int idade, String CPF, String dataNascimento, String login, String senha, String telefone, String DataNascimento) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.login = login;
        this.senha = senha;
        this.telefone = telefone;
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

    public String getLogin() {
        return login;
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

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void editaDadosUsuario(String nome, int idade, String CPF, String dataNascimento, String login, String senha, String telefone, String DataNascimento) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.login = login;
        this.senha = senha;
        this.telefone = telefone;
    }
    
    public void resetaDadosUsuario() {
        this.nome = "";
        this.idade = 0;
        this.CPF = "";
        this.dataNascimento = "";
        this.login = "";
        this.senha = "";
        this.telefone = "";
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", idade=" + idade + ", CPF=" + CPF + ", dataNascimento=" + dataNascimento + ", login=" + login + ", senha=" + senha + ", telefone=" + telefone + '}';
    }
}
