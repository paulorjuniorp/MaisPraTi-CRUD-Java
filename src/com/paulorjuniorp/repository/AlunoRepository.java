package com.paulorjuniorp.repository;

import com.paulorjuniorp.model.Aluno;

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

    }

    @Override
    public void deletarAluno(String nomeExclusao) {

    }
}
