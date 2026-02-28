# 💱 Conversor de Moedas - Challenge ONE Java

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java" alt="Java 17">
  <img src="https://img.shields.io/badge/Maven-3.8.1-blue?style=for-the-badge&logo=apache-maven" alt="Maven">
  <img src="https://img.shields.io/badge/GSON-2.10.1-green?style=for-the-badge&logo=google" alt="GSON">
</p>

## 📝 Sobre o Projeto
Este é um desafio de programação que faz parte do programa **Oracle Next Education (ONE)** em parceria com a **Alura**. O objetivo é construir um conversor de moedas funcional que realiza requisições a uma API externa de taxas de câmbio em tempo real.

O projeto foi desenvolvido seguindo boas práticas de programação, como **SOLID**, **XP (Extreme Programming)** e uma **Arquitetura Limpa** dividida em camadas.

---

## 🚀 Funcionalidades
- Interface interativa via Console.
- Conversão entre as moedas:
  - Dólar (USD) 🇺🇸
  - Real Brasileiro (BRL) 🇧🇷
  - Peso Argentino (ARS) 🇦🇷
  - Peso Colombiano (COP) 🇨🇴
- Consumo da API real [ExchangeRate-API](https://www.exchangerate-api.com/).
- Histórico de conversão em tempo real no console.

---

## 🛠️ Tecnologias Utilizadas
- **Java 17**: Linguagem principal e recursos modernos (Switch Expressions, Records).
- **Gson**: Biblioteca do Google para conversão de JSON para objetos Java.
- **HttpClient**: Cliente nativo do Java para requisições HTTP.
- **Maven**: Gerenciador de dependências e construção do projeto.
- **JUnit 5**: Framework para testes automatizados.

---

## 📂 Estrutura do Projeto
```text
src/main/java/br/com/alura/conversor/
├── domain/          # Modelos de dados e enums (Regras de Negócio)
├── service/         # Interfaces que definem o comportamento do sistema
├── infrastructure/  # Implementações técnicas (Chamadas de API)
└── presentation/    # Interface do usuário (Menu Principal)
```

---

## ⚙️ Como Executar
1. Clone o repositório.
2. Certifique-se de ter o **JDK 17** e o **Maven** instalados.
3. Obtenha sua chave de API gratuita em [ExchangeRate-API](https://www.exchangerate-api.com/).
4. No arquivo `ExchangeApiClient.java`, substitua a URL pela sua chave.
5. Compile e execute pelo terminal:
   ```bash
   mvn compile
   mvn exec:java -Dexec.mainClass="br.com.alura.conversor.presentation.Main"
   ```

---

## 🤝 Desenvolvido por:
Lucas Ferreira
*Projeto parte do Challenge ONE - Java - Alura & Oracle*

---
<p>Desenvolvido com ❤️ por Lucas durante o programa ONE.</p>