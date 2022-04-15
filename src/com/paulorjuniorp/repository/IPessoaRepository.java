package com.paulorjuniorp.repository;

import com.paulorjuniorp.model.Pessoa;

import java.util.List;

public interface IPessoaRepository {
    public void salvarPessoa(Pessoa pessoa);
    public List<Pessoa> listarPessoas();
    public boolean alterarPessoa(Pessoa pessoa);
    public void deletarPessoa(String nomeExclusao);
}
