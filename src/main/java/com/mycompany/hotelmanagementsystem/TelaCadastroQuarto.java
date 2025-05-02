package com.mycompany.hotelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroQuarto extends JFrame {

    TelaCadastroQuarto() {
        setTitle("Cadastro de Quarto"); // Define o título da janela
        setBounds(100, 100, 800, 600); // Tamanho e posição da janela
        setLayout(null); // Layout absoluto
        getContentPane().setBackground(Color.WHITE); // Cor de fundo

        // Painel lateral com fundo cinza
        JPanel painel = new JPanel();
        painel.setBackground(new Color(0xD9D9D9)); // Cor do painel
        painel.setBounds(0, 0, 400, 600); // Ocupa a lateral esquerda
        painel.setLayout(null);
        add(painel);

        // Label e campo: Número do quarto
        JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(20, 50, 100, 30);
        painel.add(lblNumero);

        JTextField txtNumero = new JTextField();
        txtNumero.setBounds(20, 80, 300, 30);
        painel.add(txtNumero);

        // Label e campo: Tipo do quarto
        JLabel lblTipo = new JLabel("Tipo:");
        lblTipo.setBounds(20, 120, 100, 30);
        painel.add(lblTipo);

        JTextField txtTipo = new JTextField();
        txtTipo.setBounds(20, 150, 300, 30);
        painel.add(txtTipo);

        // Label e campo: Preço por noite
        JLabel lblPreco = new JLabel("Preço por Noite:");
        lblPreco.setBounds(20, 190, 150, 30);
        painel.add(lblPreco);

        JTextField txtPreco = new JTextField();
        txtPreco.setBounds(20, 220, 300, 30);
        painel.add(txtPreco);

        // Label e campo: Disponível (checkbox)
        JLabel lblDisponivel = new JLabel("Disponível:");
        lblDisponivel.setBounds(20, 260, 100, 30);
        painel.add(lblDisponivel);

        JCheckBox checkDisponivel = new JCheckBox();
        checkDisponivel.setBounds(100, 265, 30, 20);
        painel.add(checkDisponivel);

        // Label e campo: Descrição
        JLabel lblDescricao = new JLabel("Descrição:");
        lblDescricao.setBounds(20, 300, 100, 30);
        painel.add(lblDescricao);

        JTextField txtDescricao = new JTextField();
        txtDescricao.setBounds(20, 330, 300, 30);
        painel.add(txtDescricao);

        // Botão para salvar os dados
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

                // Cria objeto Quarto com os dados informados
                Quarto quarto = new Quarto(numero, tipo, preco, disponivel, descricao);

                // Mostra mensagem de confirmação
                JOptionPane.showMessageDialog(null, "Quarto cadastrado:\n" + quarto.toString());

                // Aqui você pode salvar os dados em arquivo ou banco
            }
        });

        // Logo do sistema
        ImageIcon logo = new ImageIcon(getClass().getResource("/logo_200.png")); 
        JLabel imagemLogo = new JLabel(logo);
            imagemLogo.setBounds(500, 150, 200, 300);
        add(imagemLogo);

        setVisible(true); // Torna a janela visível
    }

    public static void main(String[] args) {
        new TelaCadastroQuarto(); // Executa a tela
    }
}