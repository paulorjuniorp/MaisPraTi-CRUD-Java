package com.paulorjuniorp.repository;

import com.paulorjuniorp.model.Aluno;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AlunoRepository implements IAlunoRepository{

    List<Aluno> listaAlunos = new ArrayList<>();

    @Override
    public void salvarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    @Override
    public List<Aluno> listarAlunos() {
        return listaAlunos;
    }

    @Override
    public void alterarAluno(String nomeAluno, Aluno aluno) {
        for (Aluno alunoList:listaAlunos) {
            if (alunoList.getNome().equalsIgnoreCase(nomeAluno)){
                int indice = listaAlunos.indexOf(alunoList);
                listaAlunos.set(indice,aluno);
            }
        }
    }

    @Override
    public void deletarAluno(String nomeExclusao) {
//
        Iterator<Aluno> alunosIterator = listaAlunos.iterator();
        while (alunosIterator.hasNext()){
            Aluno aluno = alunosIterator.next();
            if (aluno.getNome().equalsIgnoreCase(nomeExclusao)){
                listaAlunos.remove(aluno);
                System.out.println("Removido com sucesso!");
            }
        }
    }
}
