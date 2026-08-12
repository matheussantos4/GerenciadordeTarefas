# Gerenciador de Tarefas

Projeto CRUD em Java para aprender conceitos de **Programação Orientada a Objetos**: encapsulamento, enums, coleções e validação de dados.

## Estrutura

```
GerenciadorDeTarefas/Sistema/
├── Tarefa.java              # Modelo com ID auto-incremento
├── Estagios.java            # Enum: PENDENTE, EM_ANDAMENTO, CONCLUIDA, CANCELADA
├── GerenciadorTarefas.java  # CRUD com ArrayList
└── Main.java                # Menu interativo
```

## Classes

- **Tarefa**: ID único automático, nome validado, status padrão PENDENTE
- **Estagios**: Estados possíveis de uma tarefa
- **GerenciadorTarefas**: Adicionar, remover e listar tarefas
- **Main**: Menu console com tratamento de exceções

## Compilar e Executar

```bash
javac GerenciadorDeTarefas/Sistema/*.java
java -cp GerenciadorDeTarefas Sistema.Main
```

## Conceitos de POO

- Encapsulamento (getters/setters com validação)
- Atributos estáticos (`contadorID`)
- Enums para estados
- ArrayList para armazenar dados
- Separação de responsabilidades
