public class Pacote {

    private String codigo;
    private double peso;
    private Status status;

    public Pacote(String codigo, double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso deve ser positivo.");
        }
        this.codigo = codigo;
        this.peso = peso;
        this.status = Status.PENDENTE;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPeso() {
        return peso;
    }

    public Status getStatus() {
        return status;
    }

    public void atualizarStatus(Status status) {
        this.status = status;
    }
}