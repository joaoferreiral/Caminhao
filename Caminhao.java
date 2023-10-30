package caminhao;

public abstract class Caminhao {
    private int nrCaminhao;
    private String modelo;
    private int anoFabricacao;
    private int capacidadeTotal;
    protected float cargaAtual;
    private char unidade;

    public Caminhao (int nrCaminhao, String modelo, int anoFabricacao, int capacidadeTotal, char unidade) {
        this.nrCaminhao = nrCaminhao;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.capacidadeTotal = capacidadeTotal;
        this.cargaAtual = cargaAtual;
        this.unidade = unidade;
    }
    public int getNrCaminhao() {
        return nrCaminhao;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }
    public float getCargaAtual() {
        return cargaAtual;
    }
    public char getUnidade() {
        return unidade;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }
}
