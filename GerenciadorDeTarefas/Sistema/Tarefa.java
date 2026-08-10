package Sistema;

public class Tarefa {
    private String nome;
    private double data;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public Tarefa(String nome, double data) {
        this.nome = nome;
        this.data = data;
    }
}
