package br.com.faturamento;

import br.com.faturamento.entidade.GestorFiscal;
import br.com.faturamento.entidade.NotaFiscalProduto;
import br.com.faturamento.entidade.NotaFiscalServico;

public class Main {

    public static void main(String[] args) {

        NotaFiscalProduto notaFiscalProduto = new NotaFiscalProduto("NF Produto", 50.0, 25);
        NotaFiscalServico notaFiscalServico = new NotaFiscalServico("NF Servico", 999.0, true);
        GestorFiscal gestorFiscal = new GestorFiscal();

        gestorFiscal.emitirNotasFiscais(notaFiscalProduto, notaFiscalServico);

    }

}
