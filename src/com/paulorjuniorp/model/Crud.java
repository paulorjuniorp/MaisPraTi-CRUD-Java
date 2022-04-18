package com.paulorjuniorp.model;

import com.paulorjuniorp.repository.PessoaRepository;

import java.util.List;
import java.util.Scanner;

public class Crud {

    Scanner entrada = new Scanner(System.in);
    PessoaRepository pessoaRepository = new PessoaRepository();

    public void create(){
        System.out.println("Insira o nome");
        String nomePessoa = entrada.nextLine();

        System.out.println("Insira o numero de telefone");
        String telefonePessoa = entrada.nextLine();

        System.out.println("Insira a data de nascimento");
        String dataNascimentoPessoa = entrada.nextLine();

        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nomePessoa);
        pessoa.setTelefone(telefonePessoa);
        pessoa.setDataNascimento(dataNascimentoPessoa);

        pessoaRepository.salvarPessoa(pessoa);
    }


    public void read(){

        List<Pessoa> exibePessoa = pessoaRepository.listarPessoas();
        for (Pessoa exibir:exibePessoa) {
            System.out.println("Nome: " + exibir.getNome());
            System.out.println("Telefone: " + exibir.getTelefone());
            System.out.println("Data de nascimento: " + exibir.getDataNascimento());
            System.out.println("-------------------------------------------");
        }

    }

    public void update(){
        Pessoa pessoaUpdate = new Pessoa();

        System.out.println("Quem você deseja atualizar?");
        String pessoaAtualizar = entrada.nextLine();

        System.out.println("Insira o nome");
        String nomePessoaUpdate = entrada.nextLine();

        System.out.println("Insira o numero de telefone");
        String telefonePessoaUpdate = entrada.nextLine();

        System.out.println("Insira a data de nascimento");
        String dataNascimentoPessoaUpdate = entrada.nextLine();

        pessoaUpdate.setNome(nomePessoaUpdate);
        pessoaUpdate.setTelefone(telefonePessoaUpdate);
        pessoaUpdate.setDataNascimento(dataNascimentoPessoaUpdate);

        pessoaRepository.alterarPessoa(pessoaAtualizar,pessoaUpdate);

    }

    public void delete(){
        System.out.println("Quem você deseja excluir?");
        String nomeExclusao = entrada.nextLine();
        pessoaRepository.deletarPessoa(nomeExclusao);
    }

}
