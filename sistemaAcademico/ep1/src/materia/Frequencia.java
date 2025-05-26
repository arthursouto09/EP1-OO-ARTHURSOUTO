package materia;

public class Frequencia {
    private final int totalAulas;
    private int aulasAusentes;

    public Frequencia(int totalAulas, int aulasPresentes) {
        this.totalAulas = totalAulas;
        this.aulasAusentes = 0;
    }

    public void registradorFaltas() {
        if (aulasAusentes < totalAulas) {
            aulasAusentes++;
        } else {
            System.out.println("Limite de faltas atingido.");
        }
    }

     public boolean isReprovadoPorFalta() {
        if (totalAulas == 0) return false;
        double percentualFaltas = (aulasAusentes * 100.0) / totalAulas;
        return percentualFaltas >= 25.0;
    
    }

    public double getPercentualFaltas() {
        if (totalAulas == 0) return 0.0;
        return (aulasAusentes * 100.0) / totalAulas;
    }

}
