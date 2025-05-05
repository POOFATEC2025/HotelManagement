package com.mycompany.hotelmanagementsystem;

import com.mycompany.banco.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Classe responsável por realizar a autenticação de usuários no sistema.
 * Utiliza conexão com o banco de dados para verificar se o email e a senha informados
 * correspondem a um usuário cadastrado.
 * 
 * @author  
 * Itallo Moreno,  
 * Bruna Schultz,  
 * Eric Coraini
 */
public class Login {

    /**
     * Autentica um usuário com base no email e senha fornecidos.
     *
     * @param email O email do usuário.
     * @param senha A senha do usuário.
     * @return {@code true} se as credenciais forem válidas; {@code false} caso contrário.
     */
    public boolean autenticar(String email, String senha) {
        Connection conn = Conexao.conectar();
        boolean autenticado = false;

        if (conn != null) {
            try {
                String query = "SELECT * FROM usuarios WHERE email = ? AND senha = ?";
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setString(1, email);
                stmt.setString(2, senha);

                ResultSet rs = stmt.executeQuery();

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
