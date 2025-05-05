package com.mycompany.banco;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe responsável por gerenciar a conexão com o banco de dados SQL Server.
 * Lê as configurações do banco de dados a partir do arquivo .env.
 * 
 * Variáveis esperadas no .env:
 * - DB_NAME
 * - DB_HOST
 * - DB_PORT
 * - DB_USER
 * - DB_PASSWORD
 * 
 * Utiliza o driver JDBC do SQL Server.
 * 
 * @author 
 * Itallo Moreno,  
 * Bruna Schultz,  
 * Eric Coraini
 */
public class Conexao {

    private static String URL;
    private static String USER;
    private static String PASSWORD;
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    // Bloco estático para inicializar as variáveis de conexão
    static {
        Dotenv dotenv = Dotenv.load(); // Carrega as variáveis do arquivo .env

        String database = dotenv.get("DB_NAME");
        String host = dotenv.get("DB_HOST");
        String port = dotenv.get("DB_PORT");

        URL = "jdbc:sqlserver://" + host + ":" + port + ";databaseName=" + database;
        USER = dotenv.get("DB_USER");
        PASSWORD = dotenv.get("DB_PASSWORD");
    }

    /**
     * Construtor padrão da classe Conexao.
     * Embora todos os métodos sejam estáticos, este construtor existe por conveniência.
     */
    public Conexao() {
        // Construtor vazio
    }

    /**
     * Estabelece a conexão com o banco de dados SQL Server.
     *
     * @return objeto Connection se a conexão for bem-sucedida; caso contrário, retorna null.
     */
    public static Connection conectar() {
        Connection conn = null;

        try {
            Class.forName(DRIVER); // Carrega o driver JDBC
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexão estabelecida com sucesso.");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados:");
            e.printStackTrace();
        }

        return conn;
    }

    /**
     * Método principal usado para testar a conexão com o banco de dados.
     *
     * @param args argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Conexao conexao = new Conexao(); // Instância para fins didáticos
        conexao.conectar();
    }
}
