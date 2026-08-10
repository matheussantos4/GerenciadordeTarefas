package Sistema;

import java.util.ArrayList;

public class GerenciadorTarefas {

    ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(int ID) {
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).getID() == ID) {
                tarefas.remove(i);
                break;
            }
        }
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Não há tarefas.");
        } else {
            for (Tarefa tarefa : tarefas) {
                System.out.println(tarefa.getNome());
            }
        }
    }
}