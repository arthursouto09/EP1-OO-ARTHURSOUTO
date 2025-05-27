package materia;

public class Turma {
    public String nome;
    public String codigo;
    public String horario; 
    public String sala;
    public int vagas;
    public Disciplina disciplina;
    public Professor professor;

    public Turma(String nome, String codigo, String horario, String sala, int vagas, Disciplina disciplina, Professor professor) {
        this.nome = nome;
        this.codigo = codigo;
        this.horario = horario;
        this.sala = sala;
        this.vagas = vagas;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }


}
