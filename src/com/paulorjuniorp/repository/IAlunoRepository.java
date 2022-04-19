package com.paulorjuniorp.repository;


import com.paulorjuniorp.model.Aluno;

import java.util.List;

public interface IAlunoRepository {

    public void salvarAluno(Aluno aluno);
    public List<Aluno> listarAlunos();
    public void alterarAluno(String nomeAluno,Aluno aluno);
    public void deletarAluno(String nomeExclusao);
}
