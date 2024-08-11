package br.com.faturamento.entidade;

public class NotaFiscalServico extends NotaFiscal {

    private static final double ALIQUOTA_IMPOSTOS = 0.18;
    private static final int VALOR_MAXIMO_ISENCAO = 1_000;

    private final boolean intermunicipal;

    public NotaFiscalServico(String descricao, double valorTotal, boolean intermunicipal) {
        super(descricao, valorTotal);
        this.intermunicipal = intermunicipal;
    }

    public boolean isIntermunicipal() {
        return intermunicipal;
    }

    @Override
    public double calcularImpostos() {
        double valorImpostos = getValorTotal() * ALIQUOTA_IMPOSTOS;
        if (isIsentoDeImpostos()) {
            return 0;
        }
        return valorImpostos;
    }

    private boolean isIsentoDeImpostos() {
        return isIntermunicipal() && getValorTotal() <= VALOR_MAXIMO_ISENCAO;
    }
}


