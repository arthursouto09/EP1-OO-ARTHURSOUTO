package materia;

public abstract class Pessoa {
    protected String nome;
    protected int id;

    public Pessoa(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    
    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

}
