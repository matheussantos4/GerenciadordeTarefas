package Sistema;

public class Tarefa {
    private String nome;
    private int ID;
    private Estagios status;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        if (ID > 0) {
            this.ID = ID;
        }
    }

    public Estagios getStatus() {
        return status;
    }

    public void setStatus(Estagios status) {
        this.status = status;
    }

    public Tarefa(String nome, int ID) {
        this.nome = nome;
        this.ID = ID;
        this.status = Estagios.PENDENTE;
    }
}
