package materia;

public class Modalidade {
    public String tipo;
   
    
    public Modalidade(String tipo) {
        this.tipo = tipo;
    }

    public boolean isPresencial() {
        return "Presencial".equalsIgnoreCase(tipo);
    }

    public boolean isRemota() {
        return "Remota".equalsIgnoreCase(tipo);
    }

    public String getTipo() {
        return tipo;
    }
}