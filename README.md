# 🛍️ Sistema de Gerenciamento de Produtos

Um sistema completo para gerenciamento de produtos e categorias desenvolvido em Java, utilizando conceitos de Programação Orientada a Objetos e arquitetura em camadas. Realizado durante as aulas do Nano Course de Java Development oferecido pela Fiap (Faculdade de Informática e Administração Paulista).

## 📋 Sobre o Projeto

Este projeto foi desenvolvido como parte de um curso de certificação Java Development de 60 horas de duração oferecido pela FIAP. O sistema permite o gerenciamento completo de produtos para uma microempresa do setor de equipamentos eletrônicos, oferecendo funcionalidades de cadastro, consulta, alteração e organização por categorias.

## ✨ Funcionalidades

- ✅ **Cadastro de Categorias**: Criação de novas categorias para organizar produtos
- ✅ **Cadastro de Produtos**: Adição de novos produtos com validação de dados
- ✅ **Alteração de Produtos**: Edição completa dos dados de produtos existentes
- ✅ **Consulta por ID**: Busca específica de produtos pelo identificador único
- ✅ **Consulta por Categoria**: Listagem de todos os produtos de uma categoria
- ✅ **Interface Gráfica**: Interface amigável utilizando JOptionPane
- ✅ **Validação de Dados**: Verificação de integridade dos dados inseridos

## 🏗️ Arquitetura do Projeto

O projeto segue uma arquitetura em camadas bem definida:

```
br.com.fiap.produtos/
├── Main.java                              # Ponto de entrada da aplicação
├── model/                                 # Modelos de dados
│   ├── Categoria.java                     # Entidade Categoria
│   └── Produto.java                       # Entidade Produto
├── repository/                            # Camada de persistência
│   ├── CategoriaCollectionRepository.java
│   └── ProdutoCollectionRepository.java
└── view/                                  # Interface com usuário
    ├── CategoriaView.java                 # Telas de categoria
    ├── Opcao.java                         # Enum de opções do menu
    ├── OpcaoView.java                     # Menu principal
    └── ProdutoView.java                   # Telas de produto
```

## 🛠️ Tecnologias Utilizadas

- **Java 17+** - Linguagem de programação
- **Maven** - Gerenciamento de dependências e build
- **Swing (JOptionPane)** - Interface gráfica
- **Collections API** - Estruturas de dados
- **Stream API** - Processamento de dados
- **BigDecimal** - Cálculos monetários precisos
- **LocalDateTime** - Controle de datas e horários

## 📊 Modelo de Dados

### Categoria
```java
- Long id
- String nome
```

### Produto
```java
- Long id
- String nome
- String descricao
- BigDecimal preco
- LocalDateTime dataDeCadastro
- Categoria categoria
```

### Relacionamento
- Um produto pertence a uma categoria (Many-to-One)
- Uma categoria pode ter vários produtos (One-to-Many)

## 🚀 Como Executar

### Pré-requisitos
- Java 17 ou superior
- Maven 3.6 ou superior
- IDE (IntelliJ IDEA, Eclipse, VS Code)

### Passos para execução

1. **Clone o repositório**
```bash
git clone https://github.com/seu-usuario/sistema-gerenciamento-produtos.git
cd sistema-gerenciamento-produtos
```

2. **Compile o projeto**
```bash
mvn clean compile
```

3. **Execute a aplicação**
```bash
mvn exec:java -Dexec.mainClass="br.com.fiap.produtos.Main"
```

Ou execute diretamente pela sua IDE favorita executando a classe `Main.java`.

## 💡 Como Usar

1. **Inicie a aplicação** - O menu principal será exibido
2. **Escolha uma opção** do menu:
   - Cadastrar Categoria
   - Cadastrar Produto
   - Alterar Produto
   - Consultar Produto por ID
   - Consultar Produto por Categoria
   - Encerrar Sistema

3. **Siga as instruções** nas telas para cada operação

### Dados Iniciais
O sistema já vem com algumas categorias e produtos pré-cadastrados:

**Categorias:**
- Eletrônicos
- Celulares  
- Livros

**Produtos:**
- Kindle (Categoria: Eletrônicos)
- iPhone 14 Pro Max (Categoria: Celulares)

## 🔧 Características Técnicas

### Padrões Implementados
- **Repository Pattern** - Para abstração da camada de dados
- **MVC Pattern** - Separação entre Model, View e Controller
- **Builder Pattern** - Uso de method chaining nos setters

### Boas Práticas
- ✅ Encapsulamento adequado
- ✅ Sobrescrita de `equals()` e `hashCode()`
- ✅ Uso de `BigDecimal` para valores monetários
- ✅ Tratamento de exceções
- ✅ Validação de entrada de dados
- ✅ Código limpo e comentado
- ✅ Nomenclatura clara e consistente

### Validações Implementadas
- **Nome do produto**: Mínimo 3 caracteres
- **Descrição**: Mínimo 5 caracteres  
- **Preço**: Deve ser maior que zero
- **Categoria**: Obrigatória para produtos
- **ID**: Validação numérica para consultas

## 📱 Screenshots

![image](<img width="1025" height="401" alt="image" src="https://github.com/user-attachments/assets/208ab30d-7b6c-46db-989f-ba86880cb460" />
)
![image](<img width="646" height="345" alt="image" src="https://github.com/user-attachments/assets/b3ce37d1-4ab2-440a-9019-82476418112b" />)
![image](<img width="618" height="329" alt="image" src="https://github.com/user-attachments/assets/df1e3018-3cce-4cf1-b612-3218f68f371e" />
)

## 🎯 Próximas Melhorias

- [ ] Integração com banco de dados real
- [ ] Interface gráfica mais robusta (JavaFX)
- [ ] Relatórios em PDF
- [ ] Sistema de login e permissões
- [ ] API REST
- [ ] Testes unitários
- [ ] Logs de auditoria

## 📚 Conceitos Aplicados

Este projeto demonstra a aplicação prática de:

- **Programação Orientada a Objetos**
- **Herança e Polimorfismo**
- **Collections Framework**
- **Stream API**
- **Tratamento de Exceções**
- **Padrões de Projeto**
- **Arquitetura em Camadas**
- **Clean Code**

## 👨‍💻 Autor

**Renan Dias Utida**
- LinkedIn: [Renan Dias Utida](https://www.linkedin.com/in/renan-dias-utida-1b1228225/)
- GitHub: [renan-utida](https://github.com/renan-utida)

## 📄 Licença

Este projeto está sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.

## 🙏 Agradecimentos

- FIAP pela excelente estrutura do curso
- Professores pela orientação detalhada
- Comunidade Java pelo suporte

---

⭐ Se este projeto te ajudou, considere dar uma estrela!
