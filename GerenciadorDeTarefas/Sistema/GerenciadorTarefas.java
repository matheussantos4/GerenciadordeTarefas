package Sistema;

import java.util.ArrayList;

public class GerenciadorTarefas {

    ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(Tarefa tarefa) {
        tarefas.remove(tarefa);
    }

    public void listarTarefas() {
        for (Tarefa tarefa: tarefas) {
            System.out.println(tarefa.getNome());}
    }

    public void removerTarefa() {
    }
}
