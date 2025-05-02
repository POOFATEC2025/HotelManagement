CREATE DATABASE poo_2025;
GO
USE poo_2025;
GO

CREATE TABLE usuarios (
    id INT PRIMARY KEY IDENTITY(1,1),
    email VARCHAR(255) NOT NULL UNIQUE,
    senha VARCHAR(255) NOT NULL
);
GO

INSERT INTO usuarios (email, senha) VALUES 
('bruna','123');