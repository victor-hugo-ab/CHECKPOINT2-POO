public class Rota {

    private Pacote pacote;
    private Veiculo veiculo;

    public Rota(Pacote pacote, Veiculo veiculo) {
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    public void iniciarEntrega() {
        pacote.atualizarStatus(Status.EM_TRANSPORTE);
        System.out.println(
            "Levando pacote " + pacote.getCodigo() +
            " no veículo " + veiculo.getPlaca() +
            " (" + veiculo.getDescricao() + ")"
        );
    }
}