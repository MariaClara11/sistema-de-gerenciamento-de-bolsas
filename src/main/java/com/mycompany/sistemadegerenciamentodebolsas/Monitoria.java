/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadegerenciamentodebolsas;

import java.util.List;

/**
 *
 * @author Marlon Ruffo
 */
public class Monitoria extends Bolsa {

    private String disciplinaMonitorada;
    private int cargaHorariaSemanal;
    private String localMonitoria;

    public Monitoria(String titulo, String preRequisitos, List<Disciplina> disciplinasRequisitadas, float valor, int quantidadeHoras, String professorResponsavel, String disciplinaMonitorada, int cargaHorariaSemanal, String localMonitoria, String horarioMonitoria) {
        super(titulo, preRequisitos, disciplinasRequisitadas, valor, quantidadeHoras, professorResponsavel);
        this.disciplinaMonitorada = disciplinaMonitorada;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
        this.localMonitoria = localMonitoria;
        this.horarioMonitoria = horarioMonitoria;
    }

    public void setDisciplinaMonitorada(String disciplinaMonitorada) {
        this.disciplinaMonitorada = disciplinaMonitorada;
    }

    public void setCargaHorariaSemanal(int cargaHorariaSemanal) {
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    public void setLocalMonitoria(String localMonitoria) {
        this.localMonitoria = localMonitoria;
    }

    public void setHorarioMonitoria(String horarioMonitoria) {
        this.horarioMonitoria = horarioMonitoria;
    }

    public String getDisciplinaMonitorada() {
        return disciplinaMonitorada;
    }

    public int getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }

    public String getLocalMonitoria() {
        return localMonitoria;
    }

    public String getHorarioMonitoria() {
        return horarioMonitoria;
    }
    private String horarioMonitoria;

}
