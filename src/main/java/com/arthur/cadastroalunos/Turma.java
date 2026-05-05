/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arthur.cadastroalunos;

import java.util.ArrayList;

/**
 *
 * @author Arthur
 */
public class Turma {
    private String nome;
    private String professor;
    private ArrayList <Aluno> alunos = new ArrayList<>();
    public Turma(String nome, String professor) {
        this.nome = nome;
        this.professor = professor;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
    public void listAlunos(){
        int i=0;
        for (Aluno count : alunos) {
            System.out.printf("Nome:%s  Matricula:%s\n", alunos.get(i).getNome(), alunos.get(i).getMatricula());
            i++;
            }
    }
    public void addAluno(String nome, String matricula) {
        Aluno x = new Aluno(nome, matricula, this.nome);
        alunos.add(x);
    } 
    public void removeAluno(String matricula) {
        int i=0;
        for (Aluno count : alunos) {
            if(matricula.equals(alunos.get(i).matricula)) {
                   alunos.remove(alunos.get(i)); 
                   return;
            }
            i++;
        }
        System.out.println("Aluno nao encontrado");
    } 
    public void buscarAluno(String matricula) {
        int i=0;
        for (Aluno count : alunos) {
            if(matricula.equals(alunos.get(i).matricula)) {
                   System.out.printf("Nome:%s  Matricula:%s  Turma:%s\n", alunos.get(i).getNome(), alunos.get(i).getMatricula(), this.nome);
                   return;
            }
            i++;
        }
        System.out.println("Aluno nao encontrado");
    }
}
