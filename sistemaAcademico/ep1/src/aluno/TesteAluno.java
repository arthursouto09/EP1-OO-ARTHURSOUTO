package aluno;

public class TesteAluno {
    public static void main(String[] args) {
        AlunoNormal aluno = new AlunoNormal("João Silva", 12345, "Engenharia");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Curso: " + aluno.getCurso());
    }

}
