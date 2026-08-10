package Sistema;

public class Tarefa {
    private String nome;
    private int ID;
    private Estagios status;
    private static int contadorID = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }

    public Estagios getStatus() {
        return status;
    }

    public void setStatus(Estagios status) {
        this.status = status;
    }

    public int getID() {
        return ID;
    }

    public Tarefa(String nome) {
        contadorID++;
        this.nome = nome;
        this.ID = contadorID;
        this.status = Estagios.PENDENTE;
    }
}
