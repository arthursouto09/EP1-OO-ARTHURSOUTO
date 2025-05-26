package materia;

public class Nota {
    private double p1;
    private double p2;
    private double p3;  
    private double atividades;
    private double trabalhos;
    

    public Nota(double p1, double p2, double p3, double atividades, double trabalhos) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.atividades = atividades;
        this.trabalhos = trabalhos;
    }

    public double calculaMediaSimples() {
        return (p1 + p2 + p3 + atividades + trabalhos) / 5;
    }

    public double calculaMediaPonderada() {
        return (p1 * 0.1 + p2 * 0.2 + p3 * 0.3 + atividades * 0.2 + trabalhos * 0.2) / (0.1 + 0.2 + 0.3 + 0.2 + 0.2);
    }

    
    public void setP1(double p1) {
        this.p1 = p1;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public void setP3(double p3) {
        this.p3 = p3;
    }

    public void setAtividades(double atividades) {
        this.atividades = atividades;
    }

    public void setTrabalhos(double trabalhos) {
        this.trabalhos = trabalhos;
    }
}

