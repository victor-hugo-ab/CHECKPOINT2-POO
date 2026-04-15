public class Caminhao extends Veiculo {

    private int numeroDeEixos;

    public Caminhao(String placa, double capacidade, int numeroDeEixos) {
        super(placa, capacidade);
        this.numeroDeEixos = numeroDeEixos;
    }

    @Override
    public String getDescricao() {
        return "Caminhão com " + numeroDeEixos + " eixos";
    }
}