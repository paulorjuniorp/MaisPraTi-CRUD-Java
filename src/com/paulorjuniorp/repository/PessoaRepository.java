package com.paulorjuniorp.repository;

import com.paulorjuniorp.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaRepository implements IPessoaRepository{


    List<Pessoa> listaPessoas = new ArrayList<>();

    @Override
    public void salvarPessoa(Pessoa pessoa) {
        listaPessoas.add(pessoa);
    }

    @Override
    public List<Pessoa> listarPessoas() {
        return listaPessoas;
    }

    @Override
    public boolean alterarPessoa(Pessoa pessoa) {
        return false;
    }

    @Override
    public void deletarPessoa(String nomeExclusao) {
        for (Pessoa pessoa:listaPessoas) {
            if (pessoa.getNome().equalsIgnoreCase(nomeExclusao)){
                listaPessoas.remove(pessoa);
                System.out.println("Removido com sucesso!");
            }
        }
    }
}
