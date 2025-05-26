package aluno;

import java.time.LocalDate;
import java.util.List;



public abstract class Aluno {
    protected String nome;
    protected int matricula;
    protected String curso;
    protected List<String> disciplinasInscritas;
    protected LocalDate dataLimiteTrancamento;

    public Aluno(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public abstract boolean podeMatricular(String materia);
    
    public void matricular(String materia) {
        if (podeMatricular(materia)) {
            disciplinasInscritas.add(materia);
        } else {
            System.out.println("Não é possível matricular na disciplina " + materia);
        }
    }

    public void trancar(String materia) {
        LocalDate hoje = LocalDate.now(); // REcebe a data atual que o aluno irá realizar o trancae
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
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
    public List<String> getDisciplinasInscritas() {
        return disciplinasInscritas;
    }


































}
