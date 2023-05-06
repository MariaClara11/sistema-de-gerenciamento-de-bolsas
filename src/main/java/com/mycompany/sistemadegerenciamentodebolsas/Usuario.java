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
    private String login;
    private String senha;
    
    public Usuario(){
    }
    
    public Usuario(String nome, int idade, String login, String senha){
        this.nome = nome;
        this.idade = idade;
        this.login = login;
        this.senha = senha;
    }
}
