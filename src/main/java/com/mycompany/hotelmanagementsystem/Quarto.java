package com.mycompany.hotelmanagementsystem;

public class Quarto {
    // Atributos do quarto
    private String numero;
    private String tipo;
    private double precoPorNoite;
    private boolean disponivel;
    private String descricao;

    // Construtor da classe
    public Quarto(String numero, String tipo, double precoPorNoite, boolean disponivel, String descricao) {
        this.numero = numero;
        this.tipo = tipo;
        this.precoPorNoite = precoPorNoite;
        this.disponivel = disponivel;
        this.descricao = descricao;
    }

    // Métodos getters e setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecoPorNoite() {
        return precoPorNoite;
    }

    public void setPrecoPorNoite(double precoPorNoite) {
        this.precoPorNoite = precoPorNoite;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Método toString para representação em texto
    @Override
    public String toString() {
        return numero + ";" + tipo + ";" + precoPorNoite + ";" + disponivel + ";" + descricao;
    }
}