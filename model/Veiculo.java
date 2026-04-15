public abstract class Veiculo {

    private String placa;
    private double capacidade;

    protected Veiculo(String placa, double capacidade) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("Capacidade deve ser positiva.");
        }
        this.placa = placa;
        this.capacidade = capacidade;
    }

    public String getPlaca() {
        return placa;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public abstract String getDescricao();
}