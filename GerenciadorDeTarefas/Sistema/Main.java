package Sistema;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GerenciadorTarefas g1 = new GerenciadorTarefas();
        int opcao = 0;

        // Menu visual do programa.
        System.out.println("---------Minhas tarefas---------");
        System.out.println("(1) Adicionar tarefa");
        System.out.println("(2) Remover tarefa");
        System.out.println("(3) Listar tarefas");
        System.out.print("Opção: ");

        // Loop para garantir a seleção de opções disponíveis no algoritmo.
        do {
            try {
                opcao = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Isso não é uma opção.");
                System.out.print("Tente novamente:");
                sc.nextLine();
            }
        } while (opcao <= 0 || opcao > 2);

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
        g1.listarTarefas();
    }
}