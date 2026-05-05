/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.arthur.cadastroalunos;

/**
 *
 * @author Arthur
 */
public class CadastroAlunos {

    public static void main(String[] args) {
        Turma geo = new Turma("Geografia", "Edna");
        Turma his = new Turma("Historia", "Cebolinha");
        Turma fis = new Turma("Fisica", "Reginaldo");
        fis.addAluno("Arthur Eich", "17");
        fis.addAluno("Arthur Augusto", "20");
        fis.addAluno("Pedro Silva", "27");
        fis.removeAluno("20");
        fis.buscarAluno("17");
        fis.listAlunos();
    }
}
