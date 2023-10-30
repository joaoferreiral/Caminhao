package caminhao;

public class CaminhaoBau extends Caminhao {
    private int volume; // FAZER CAST PARA FLOAT > largura * comprimento * altura
    private float comprimento;
    private float largura;
    private float altura;

    public CaminhaoBau (int nrCaminhao, String modelo, int anoFabricacao, int capacidadeTotal, char unidade, float comprimento, float largura, float altura) {
        super(nrCaminhao, modelo, anoFabricacao, capacidadeTotal, unidade);
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }
    public int getVolume() {
        return volume;
    }
    public float getComprimento() {
        return comprimento;
    }
    public float getLargura() {
        return largura;
    }
    public float getAltura() {
        return altura;
    }
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
    public void setLargura(float largura) {
        this.largura = largura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void carregaBau(float qtdeQuilos) {
        if (qtdeQuilos <= getCapacidadeTotal()) {
            this.cargaAtual = qtdeQuilos / 1000;
        }
    }
    public void descarregaBau(float qtdeQuilos) {
        if (qtdeQuilos < cargaAtual) {
            this.cargaAtual = (qtdeQuilos / 1000) - cargaAtual;
        }
    }
    public void calculaVolume() {
        this.volume = (int) (this.comprimento * this.largura * this.altura);
    }
}
