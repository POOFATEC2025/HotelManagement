package com.mycompany.hotelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Tela principal (Dashboard) do sistema de gerenciamento hoteleiro.
 * 
 * @author 
 * Itallo Moreno,  
 * Bruna Schultz,  
 * Eric Coraini
 */
public class Dashboard extends JFrame implements ActionListener {

    /**
     * Construtor da classe Dashboard.
     * Inicializa a interface gráfica, define o layout, cores e eventos dos botões.
     */
    public Dashboard() {
        setTitle("Dashboard");
        setSize(1600, 900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        // Botão principal do menu lateral esquerdo
        JButton btnCadastro = new JButton("Cadastro");
        btnCadastro.setBounds(300, 150, 400, 100);
        btnCadastro.setBackground(new Color(0xE0E0E0));
        btnCadastro.setForeground(Color.BLACK);
        btnCadastro.setFont(new Font("Arial", Font.PLAIN, 24));
        btnCadastro.setOpaque(true);
        btnCadastro.setBorder(BorderFactory.createEmptyBorder());
        add(btnCadastro);

        // Botões secundários do menu lateral esquerdo
        String[] leftButtons = { "Quarto", "Hóspede" };
        int y = 280;
        for (String text : leftButtons) {
            JButton b = new JButton(text);
            b.setBounds(350, y, 300, 60);
            b.setBackground(new Color(0xF8F8F8));
            b.setFont(new Font("Arial", Font.PLAIN, 20));
            b.setOpaque(true);
            b.setBorder(BorderFactory.createEmptyBorder());

            // Ação do botão: abre a tela correspondente
            b.addActionListener(e -> {
                switch (text) {
                    case "Quarto" -> new TelaCadastroQuarto();
                    case "Hóspede" -> new TelaCadastroHospede();
                }
            });

            add(b);
            y += 80;
        }

        // Logo do sistema no canto superior direito
        ImageIcon logoIcon = new ImageIcon(getClass().getResource("/logo.png"));
        Image logoImage = logoIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        JLabel logo = new JLabel(new ImageIcon(logoImage));
        logo.setBounds(1450, 20, 100, 100);
        add(logo);

        setVisible(true);
    }

    /**
     * Implementação da interface ActionListener.
     * Torna a janela visível ao disparar eventos.
     *
     * @param ae o evento de ação
     */
    public void actionPerformed(ActionEvent ae){
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Dashboard::new);
    }
}
