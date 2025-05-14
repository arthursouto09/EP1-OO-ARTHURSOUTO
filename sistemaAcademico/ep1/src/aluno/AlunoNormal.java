package aluno;

public class AlunoNormal extends Aluno {
    public AlunoNormal(String nome, int matricula, String curso) {
        super(nome, matricula, curso);
    }

    @Override
    public boolean podeMatricular(String materia) {
        return disciplinasInscritas.size() < 6;
    }

    public boolean recebeNotas() {
        return true;
    }
}