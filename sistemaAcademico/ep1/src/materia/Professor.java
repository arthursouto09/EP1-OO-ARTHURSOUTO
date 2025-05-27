package materia;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int id, String disciplina) {
        super(nome, id);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + getNome() + '\'' +
                ", id=" + getId() +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }


}
