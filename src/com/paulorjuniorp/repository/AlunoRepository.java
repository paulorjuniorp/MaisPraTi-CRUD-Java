package com.paulorjuniorp.repository;

import com.paulorjuniorp.model.Aluno;
import com.paulorjuniorp.model.Pessoa;

import java.util.ArrayList;
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
        for (Aluno aluno:listaAlunos) {
            if (aluno.getNome().equalsIgnoreCase(nomeExclusao)){
                listaAlunos.remove(aluno);
                System.out.println("Removido com sucesso!");
            }
        }
    }
}
