/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemadegerenciamentodebolsas;

import java.util.ArrayList;
import java.util.List;

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
public class SistemaDeGerenciamentoDeBolsas {
    
    public static Disciplina cadastraDisciplina(String nome, String codigo, int creditos, List<String> preRequisitos){
        Disciplina disciplina = new Disciplina(nome, codigo, creditos, preRequisitos);
        return disciplina;
    }
    
    public static Aluno cadastraAluno (String matricula, String contaBancaria, int ira, String dataIngresso, List<Disciplina> disciplinas, String nome, int idade, String CPF, String dataNascimento, String login, String senha, String telefone){
        Aluno aluno = new Aluno( matricula, contaBancaria, ira, dataIngresso, disciplinas, nome, idade, CPF, dataNascimento, login, senha, telefone);
        return aluno;
    }
    
    public static Professor cadastraProfessor (String siap, String dataContratacao, List<Bolsa> bolsasCadastradas, String nome, int idade, String CPF, String dataNascimento, String login, String senha, String telefone){
        Professor professor = new Professor (siap, dataContratacao, bolsasCadastradas, nome, idade, CPF, dataNascimento, login, senha, telefone);
        return professor;
    }

    public static void main(String[] args) {
    /*Como ainda nao temos um banco de dados e nem aprendemos a integracao com interface
    vamos simular uma interacao com o usuario pelo terminal mesmo
    */
    
    //Criando os arrays lists de Pre requisitos para disciplinas
    List<String> PreRequisitosNenhum = new ArrayList<>();
    
    //instanciando algumas disciplinas
    Disciplina d1 = cadastraDisciplina("GA", "MAT155", 4, PreRequisitosNenhum);  
    Disciplina d2 = cadastraDisciplina("Calculo1", "MAT154", 4, PreRequisitosNenhum);
    Disciplina d3 = cadastraDisciplina("Algoritmos", "MAT119", 4, PreRequisitosNenhum);    
    Disciplina d4 = cadastraDisciplina("Lab de Quimica", "MAT126", 4, PreRequisitosNenhum);    


    
    //instanciando alguns alunos de exemplo inicial
    List<Disciplina> disA1 = new ArrayList<>();
    disA1.add(d1);
    disA1.add(d2);
    disA1.add(d3);
    disA1.add(d4);
    Aluno a1 = cadastraAluno("202165101AC", "101718", 78, "2021", disA1, "Maria Clara", 19, "12567876534", "04/06/2003", "mariaclara11", "12345", "32984299065");
    
    List<Disciplina> disA2 = new ArrayList<>();
    disA2.add(d1);
    disA2.add(d2);
    Aluno a2 = cadastraAluno("202165064AB", "178899", 80, "2022", disA2, "igor", 21, "97156678945", "09/03/2002", "igor1817", "12345", "");
    
    //instanciando professores
    
    List<Bolsa> bolsasP1 = new ArrayList<>();
    Professor p1 = cadastraProfessor("7803456", "05/10/2008", bolsasP1 , "joao", 32, "21923789965", "02/03/1991", "joao123", "12345", "71829098766");
    
    List<Disciplina> disBolsa = new ArrayList<>();
    disBolsa.add(d3);
    //professor cadastra bolsa
    p1.cadastraBolsa("Monitoria de Algoritmos", "Ira maior que 60", disBolsa, 400, 12, "Monitoria");
    
    
    
    
    
    
    
    
    
    }
}
