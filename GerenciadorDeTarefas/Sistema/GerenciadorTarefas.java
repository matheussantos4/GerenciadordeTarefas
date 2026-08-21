package Sistema;

import java.util.ArrayList;

public class GerenciadorTarefas {

    ArrayList<Tarefa> tarefas = new ArrayList<>();

    // Metodo para adicionar tarefas
    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    // Loop para que tarefas consigam ser removidas por ID.
    public void removerTarefa(int ID) {
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).getID() == ID) {
                tarefas.remove(i);
                break;
            }
        }
    }

    // Metodo para listar tarefas existentes.
    public void listarTarefas() {
        // Condicional para caso não exista tarefas.
        if (tarefas.isEmpty()) {
            System.out.println("Não há tarefas.");
        } else {
            System.out.println();
            for (Tarefa tarefa : tarefas) {
                System.out.printf("ID: " + tarefa.getID() + "Título: " + tarefa.getNome() + "%n");
            }
            System.out.println();
        }
    }
}