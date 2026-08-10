package Sistema;

import java.util.ArrayList;

public class GerenciadorTarefas {
    ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void listarTarefas() {
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.isEmpty()) {
                System.out.println("Não há tarefas.");
            } else {
            System.out.println(tarefas.get(i).getNome());}
        }
    }

    public void removerTarefa() {

    }
}
