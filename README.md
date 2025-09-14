# 🛒 MercadoLivre_Facol

Projeto acadêmico desenvolvido em **Java** com base no padrão arquitetural **MVC (Model - View - Controller)**.  
O sistema simula um pequeno marketplace, permitindo **cadastro, listagem e manipulação de produtos** de forma organizada.

---

## 📂 Estrutura do Projeto

O projeto segue a arquitetura **MVC**, organizada da seguinte forma:

```
src/
 ├── Main.java              # Classe principal
 ├── model/
 │    └── Produto.java      # Representação da entidade Produto
 ├── view/
 │    └── ProdutoView.java  # Interface de interação com o usuário
 ├── controller/
 │    └── ProdutoController.java # Controla a lógica entre Model e View
 └── repository/
      └── ProdutoRepositorio.java # Responsável pela persistência em memória
```

- **Model** → Representa os dados (ex.: `Produto`).  
- **View** → Interface de saída/interação com o usuário (ex.: `ProdutoView`).  
- **Controller** → Faz a ponte entre *Model* e *View* (ex.: `ProdutoController`).  
- **Repository** → Gerencia os dados em memória, simulando um banco de dados.  

---

## ⚙️ Pré-requisitos

- [Java JDK 8+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) instalado e configurado no `PATH`.  
- Terminal ou IDE de sua preferência (Ex.: **IntelliJ IDEA**, **Eclipse**, **VS Code**).

---

## 🚀 Como executar

1. **Clone o repositório** ou extraia os arquivos do `.zip`.  
   ```bash
   git clone https://github.com/seu-usuario/MercadoLivre_Facol.git
   cd MercadoLivre_Facol
   ```

2. **Compile os arquivos Java**:  
   ```bash
   javac src/model/*.java src/view/*.java src/controller/*.java src/repository/*.java src/Main.java
   ```

3. **Execute o programa**:  
   ```bash
   java -cp src Main
   ```

---

## 💻 Exemplo de uso

Ao executar o programa, você poderá:

- Cadastrar novos produtos  
- Listar todos os produtos disponíveis  
- Buscar um produto específico  
- Excluir produtos  

*(A interação depende da lógica implementada em `ProdutoView`)*

---

## 🔮 Possíveis melhorias

- Persistência em **banco de dados** (MySQL/PostgreSQL).  
- Interface gráfica com **JavaFX** ou **Swing**.  
- Implementação de testes unitários com **JUnit**.  
- Integração com APIs externas.  

---

## 👨‍🏫 Informações acadêmicas

- **Disciplina**: Programação  
- **Professor**: *Ricardo Correia*  
- **Autor**: *Jefferson Rodrigo*  
