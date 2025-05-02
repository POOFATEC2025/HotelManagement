package com.mycompany.hotelmanagementsystem;

public class Hospede {
    // Atributos do hóspede
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private String email;

    // Construtor da classe
    public Hospede(String nome, String cpf, String telefone, String endereco, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
    }

    // Métodos getters e setters para acessar e modificar os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método toString para retornar os dados do hóspede como texto (útil para salvar em arquivo ou exibir)
    @Override
    public String toString() {
        return nome + ";" + cpf + ";" + telefone + ";" + endereco + ";" + email;
    }
}