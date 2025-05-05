# Sistema de Hotelaria em Java

Este é um projeto Java desenvolvido com Java 17.0.9 que se conecta a um banco de dados SQL Server rodando em um container Docker.

---

## ✅ Requisitos

- Java 17.0.9
- Maven
- Docker

---

Instale o mvn e rode: mvn clean install

Crie um .env com o conteúdo:
- DB_HOST=localhost
- DB_PORT=1433
- DB_NAME=nome do database
- DB_USER=username
- DB_PASSWORD=senha

## 🐳 Como subir o SQL Server via Docker

Execute o comando abaixo no terminal para iniciar um container do SQL Server:

```bash
docker run -e "ACCEPT_EULA=Y" -e "SA_PASSWORD=YourStrong@Passw0rd" \
   -p 1433:1433 --name sqlserver_container -d mcr.microsoft.com/mssql/server:2022-latest 
