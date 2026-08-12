# Gerenciador de Tarefas 📝

Um projeto CRUD (Create, Read, Update, Delete) desenvolvido em Java com o objetivo de aprender e praticar conceitos de **Programação Orientada a Objetos (POO)**, especialmente **herança** e **polimorfismo**.

## 📚 Objetivos de Aprendizado

Este projeto foi criado para praticar:

- ✅ **Classes e Objetos** - Conceitos fundamentais de POO
- ✅ **Encapsulamento** - Uso de getters e setters para controlar acesso aos dados
- ✅ **Enums** - Representação de estados possíveis de uma tarefa
- ✅ **Coleções (ArrayList)** - Manipulação de listas dinâmicas
- ✅ **Validação de Dados** - Garantir integridade dos dados
- ✅ **Operações CRUD** - Create, Read, Update, Delete

## 🏗️ Estrutura do Projeto

```
GerenciadorDeTarefas/
├── Sistema/
│   ├── Main.java           # Classe com interface de menu interativa
│   ├── Tarefa.java         # Classe que representa uma tarefa
│   ├── GerenciadorTarefas.java  # Classe responsável pelas operações CRUD
│   └── Estagios.java       # Enum com os possíveis estados de uma tarefa
└── README.md               # Este arquivo
```

## 🔍 Descrição das Classes

### **Estagios.java** (Enum)

Define os possíveis estados de uma tarefa:

- `PENDENTE` - Tarefa não iniciada
- `EM_ANDAMENTO` - Tarefa em progresso
- `CONCLUIDA` - Tarefa finalizada
- `CANCELADA` - Tarefa cancelada

### **Tarefa.java** (Classe Modelo)

Representa uma tarefa individual com:

- `nome` - Título da tarefa (validado para não ser vazio)
- `ID` - Identificador único gerado automaticamente
- `status` - Estado atual da tarefa (usando enum Estagios)

**Características:**

- ID é gerado automaticamente com um contador estático
- Validação de nome para garantir que não seja nulo ou em branco
- Status padrão é `PENDENTE` ao criar uma nova tarefa

### **GerenciadorTarefas.java** (Classe de Gerenciamento)

Controla todas as operações com tarefas usando uma `ArrayList`:

**Métodos:**

- `adicionarTarefa(Tarefa tarefa)` - Adiciona uma nova tarefa à lista
- `removerTarefa(int ID)` - Remove uma tarefa pelo seu ID
- `listarTarefas()` - Exibe todas as tarefas cadastradas

### **Main.java** (Classe Principal)

Interface de linha de comando que permite ao usuário:

1. **Adicionar Tarefa** - Criar uma nova tarefa com título validado
2. **Remover Tarefa** - Deletar uma tarefa por ID
3. **Listar Tarefas** - Visualizar todas as tarefas

**Características de segurança:**

- Tratamento de exceções (`InputMismatchException`)
- Validação de entradas do usuário
- Menu com opções limitadas

## 🚀 Como Usar

### Compilar

```bash
javac GerenciadorDeTarefas/Sistema/*.java
```

### Executar

```bash
java -cp GerenciadorDeTarefas Sistema.Main
```

### Exemplo de Uso

```
---------Minhas tarefas---------
(1) Adicionar tarefa
(2) Remover tarefa
(3) Listar tarefas
Opção: 1
Título: Estudar Java
Tarefa adicionada!
```

## 💡 Conceitos de POO Demonstrados

| Conceito                   | Implementação                                     |
| -------------------------- | ------------------------------------------------- |
| **Encapsulamento**         | Getters e setters com validação                   |
| **Atributos Estáticos**    | `contadorID` para gerar IDs únicos                |
| **Enums**                  | Classe `Estagios` para estados de tarefa          |
| **Coleções**               | `ArrayList<Tarefa>` para armazenar dados          |
| **Validação**              | Métodos `setNome()` e construtor com verificações |
| **Reutilização de Código** | Separação de responsabilidades entre classes      |

## 🔄 Fluxo de Operações CRUD

```
CREATE  → Tarefa() novo → adicionarTarefa() → ArrayList
READ    → listarTarefas() → foreach loop → exibição
UPDATE  → setStatus() / setNome() → modifica atributo
DELETE  → removerTarefa(ID) → remove da ArrayList
```

## 📝 Notas Importantes

- Cada tarefa recebe um **ID único** ao ser criada, mesmo se o programa for reiniciado
- O **contador de IDs** é estático, o que garante unicidade na sessão atual
- A **validação de nome** impede tarefas com nomes vazios ou nulos
- Para uma aplicação completa, seria necessário implementar **persistência em banco de dados**

## 🎓 Sugestões de Melhorias

Para aprofundar os estudos, você pode adicionar:

- ✨ Persistência com banco de dados (JDBC, JPA)
- ✨ Herança (criar classes filhas de Tarefa)
- ✨ Polimorfismo (sobrescrita de métodos)
- ✨ Interface gráfica (Swing, JavaFX)
- ✨ Testes unitários (JUnit)
- ✨ Serialização e arquivo de saída

## 📄 Licença

Este é um projeto educacional. Sinta-se livre para estudar, modificar e aprender com ele!

---

**Desenvolvido para aprendizado de Programação Orientada a Objetos em Java** 🎯
