package br.com.faturamento.entidade;

public class NotaFiscalProduto extends NotaFiscal {

    private static final double ALIQUOTA_FEDERAL = 0.18;
    private static final double ALIQUOTA_ESTADUAL = 0.12;

    private final double valorFrete;

    public NotaFiscalProduto(String descricao, double valorTotal, double valorFrete) {
        super(descricao, valorTotal);
        this.valorFrete = valorFrete;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    @Override
    public double calcularImpostos() {
        double valorImpostos = getValorTotal() * ALIQUOTA_FEDERAL;
        valorImpostos += getValorTotal() * ALIQUOTA_ESTADUAL;
        return valorImpostos;
    }
}
