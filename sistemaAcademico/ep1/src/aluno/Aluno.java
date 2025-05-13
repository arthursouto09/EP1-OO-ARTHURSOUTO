package aluno;

import java.util.List;
import java.time.LocalDate;



public class Aluno {
    protected String nome;
    protected int matricula;
    protected String curso;
    protected List<String> disciplinasInscritas;
    protected LocalDate dataLimiteTrancamento;

    public Aluno(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.dataLimiteTrancamento = dataLimiteTrancamento;
    }

    public int getMatricula() {
        return matricula;
    }

    public absract boolean podeMatricular(String materia);

    
    public void matricular(String materia) {
        if (podeMatricular(materia)) {
            disciplinasInscritas.add(materia);
        } else {
            System.out.println("Não é possível matricular na disciplina " + materia);
        }
    }

    public void trancar(String materia) {
        LocalDate hoje = LocalDate.now(); // Obtém a data atual
        if (hoje.isAfter(dataLimiteTrancamento)) {
            System.out.println("Não é possível trancar a disciplina " + materia + " após a data limite de " + dataLimiteTrancamento);
            return;
        }

        if (disciplinasInscritas.contains(materia)) {
            disciplinasInscritas.remove(materia);
            System.out.println("Disciplina " + materia + " trancada com sucesso.");
        } else {
            System.out.println("O aluno não está matriculado na disciplina " + materia);
        }
    }

    public void trancarSemestre(){
        disciplinasInscritas.clear();
        System.out.println("Semestre trancado com sucesso.");
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }   

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public List<String> getDisciplinasInscritas() {
        return disciplinasInscritas;
    }


































}
