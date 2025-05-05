package com.mycompany.hotelmanagementsystem;

/**
 * Representa um hóspede no sistema de gerenciamento de hotel.
 * Contém informações pessoais como nome, CPF, telefone, endereço e email.
 *
 * @author Itallo Moreno,
 *         Bruna Schultz,
 *         Eric Coraini
 */
public class Hospede {

    // Atributos do hóspede
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private String email;

    /**
     * Construtor para criar um novo objeto {@code Hospede}.
     *
     * @param nome     o nome completo do hóspede
     * @param cpf      o CPF do hóspede
     * @param telefone o número de telefone do hóspede
     * @param endereco o endereço do hóspede
     * @param email    o endereço de e-mail do hóspede
     */
    public Hospede(String nome, String cpf, String telefone, String endereco, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
    }

    /**
     * Obtém o nome do hóspede.
     *
     * @return o nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do hóspede.
     *
     * @param nome o novo nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o CPF do hóspede.
     *
     * @return o CPF
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF do hóspede.
     *
     * @param cpf o novo CPF
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Obtém o telefone do hóspede.
     *
     * @return o telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o telefone do hóspede.
     *
     * @param telefone o novo telefone
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Obtém o endereço do hóspede.
     *
     * @return o endereço
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço do hóspede.
     *
     * @param endereco o novo endereço
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Obtém o email do hóspede.
     *
     * @return o email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o email do hóspede.
     *
     * @param email o novo email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retorna uma representação textual dos dados do hóspede no formato:
     * nome;cpf;telefone;endereco;email
     *
     * @return dados do hóspede
     */
    @Override
    public String toString() {
        return nome + ";" + cpf + ";" + telefone + ";" + endereco + ";" + email;
    }
}
