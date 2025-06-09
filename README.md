# 🏥 Clinic API

API REST para gerenciamento de pacientes, médicos e consultas médicas. Desenvolvida com Java 21, Spring Boot e MySQL.

## ✅ Requisitos

- Docker e Docker Compose instalados

## 🚀 Como executar

1. **Clone o repositório**
   ```bash
   git clone https://github.com/seu-usuario/clinic-api.git
   cd clinic-api

2. **Suba os containers com Docker Compose**
    ```bash
    docker-compose up --build
    ```
3. **Acesse a aplicação**
    - A API estará disponível em `http://localhost:8080`
    - O banco de dados MySQL estará em `localhost:3306` com usuário `user` e senha `password` e banco `clinic`.

4. Encerrar os containers
    ```bash
    docker-compose down
    ```

🔄 Endpoints REST

Pacientes (/patients)

    POST /patients

    GET /patients

    GET /patients/{id}

    DELETE /patients/{id}

Médicos (/doctors)

    POST /doctors

    GET /doctors

    GET /doctors/{id}

    DELETE /doctors/{id}

Consultas (/appointments)

    POST /appointments

    GET /appointments

    GET /appointments/{id}

    DELETE /appointments/{id}

🧱 Tecnologias Utilizadas

    Java 21

    Spring Boot

    MySQL