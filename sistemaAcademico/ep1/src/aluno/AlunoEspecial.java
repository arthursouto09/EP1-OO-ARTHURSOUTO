package aluno; 

public class AlunoEspecial extends Aluno {
   
    public AlunoEspecial(String nome, int matricula, String curso) {
        super(nome, matricula, curso);
    }

    @Override
    public boolean podeMatricular(String materia) {
        return disciplinasInscritas.size() < 2;
    }

    public boolean recebeNotas(){
        return false;
    }
}