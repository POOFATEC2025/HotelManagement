package com.mycompany.hotelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {

    public Dashboard() {
        setTitle("Dashboard");
        setSize(1600, 900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        // Botão principal da esquerda: Cadastro
        JButton btnCadastro = new JButton("Cadastro");
        btnCadastro.setBounds(300, 150, 400, 100);
        btnCadastro.setBackground(new Color(0xE0E0E0));
        btnCadastro.setForeground(Color.BLACK);
        btnCadastro.setFont(new Font("Arial", Font.PLAIN, 24));
        btnCadastro.setOpaque(true);
        btnCadastro.setBorder(BorderFactory.createEmptyBorder());
        add(btnCadastro);

        // Botões secundários da esquerda
        String[] leftButtons = { "Quarto", "Hóspede" };
        int y = 280;
        for (String text : leftButtons) {
            JButton b = new JButton(text);
            b.setBounds(350, y, 300, 60);
            b.setBackground(new Color(0xF8F8F8));
            b.setFont(new Font("Arial", Font.PLAIN, 20));
            b.setOpaque(true);
            b.setBorder(BorderFactory.createEmptyBorder());
            b.addActionListener(e -> {
                switch (text) {
                    case "Quarto" -> new TelaCadastroQuarto();
//                    case "Recepcionista" -> new RecepcionistaScreen();
                    case "Hóspede" -> new TelaCadastroHospede();
//                    case "Serviço de Quarto" -> new ServicoQuartoScreen();
                }
            });
            add(b);
            y += 80;
        }


        // Botão principal da direita: Registro
//        JButton btnRegistro = new JButton("Registro");
//        btnRegistro.setBounds(900, 150, 400, 100);
//        btnRegistro.setBackground(new Color(0xE0E0E0));
//        btnRegistro.setForeground(Color.BLACK);
//        btnRegistro.setFont(new Font("Arial", Font.PLAIN, 24));
//        btnRegistro.setOpaque(true);
//        btnRegistro.setBorder(BorderFactory.createEmptyBorder());
//        add(btnRegistro);
//
//        // Botões secundários da direita
//        String[] rightButtons = { "Reservar", "Liberar" };
//        y = 280;
//        for (String text : rightButtons) {
//            JButton b = new JButton(text);
//            b.setBounds(950, y, 300, 60);
//            b.setBackground(new Color(0xF8F8F8));
//            b.setFont(new Font("Arial", Font.PLAIN, 20));
//            b.setOpaque(true);
//            b.setBorder(BorderFactory.createEmptyBorder());
//            add(b);
//            y += 80;
//        }

        // Logo do hotel
        ImageIcon logoIcon = new ImageIcon(getClass().getResource("/logo.png"));
        Image logoImage = logoIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        JLabel logo = new JLabel(new ImageIcon(logoImage));
        logo.setBounds(1450, 20, 100, 100);
        add(logo);

        setVisible(true);

    }
    
        public void actionPerformed(ActionEvent ae){
        setVisible(true);
    }
    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Dashboard::new);
    }
}
