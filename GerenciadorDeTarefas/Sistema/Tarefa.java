package Sistema;

public class Tarefa {
    private String nome;
    private int ID;
    private Estagios status;
    private static int contadorID = 0;

    public String getNome() {
        return nome;
    }
    
    // Set nome para garantir que não possa ser preenchido vazio.
    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }

    // Status tarefa vindo do enum Estagios.
    public Estagios getStatus() {
        return status;
    }

    public void setStatus(Estagios status) {
        this.status = status;
    }

    public int getID() {
        return ID;
    }

    //Construtor da tarefa com Contador de id automático.
    public Tarefa(String nome) {
        contadorID++;
        this.nome = nome;
        this.ID = contadorID;
        this.status = Estagios.PENDENTE;
    }
}
