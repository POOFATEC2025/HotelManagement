package com.mycompany.hotelmanagementsystem;

import javax.swing.*;
import java.awt.*;

/**
 * Tela de cadastro de usuário do sistema de gerenciamento hoteleiro.
 * 
 * Permite ao usuário preencher informações como nome, CPF, endereço,
 * telefone, email e senha para realizar o cadastro no sistema.
 * 
 * @author 
 * Itallo Moreno,  
 * Bruna Schultz,  
 * Eric Coraini
 */
public class Cadastrar extends JFrame {

    /**
     * Construtor da classe Cadastrar.
     * Inicializa e configura a interface de cadastro de usuário.
     */
    public Cadastrar() {
        setTitle("Cadastro de Usuário");
        setSize(1600, 900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Painel do formulário
        JPanel formPanel = new JPanel();
        formPanel.setLayout(null);
        formPanel.setBounds(100, 100, 1300, 700);
        formPanel.setBackground(new Color(0xF2F2F2));
        add(formPanel);

        JLabel title = new JLabel("Cadastro de Usuário");
        title.setFont(new Font("Arial", Font.BOLD, 32));
        title.setBounds(450, 20, 400, 40);
        formPanel.add(title);

        int y = 100;
        int fieldWidth = 700;
        int fieldHeight = 40;

        // Campos do formulário
        formPanel.add(createLabel("Nome Completo:", 100, y));
        JTextField nomeField = createTextField(300, y, fieldWidth, fieldHeight);
        formPanel.add(nomeField);
        y += 60;

        formPanel.add(createLabel("CPF:", 100, y));
        JTextField cpfField = createTextField(300, y, fieldWidth, fieldHeight);
        formPanel.add(cpfField);
        y += 60;

        formPanel.add(createLabel("Endereço:", 100, y));
        JTextField enderecoField = createTextField(300, y, fieldWidth, fieldHeight);
        formPanel.add(enderecoField);
        y += 60;

        formPanel.add(createLabel("Telefone:", 100, y));
        JTextField telefoneField = createTextField(300, y, fieldWidth, fieldHeight);
        formPanel.add(telefoneField);
        y += 60;

        formPanel.add(createLabel("Email:", 100, y));
        JTextField emailField = createTextField(300, y, fieldWidth, fieldHeight);
        formPanel.add(emailField);
        y += 60;

        formPanel.add(createLabel("Senha:", 100, y));
        JPasswordField senhaField = new JPasswordField();
        senhaField.setBounds(300, y, fieldWidth, fieldHeight);
        formPanel.add(senhaField);
        y += 60;

        formPanel.add(createLabel("Confirmar Senha:", 100, y));
        JPasswordField confirmarSenhaField = new JPasswordField();
        confirmarSenhaField.setBounds(300, y, fieldWidth, fieldHeight);
        formPanel.add(confirmarSenhaField);
        y += 80;

        JButton cadastrar = new JButton("Cadastrar");
        cadastrar.setBounds(500, y, 200, 50);
        cadastrar.setBackground(new Color(0x99A8E4));
        cadastrar.setForeground(Color.BLACK);
        formPanel.add(cadastrar);

        // Logo no canto superior direito
        ImageIcon logoIcon = new ImageIcon(getClass().getResource("/logo.png")); 
        Image logoImage = logoIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        JLabel logo = new JLabel(new ImageIcon(logoImage));
        logo.setBounds(1450, 20, 100, 100);
        add(logo);

        setVisible(true);
    }

    /**
     * Cria um JLabel formatado para ser usado nos campos do formulário.
     *
     * @param text Texto do rótulo.
     * @param x Posição X.
     * @param y Posição Y.
     * @return JLabel configurado.
     */
    private JLabel createLabel(String text, int x, int y) {
        JLabel label = new JLabel(text);
        label.setBounds(x, y, 180, 30);
        label.setFont(new Font("Arial", Font.PLAIN, 18));
        return label;
    }

    /**
     * Cria um JTextField formatado para entrada de dados no formulário.
     *
     * @param x Posição X.
     * @param y Posição Y.
     * @param width Largura do campo.
     * @param height Altura do campo.
     * @return JTextField configurado.
     */
    private JTextField createTextField(int x, int y, int width, int height) {
        JTextField field = new JTextField();
        field.setBounds(x, y, width, height);
        return field;
    }

    public static void main(String[] args) {
        new Cadastrar();
    }
}
