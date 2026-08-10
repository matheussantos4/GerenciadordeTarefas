package Sistema;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GerenciadorTarefas g1 = new GerenciadorTarefas();
        int opcao = 0;

        System.out.println("---------Minhas tarefas---------");
        System.out.println("Adicionar tarefa (1)");
        System.out.print("Opção: ");

        if (opcao <= 0 || opcao >= 2) {
            // Adicionar tarefa.
            String nomeTarefa;
            do {
                System.out.println("Título: ");
                nomeTarefa = sc.nextLine();
            } while (nomeTarefa != null || nomeTarefa.isBlank());

            Tarefa novaTarefa = new Tarefa(nomeTarefa);
            g1.adicionarTarefa(novaTarefa);
        }
    }
}