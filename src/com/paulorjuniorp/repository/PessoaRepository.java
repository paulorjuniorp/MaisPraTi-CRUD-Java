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
    public void alterarPessoa(String nomePessoa, Pessoa pessoa) {
        for (Pessoa pessoaList:listaPessoas) {
            if (pessoaList.getNome().equalsIgnoreCase(nomePessoa)){
                int indice = listaPessoas.indexOf(pessoaList);
                listaPessoas.set(indice,pessoa);
            }
        }
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
