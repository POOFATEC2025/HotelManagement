package com.mycompany.hotelmanagementsystem;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Classe principal da interface gráfica do sistema.
 * Esta janela inicial exibe a tela de login com opções de autenticação e cadastro.
 *  
 * @author 
 * Itallo Moreno,  
 * Bruna Schultz,  
 * Eric Coraini
 */
public class HotelManagementSystem extends JFrame implements ActionListener {

    /**
     * Construtor que inicializa a interface gráfica inicial do sistema.
     */
    public HotelManagementSystem() {
        setBounds(0, 0, 1600, 900);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Painel lateral com fundo cinza
        Retangulo painel = new Retangulo();
        painel.setBounds(0, 43, 697, 857);
        painel.setLayout(null);
        painel.setOpaque(false);
        add(painel);

        // Rótulos e campos de entrada
        JLabel user = new JLabel("Email");
        user.setBounds(144, 200, 100, 40);
        painel.add(user);

        JLabel textPass = new JLabel("Senha");
        textPass.setBounds(144, 354, 100, 40);
        painel.add(textPass);

        JTextField email = new JTextField();
        email.setBounds(144, 240, 440, 64);
        painel.add(email);

        JTextField password = new JTextField();
        password.setBounds(144, 394, 440, 64);
        painel.add(password);

        // Botão de login
        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(157, 622, 384, 64);
        loginBtn.setBackground(new Color(153, 168, 228));
        loginBtn.setForeground(Color.BLACK);
        loginBtn.setOpaque(true);
        loginBtn.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        painel.add(loginBtn);

        // Lógica de autenticação
        loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String emailDigitado = email.getText();
                String senhaDigitada = password.getText();

                Login login = new Login();
                if (login.autenticar(emailDigitado, senhaDigitada)) {
                    new Dashboard(); // Abre o dashboard
                    dispose(); // Fecha a tela de login
                } else {
                    JOptionPane.showMessageDialog(null, "Login ou senha inválidos.");
                }
            }
        });

        // Botão de cadastro
        JButton cadastrarBtn = new JButton("Cadastrar");
        cadastrarBtn.setBounds(157, 508, 384, 64);
        cadastrarBtn.setBackground(new Color(200, 255, 200));
        cadastrarBtn.setForeground(Color.BLACK);
        cadastrarBtn.setOpaque(true);
        cadastrarBtn.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        cadastrarBtn.addActionListener(e -> new Cadastrar());
        painel.add(cadastrarBtn);

        // Exibe logotipo centralizado
        ImageIcon originalIcon = new ImageIcon(getClass().getResource("/logo.png"));
        int desiredWidth = 200;
        int originalWidth = originalIcon.getIconWidth();
        int originalHeight = originalIcon.getIconHeight();
        int desiredHeight = (desiredWidth * originalHeight) / originalWidth;

        Image scaledImage = originalIcon.getImage().getScaledInstance(desiredWidth, desiredHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        int spaceStartX = 600;
        int availableWidth = 1600 - spaceStartX;
        int centeredX = spaceStartX + (availableWidth - desiredWidth) / 2;
        int frameHeight = 900;
        int centeredY = (frameHeight - desiredHeight) / 2;

        JLabel imageLabel = new JLabel(scaledIcon);
        imageLabel.setBounds(centeredX, centeredY, desiredWidth, desiredHeight);
        add(imageLabel);

        // Barra de menu superior (visual)
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0, 0, 1600, 45);
        mb.setForeground(new Color(0xD9D9D9));
        add(mb);

        imageLabel.setLayout(null);
        setVisible(true);
    }

    /**
     * Método sobrescrito da interface ActionListener.
     *
     * @param ae evento de ação disparado (por exemplo, clique no botão)
     */
    public void actionPerformed(ActionEvent ae) {
        setVisible(true);
    }

    /**
     * Método principal para iniciar o sistema.
     *
     * @param args argumentos da linha de comando
     */
    public static void main(String[] args) {
        new HotelManagementSystem();
    }
}

/**
 * Classe auxiliar que representa um painel com um retângulo preenchido.
 * Usada como fundo na interface de login.
 */
class Retangulo extends JPanel {

    /**
     * Sobrescreve o método paintComponent para desenhar o retângulo cinza.
     *
     * @param grava o contexto gráfico usado para desenhar
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(0xD9D9D9));
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}
