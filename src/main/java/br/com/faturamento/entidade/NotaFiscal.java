package br.com.faturamento.entidade;

public abstract class NotaFiscal {

    private final String descricao;
    private final double valorTotal;

    public NotaFiscal(String descricao, double valorTotal) {
        this.descricao = descricao;
        this.valorTotal = valorTotal;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public abstract double calcularImpostos();

    public void emitir() {
        System.out.printf("Emissao NF para: %s%n", getDescricao());
        System.out.printf("Valor total: R$ %.2f%n", getValorTotal());
        System.out.printf("Impostos totais: R$ %.2f%n", calcularImpostos());
    }

}
