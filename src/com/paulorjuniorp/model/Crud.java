package com.paulorjuniorp.model;

import com.paulorjuniorp.repository.AlunoRepository;
import com.paulorjuniorp.repository.PessoaRepository;

import java.util.List;
import java.util.Scanner;

public class Crud {

    Scanner entrada = new Scanner(System.in);
    PessoaRepository pessoaRepository = new PessoaRepository();
    AlunoRepository alunoRepository = new AlunoRepository();

    public void create(){
        try {
            System.out.println("Insira o nome");
            String nome = entrada.nextLine();

            System.out.println("Insira o numero de telefone");
            String telefone = entrada.nextLine();

            System.out.println("Insira a data de nascimento");
            String dataNascimento = entrada.nextLine();

            System.out.println("Possui nota final? sim || nao");
            String temNotaFinal = entrada.next();
            entrada.nextLine();

            if (temNotaFinal.equalsIgnoreCase("nao")){
                Pessoa pessoa = new Pessoa();
                pessoa.setNome(nome);
                pessoa.setTelefone(telefone);
                pessoa.setDataNascimento(dataNascimento);
                pessoa.getDataCadastro();
                pessoa.getDataAtualizacao();

                pessoaRepository.salvarPessoa(pessoa);
            }else{

                System.out.println("Digite a nota final");
                double notaFinal = entrada.nextDouble();
                entrada.nextLine();

                Aluno aluno = new Aluno();
                aluno.setNome(nome);
                aluno.setTelefone(telefone);
                aluno.setDataNascimento(dataNascimento);
                aluno.setNotaFinal(notaFinal);
                aluno.getDataCadastro();
                aluno.getDataAtualizacao();

                alunoRepository.salvarAluno(aluno);

            }
        }catch (Exception e){
            System.out.println("Não foi possivel salvar a pessoa/aluno: ");
            e.printStackTrace();
        }

    }

    public void read(){

        List<Pessoa> exibePessoa = pessoaRepository.listarPessoas();
        for (Pessoa exibir:exibePessoa) {
            System.out.println("-------Pessoa--------");
            System.out.println("Nome: " + exibir.getNome());
            System.out.println("Telefone: " + exibir.getTelefone());
            System.out.println("Data de nascimento: " + exibir.getDataNascimento());
            System.out.println("Data de cadastro: " + exibir.getDataCadastro());
            System.out.println("Data de atualização: " + exibir.getDataAtualizacao());
            System.out.println("-------------------------------------------");
        }

        List<Aluno> exibeAluno = alunoRepository.listarAlunos();
        for (Aluno exibir:exibeAluno) {
            System.out.println("----------Aluno----------");
            System.out.println("Nome: " + exibir.getNome());
            System.out.println("Telefone: " + exibir.getTelefone());
            System.out.println("Data de nascimento: " + exibir.getDataNascimento());
            System.out.println("Nota final: " + exibir.getNotaFinal());
            System.out.println("Data de cadastro: " + exibir.getDataCadastro());
            System.out.println("Data de atualização: " + exibir.getDataAtualizacao());
            System.out.println("-------------------------------------------");
        }
    }

    public void update(){
        try {
            System.out.println("Você deseja alterar pessoa ou aluno? 1 - Pessoa || 2 - Aluno");
            int opcaoAlteracao = entrada.nextInt();
            entrada.nextLine();

            if (opcaoAlteracao == 1){
                Pessoa pessoaUpdate = new Pessoa();

                System.out.println("Quem você deseja atualizar?");
                String pessoaAtualizar = entrada.nextLine();

                System.out.println("Insira o nome");
                String nomePessoaUpdate = entrada.nextLine();

                System.out.println("Insira o numero de telefone");
                String telefonePessoaUpdate = entrada.nextLine();

                System.out.println("Insira a data de nascimento");
                String dataNascimentoPessoaUpdate = entrada.nextLine();
                entrada.nextLine();

                pessoaUpdate.setNome(nomePessoaUpdate);
                pessoaUpdate.setTelefone(telefonePessoaUpdate);
                pessoaUpdate.setDataNascimento(dataNascimentoPessoaUpdate);
                pessoaUpdate.setDataAtualizacao(pessoaUpdate.getDataAtualizacao());

                pessoaRepository.alterarPessoa(pessoaAtualizar,pessoaUpdate);
            } else if (opcaoAlteracao == 2) {
                Aluno alunoUpdate = new Aluno();

                System.out.println("Quem você deseja atualizar?");
                String alunoAtualizar = entrada.nextLine();

                System.out.println("Insira o nome");
                String nomeAlunoUpdate = entrada.nextLine();

                System.out.println("Insira o numero de telefone");
                String telefoneAlunoUpdate = entrada.nextLine();

                System.out.println("Insira a data de nascimento");
                String dataNascimentoAlunoUpdate = entrada.nextLine();

                System.out.println("Insira a nota final");
                double notaFinalAlunoUpdate = entrada.nextDouble();
                entrada.nextLine();

                alunoUpdate.setNome(nomeAlunoUpdate);
                alunoUpdate.setTelefone(telefoneAlunoUpdate);
                alunoUpdate.setDataNascimento(dataNascimentoAlunoUpdate);
                alunoUpdate.setNotaFinal(notaFinalAlunoUpdate);
                alunoUpdate.setDataAtualizacao(alunoUpdate.getDataAtualizacao());

                alunoRepository.alterarAluno(alunoAtualizar,alunoUpdate);
            }
            else{
                System.out.printf("Opção inválida!");
            }
        }catch (Exception e){
            System.out.println("Não foi possivel alterar a pessoa/aluno: ");
            e.printStackTrace();
        }
    }

    public void delete(){
        try {
            System.out.println("Deseja excluir pessoa ou aluno? 1 - Pessoa || 2 - Aluno");
            int opcaoExclusao = entrada.nextInt();
            entrada.nextLine();
            if (opcaoExclusao == 1) {
                System.out.println("Quem você deseja excluir?");
                String nomeExclusao = entrada.nextLine();
                pessoaRepository.deletarPessoa(nomeExclusao);
            } else if (opcaoExclusao == 2) {
                System.out.println("Quem você deseja excluir?");
                String nomeExclusao = entrada.nextLine();
                alunoRepository.deletarAluno(nomeExclusao);
            }
        }catch (Exception e){
            System.out.println("Não foi possivel alterar a pessoa/aluno: ");
            e.printStackTrace();
        }


    }

}
