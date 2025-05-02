package com.mycompany.hotelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroHospede extends JFrame {

    TelaCadastroHospede() {
        setTitle("Cadastro de Hóspede"); // Define o título da janela
        setBounds(100, 100, 800, 600); // Define posição e tamanho da janela
        setLayout(null); // Layout absoluto

        getContentPane().setBackground(Color.WHITE); // Cor de fundo branca

        // Painel lateral com retângulo cinza
        JPanel painel = new JPanel();
        painel.setBackground(new Color(0xD9D9D9)); // Cinza claro
        painel.setBounds(0, 0, 400, 600); // Ocupa lateral esquerda
        painel.setLayout(null);
        add(painel);

        // Campos de texto e labels
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(20, 50, 100, 30);
        painel.add(lblNome);

        JTextField txtNome = new JTextField();
        txtNome.setBounds(20, 80, 300, 30);
        painel.add(txtNome);

        JLabel lblCpf = new JLabel("CPF:");
        lblCpf.setBounds(20, 120, 100, 30);
        painel.add(lblCpf);

        JTextField txtCpf = new JTextField();
        txtCpf.setBounds(20, 150, 300, 30);
        painel.add(txtCpf);

        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setBounds(20, 190, 100, 30);
        painel.add(lblTelefone);

        JTextField txtTelefone = new JTextField();
        txtTelefone.setBounds(20, 220, 300, 30);
        painel.add(txtTelefone);

        JLabel lblEndereco = new JLabel("Endereço:");
        lblEndereco.setBounds(20, 260, 100, 30);
        painel.add(lblEndereco);

        JTextField txtEndereco = new JTextField();
        txtEndereco.setBounds(20, 290, 300, 30);
        painel.add(txtEndereco);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(20, 330, 100, 30);
        painel.add(lblEmail);

        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(20, 360, 300, 30);
        painel.add(txtEmail);

        // Botão de salvar
        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(100, 420, 120, 40);
        painel.add(btnSalvar);

        // Ação do botão
        btnSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                String cpf = txtCpf.getText();
                String telefone = txtTelefone.getText();
                String endereco = txtEndereco.getText();
                String email = txtEmail.getText();

                // Cria objeto Hospede com os dados informados
                Hospede hospede = new Hospede(nome, cpf, telefone, endereco, email);

                // Exibe mensagem de confirmação
                JOptionPane.showMessageDialog(null, "Hóspede cadastrado:\n" + hospede.toString());

                // Aqui você pode adicionar lógica para salvar no banco ou arquivo
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
        new TelaCadastroHospede(); // Executa a tela
    }
}
