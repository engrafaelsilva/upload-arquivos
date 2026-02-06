# 📁 API de Upload de Arquivos com Spring Boot e Swagger

Este projeto é uma **API REST para upload de arquivos**, desenvolvida em **Java** utilizando **Spring Boot**, com suporte a envio de arquivos via **multipart/form-data** e documentação interativa através do **Swagger / OpenAPI**.

O objetivo do projeto é demonstrar, de forma prática, como implementar upload de arquivos no Spring Boot seguindo boas práticas, além de documentar corretamente esse tipo de endpoint para facilitar testes e integração com outros sistemas.

---

## 🚀 Funcionalidades

- Upload de arquivos via API REST
- Suporte a arquivos utilizando `MultipartFile`
- Endpoint documentado com Swagger/OpenAPI
- Testes de upload diretamente pelo Swagger UI
- Estrutura simples e organizada para fácil manutenção
- Separação de responsabilidades (Controller / Service)

---

## 🛠️ Tecnologias Utilizadas

- **Java**
- **Spring Boot**
- **Spring Web**
- **MultipartFile**
- **Swagger / OpenAPI (SpringDoc)**
- **Maven**

---

## 🧠 Conceitos Aplicados

- Upload de arquivos com `multipart/form-data`
- Uso de `@RequestPart` no Spring Boot
- Documentação de endpoints com Swagger/OpenAPI
- Boas práticas em APIs REST
- Arquitetura em camadas (Controller e Service)
- Injeção de dependências

---

## 📌 Endpoint Disponível

### Upload de Arquivo

**POST** `/api/files/upload`

- **Content-Type:** `multipart/form-data`
- **Parâmetro:**
  - `file` → Arquivo a ser enviado

---

## 🧪 Testando com Swagger

Após iniciar a aplicação, acesse:
