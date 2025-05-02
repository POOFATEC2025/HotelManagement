package com.mycompany.banco;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static String URL;
    private static String USER;
    private static String PASSWORD;
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    static {
        // Bloco estático para carregar as variáveis do .env
        Dotenv dotenv = Dotenv.load();
        String database = dotenv.get("DB_NAME");
        String host = dotenv.get("DB_HOST");
        String port = dotenv.get("DB_PORT");

        URL = "jdbc:sqlserver://" + host + ":" + port + ";databaseName=" + database;
        USER = dotenv.get("DB_USER");
        PASSWORD = dotenv.get("DB_PASSWORD");
    }

    public static Connection conectar() {
        Connection conn = null;

        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexão estabelecida com sucesso.");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados:");
            e.printStackTrace();
        }

        return conn;
    }


    public static void main(String[] args) {
        Conexao conexao = new Conexao();
        conexao.conectar();
    }
}
