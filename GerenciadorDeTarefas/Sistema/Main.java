package Sistema;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GerenciadorTarefas g1 = new GerenciadorTarefas();
        int opcao = 0;

        Tarefa tarefa1 = new Tarefa("acorda");
        g1.adicionarTarefa(tarefa1);
        Tarefa tarefa2 = new Tarefa("escovar dente");
        g1.adicionarTarefa(tarefa2);
        Tarefa tarefa3 = new Tarefa("Remover lixo");
        g1.adicionarTarefa(tarefa3);

        // Loop para garantir a seleção de opções disponíveis no algoritmo.
        do {
            try {
                // Menu visual do programa.
                System.out.println("---------Minhas tarefas---------");
                System.out.println("(1) Adicionar tarefa");
                System.out.println("(2) Remover tarefa");
                System.out.println("(3) Listar tarefas");
                System.out.println("(4) Sair");
                System.out.print("Opção: ");
                opcao = sc.nextInt();


            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Opção inválida.");
                System.out.println();
                opcao = 0;
                sc.nextLine();
            }

            // Adicionar tarefa.
            if (opcao == 1) {
                String nomeTarefa;
                do {
                    System.out.print("Título: ");
                    sc.nextLine();
                    nomeTarefa = sc.nextLine();
                } while (nomeTarefa == null || nomeTarefa.isBlank());

                System.out.println("Tarefa adicionada!");
                Tarefa novaTarefa = new Tarefa(nomeTarefa);
                g1.adicionarTarefa(novaTarefa);
            }

            if (opcao == 2) {
                int IDremover = 0;
                do {
                    try {
                        g1.listarTarefas();
                        System.out.print("ID da tarefa a remover: ");
                        IDremover = sc.nextInt();
                        if (IDremover <= 0) {
                            System.out.println("ID inválido.");
                            continue;
                        }
                        boolean sucesso = g1.removerTarefa(IDremover);
                        if (sucesso) {
                            System.out.println("Tarefa removida!");
                        } else {
                            System.out.println("ID não encontrado.");
                        }

                    } catch (InputMismatchException e) {
                        System.out.println("ID inválido!");
                        sc.nextLine();
                    }
                } while (IDremover <= 0);
            }

            if (opcao == 3) {
                g1.listarTarefas();
            }

        } while (opcao != 4);

        System.out.println("Saindo...");
        sc.close();
    }
}