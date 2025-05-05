package com.mycompany.hotelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Tela gráfica para o cadastro de quartos no sistema de gerenciamento de hotel.
 * 
 * Permite ao usuário inserir os dados de um quarto como número, tipo,
 * preço por noite, disponibilidade e descrição. 
 * 
 * @author  
 * Itallo Moreno,  
 * Bruna Schultz,  
 * Eric Coraini
 */
public class TelaCadastroQuarto extends JFrame {

    /**
     * Construtor da classe. Inicializa os componentes da interface gráfica
     * e define o comportamento da tela de cadastro de quarto.
     */
    TelaCadastroQuarto() {
        setTitle("Cadastro de Quarto");
        setBounds(100, 100, 800, 600);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Painel lateral esquerdo
        JPanel painel = new JPanel();
        painel.setBackground(new Color(0xD9D9D9));
        painel.setBounds(0, 0, 400, 600);
        painel.setLayout(null);
        add(painel);

        // Campo: Número
        JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(20, 50, 100, 30);
        painel.add(lblNumero);

        JTextField txtNumero = new JTextField();
        txtNumero.setBounds(20, 80, 300, 30);
        painel.add(txtNumero);

        // Campo: Tipo
        JLabel lblTipo = new JLabel("Tipo:");
        lblTipo.setBounds(20, 120, 100, 30);
        painel.add(lblTipo);

        JTextField txtTipo = new JTextField();
        txtTipo.setBounds(20, 150, 300, 30);
        painel.add(txtTipo);

        // Campo: Preço por noite
        JLabel lblPreco = new JLabel("Preço por Noite:");
        lblPreco.setBounds(20, 190, 150, 30);
        painel.add(lblPreco);

        JTextField txtPreco = new JTextField();
        txtPreco.setBounds(20, 220, 300, 30);
        painel.add(txtPreco);

        // Campo: Disponível (checkbox)
        JLabel lblDisponivel = new JLabel("Disponível:");
        lblDisponivel.setBounds(20, 260, 100, 30);
        painel.add(lblDisponivel);

        JCheckBox checkDisponivel = new JCheckBox();
        checkDisponivel.setBounds(100, 265, 30, 20);
        painel.add(checkDisponivel);

        // Campo: Descrição
        JLabel lblDescricao = new JLabel("Descrição:");
        lblDescricao.setBounds(20, 300, 100, 30);
        painel.add(lblDescricao);

        JTextField txtDescricao = new JTextField();
        txtDescricao.setBounds(20, 330, 300, 30);
        painel.add(txtDescricao);

        // Botão Salvar
        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(100, 400, 120, 40);
        painel.add(btnSalvar);

        // Ação do botão de salvar
        btnSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String numero = txtNumero.getText();
                String tipo = txtTipo.getText();
                double preco = Double.parseDouble(txtPreco.getText());
                boolean disponivel = checkDisponivel.isSelected();
                String descricao = txtDescricao.getText();

                Quarto quarto = new Quarto(numero, tipo, preco, disponivel, descricao);

                JOptionPane.showMessageDialog(null, "Quarto cadastrado:\n" + quarto.toString());

                // Lógica para salvar os dados pode ser adicionada aqui
            }
        });

        // Logo do sistema
        ImageIcon logo = new ImageIcon(getClass().getResource("/logo_200.png"));
        JLabel imagemLogo = new JLabel(logo);
        imagemLogo.setBounds(500, 150, 200, 300);
        add(imagemLogo);

        setVisible(true);
    }

    /**
     * Método principal que executa a tela de cadastro de quarto.
     *
     * @param args.
     */
    public static void main(String[] args) {
        new TelaCadastroQuarto();
    }
}
