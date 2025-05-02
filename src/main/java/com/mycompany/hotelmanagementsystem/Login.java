package com.mycompany.hotelmanagementsystem;

import com.mycompany.banco.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {

    public boolean autenticar(String email, String senha) {
//        Connection conn = Conexao.conectar();
        Connection conn = Conexao.conectar();
        boolean autenticado = false;

        if (conn != null) {
            try {
                // Consulta para verificar o login do usuário
                String query = "SELECT * FROM usuarios WHERE email = ? AND senha = ?";
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setString(1, email);
                stmt.setString(2, senha);

                ResultSet rs = stmt.executeQuery();

                // Se encontrar um resultado, usuário está autenticado
                if (rs.next()) {
                    autenticado = true;
                }
            } catch (SQLException e) {
                System.out.println("Erro ao autenticar usuário.");
                e.printStackTrace();
            } finally {
                try {
                    if (conn != null) conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return autenticado;
    }
}

