//package aluno;
import aluno.Aluno;
import aluno.AlunoNormal;
import materia.Disciplina;
import materia.Nota;
//package materia;

public class Main {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new AlunoNormal("Arthur", 123456, "Engenharia");
        Disciplina  disciplina = new Disciplina("Matematica", "MAT101", 60);
        Nota nota = new Nota(7.0, 8.0, 9.0, 10.0, 6.0);
        System.out.println("Hello " + aluno.getNome() + " do curso de " + aluno.getCurso());
    }
}
