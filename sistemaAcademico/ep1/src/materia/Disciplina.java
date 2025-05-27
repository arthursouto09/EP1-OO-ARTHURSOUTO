package materia;


import java.util.ArrayList;
import java.util.List;


public class Disciplina {
    public String nome;
    public String codigo;
    public int cargaHoraria;
    private int totalAulas;
    public List<String> alunosMatriculados;


    public Disciplina(String nome, String codigo, int cargaHoraria) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.alunosMatriculados = new ArrayList<>();
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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<String> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(List<String> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }

    public int getTotalAulas() {
        return totalAulas;
    }
}
