package com.mycompany.hotelmanagementsystem;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class HotelManagementSystem extends JFrame implements ActionListener {

    HotelManagementSystem() {

        setBounds(0, 0, 1600, 900);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Cria o painel com o retângulo
        Retangulo painel = new Retangulo();
        painel.setBounds(0, 43, 697, 857); // Posição e tamanho do retângulo
        painel.setLayout(null); // Define o layout como null para posicionamento manual
        painel.setOpaque(false); // Torna o painel transparente
        add(painel); // O retângulo é adicionado primeiro, ficando no fundo

        // Adiciona os componentes ao painel (não ao JFrame)
        JLabel user = new JLabel("Email");
        user.setBounds(144, 200, 100, 40);
        painel.add(user); // Adicionando ao painel

        JLabel textPass = new JLabel("Senha");
        textPass.setBounds(144, 354, 100, 40);
        painel.add(textPass); // Adicionando ao painel

        JTextField email = new JTextField();
        email.setBounds(144, 240, 440, 64);
        painel.add(email); // Adicionando ao painel
        
        JTextField password = new JTextField();
        password.setBounds(144, 394, 440, 64);
        painel.add(password); // Adicionando ao painel
        
        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(157, 622, 384, 64);
        loginBtn.setBackground(new Color(153, 168, 228));
        loginBtn.setForeground(Color.BLACK);
        loginBtn.setOpaque(true);
        loginBtn.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        loginBtn.addActionListener(e -> new Login());
        painel.add(loginBtn);
        
        loginBtn.addActionListener(new ActionListener() {;
            public void actionPerformed(ActionEvent e) {
                String emailDigitado = email.getText();
                String senhaDigitada = password.getText();

                Login login = new Login();
                if (login.autenticar(emailDigitado, senhaDigitada)) {
                    // Se a autenticação for bem-sucedida, abre o Dashboard
                    new Dashboard(); // Nova tela de Dashboard
                    dispose(); // Fecha a tela de login
                } else {
                    JOptionPane.showMessageDialog(null, "Login ou senha inválidos.");
                }
            }
        });

        JButton cadastrarBtn = new JButton("Cadastrar");
        cadastrarBtn.setBounds(157, 508, 384, 64);
        cadastrarBtn.setBackground(new Color(200, 255, 200));
        cadastrarBtn.setForeground(Color.BLACK);
        cadastrarBtn.setOpaque(true);
        cadastrarBtn.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        cadastrarBtn.addActionListener(e -> new Cadastrar());
        painel.add(cadastrarBtn);

        ImageIcon originalIcon = new ImageIcon(getClass().getResource("/logo.png")); 

        // Define nova largura desejada (ex: 200px)
        int desiredWidth = 200;

        // Calcula altura proporcional
        int originalWidth = originalIcon.getIconWidth();
        int originalHeight = originalIcon.getIconHeight();
        int desiredHeight = (desiredWidth * originalHeight) / originalWidth;

        // Redimensiona a imagem
        Image scaledImage = originalIcon.getImage().getScaledInstance(desiredWidth, desiredHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        // Calcula posição para centralizar dentro dos 632px (de x = 968 até 1600)
        int spaceStartX = 600;
        int availableWidth = 1600 - spaceStartX;
        int centeredX = spaceStartX + (availableWidth - desiredWidth) / 2;

        // Calcula posição para centralizar verticalmente (opcional)
        int frameHeight = 900;
        int centeredY = (frameHeight - desiredHeight) / 2;

        // Cria o JLabel com a imagem
        JLabel imageLabel = new JLabel(scaledIcon);
        imageLabel.setBounds(centeredX, centeredY, desiredWidth, desiredHeight);
        add(imageLabel);
        
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0,0,1600,45);
        mb.setForeground(new Color(0xD9D9D9));
        add(mb);
        
        imageLabel.setLayout(null);

        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(true);
    }

    public static void main(String[] args) {
        new HotelManagementSystem();
    }
}

class Retangulo extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Desenha um retângulo em (0, 0) com 697 de largura e 857 de altura
        g.setColor(new Color(0xD9D9D9)); // Cor do retângulo
        g.fillRect(0, 0, getWidth(), getHeight()); // Preenche o retângulo no painel
    }
}
