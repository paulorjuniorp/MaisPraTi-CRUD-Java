package com.paulorjuniorp.model;

import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private String telefone;
    private String dataNascimento;
    private final LocalDate dataCadastro = LocalDate.now();;
    private LocalDate dataAtualização = LocalDate.now();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public LocalDate getDataAtualização() {
        return dataAtualização;
    }

    public void setDataAtualização(LocalDate dataAtualização) {
        this.dataAtualização = dataAtualização;
    }
}
