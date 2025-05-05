package com.mycompany.hotelmanagementsystem;

/**
 * Representa um quarto de hotel com suas principais características como
 * número, tipo, preço por noite, disponibilidade e descrição.
 *  
 * @author  
 * Itallo Moreno,  
 * Bruna Schultz,  
 * Eric Coraini
 */
public class Quarto {

    /** Número identificador do quarto. */
    private String numero;

    /** Tipo do quarto (ex: solteiro, casal, suíte, etc.). */
    private String tipo;

    /** Preço da diária do quarto. */
    private double precoPorNoite;

    /** Indica se o quarto está disponível para reserva. */
    private boolean disponivel;

    /** Descrição detalhada do quarto. */
    private String descricao;

    /**
     * Construtor para criar um novo quarto com os dados especificados.
     *
     * @param numero Número do quarto.
     * @param tipo Tipo do quarto.
     * @param precoPorNoite Valor da diária.
     * @param disponivel Disponibilidade do quarto.
     * @param descricao Descrição do quarto.
     */
    public Quarto(String numero, String tipo, double precoPorNoite, boolean disponivel, String descricao) {
        this.numero = numero;
        this.tipo = tipo;
        this.precoPorNoite = precoPorNoite;
        this.disponivel = disponivel;
        this.descricao = descricao;
    }

    /**
     * Retorna o número do quarto.
     * @return Número do quarto.
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define o número do quarto.
     * @param numero Novo número do quarto.
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Retorna o tipo do quarto.
     * @return Tipo do quarto.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o tipo do quarto.
     * @param tipo Novo tipo do quarto.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Retorna o valor da diária do quarto.
     * @return Preço por noite.
     */
    public double getPrecoPorNoite() {
        return precoPorNoite;
    }

    /**
     * Define o valor da diária do quarto.
     * @param precoPorNoite Novo preço por noite.
     */
    public void setPrecoPorNoite(double precoPorNoite) {
        this.precoPorNoite = precoPorNoite;
    }

    /**
     * Verifica se o quarto está disponível.
     * @return  true se estiver disponível, caso contrário  false.
     */
    public boolean isDisponivel() {
        return disponivel;
    }

    /**
     * Define a disponibilidade do quarto.
     * @param disponivel  true para disponível, false para indisponível.
     */
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    /**
     * Retorna a descrição do quarto.
     * @return Descrição do quarto.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do quarto.
     * @param descricao Nova descrição.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Retorna uma representação textual dos dados do quarto.
     *
     * @return String contendo os dados do quarto separados por ponto e vírgula.
     */
    @Override
    public String toString() {
        return numero + ";" + tipo + ";" + precoPorNoite + ";" + disponivel + ";" + descricao;
    }
}
