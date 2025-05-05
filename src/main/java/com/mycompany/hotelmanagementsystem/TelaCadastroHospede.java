package com.mycompany.hotelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Tela gráfica para cadastro de hóspedes no sistema de gerenciamento de hotel.
 * 
 * <p>Esta interface permite a entrada de informações básicas do hóspede,
 * como nome, CPF, telefone, endereço e e-mail. Após preencher os campos,
 *
 * @author  
 * Itallo Moreno,  
 * Bruna Schultz,  
 * Eric Coraini
 */
public class TelaCadastroHospede extends JFrame {

    /**
     * Construtor da tela de cadastro. Inicializa os componentes da interface gráfica.
     */
    TelaCadastroHospede() {
        setTitle("Cadastro de Hóspede");
        setBounds(100, 100, 800, 600);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Painel lateral
        JPanel painel = new JPanel();
        painel.setBackground(new Color(0xD9D9D9));
        painel.setBounds(0, 0, 400, 600);
        painel.setLayout(null);
        add(painel);

        // Labels e campos de texto
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

        // Botão Salvar
        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(100, 420, 120, 40);
        painel.add(btnSalvar);

        // Ação do botão de salvar
        btnSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                String cpf = txtCpf.getText();
                String telefone = txtTelefone.getText();
                String endereco = txtEndereco.getText();
                String email = txtEmail.getText();

                Hospede hospede = new Hospede(nome, cpf, telefone, endereco, email);

                JOptionPane.showMessageDialog(null, "Hóspede cadastrado:\n" + hospede.toString());

                // Lógica de persistência pode ser adicionada aqui
            }
        });

        // Logo do sistema
        ImageIcon logo = new ImageIcon(getClass().getResource("/logo_200.png"));
        JLabel imagemLogo = new JLabel(logo);
        imagemLogo.setBounds(500, 150, 200, 300);
        add(imagemLogo);

        setVisible(true);
    }

 
    public static void main(String[] args) {
        new TelaCadastroHospede();
    }
}
