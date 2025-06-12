# 📊 Otimização da Alocação de Ambulâncias – Tocantins

Este projeto implementa um modelo de **Programação Linear** utilizando o **método Simplex** para otimizar a alocação de ambulâncias nos municípios de **Palmas**, **Araguaína** e **Porto Nacional**, no estado do Tocantins. O objetivo é minimizar o tempo total médio de resposta às emergências, respeitando restrições logísticas e operacionais com base em dados reais.

## 🧮 Formulação Matemática

**Função Objetivo:**

Minimizar o tempo médio total de resposta:

```
Min Z = 10x₁ + 12x₂ + 15x₃
```

onde:
- x₁ = ambulâncias em Palmas
- x₂ = ambulâncias em Araguaína
- x₃ = ambulâncias em Porto Nacional

**Restrições:**

```
x₁ + x₂ + x₃ = 20           // Total de ambulâncias disponíveis
x₁ ≥ 12                     // Mínimo para Palmas // Altere a vontade
x₂ ≥ 6                      // Mínimo para Araguaína // Altere a vontade
x₃ ≥ 2                      // Mínimo para Porto Nacional // Altere a vontade
x₁, x₂, x₃ ≥ 0              // Não negatividade
```

## 📂 Estrutura do Projeto

```
.
├── src/
│   └── main/
│       └── java/
│           └── br/
│               └── unitins/
│                   └── AlocacaoAmbulancias.java
├── pom.xml
└── README.md
```

## ⚙️ Requisitos

- Java 17+
- Maven 3.6+
- Apache Commons Math 3.6.1 (já incluído no `pom.xml`)

## 🚀 Como Executar

### 1. Clonar o projeto

```bash
git clone https://github.com/seuusuario/otimizacao-ambulancias.git
cd otimizacao-ambulancias
```

### 2. Compilar o projeto

```bash
mvn compile
```

### 3. Executar

```bash
mvn exec:java
```

## 📌 Exemplo de Saída

```text
x1 (Palmas): 12.00
x2 (Araguaína): 6.00
x3 (Porto Nacional): 2.00
Tempo médio total mínimo: 264.0 min
```

## 🧠 Tecnologias Utilizadas

- **Java 17**
- **Apache Commons Math 3.6.1**
- **Maven**
- **Programação Linear (Método Simplex)**

## 📚 Referências

- Ministério da Saúde (gov.br)
- Prefeitura de Palmas (palmas.to.gov.br)
- Prefeitura de Araguaína (araguaina.to.gov.br)
- Regimento do SAMU Palmas

## 👨‍💻 Autores

**João Pedro de Oliveira** 

**Luiz Cláudio de Oliveira**

**Werbton Carvalho da Rocha Filho**

Curso de Sistemas de Informação – UNITINS  
Trabalho acadêmico para a A2 da disciplina de Otimização para Sistema
