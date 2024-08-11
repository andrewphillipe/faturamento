package br.com.faturamento.entidade;

public class GestorFiscal {

    public void emitirNotasFiscais(NotaFiscal... notaFiscais) {
        for (NotaFiscal notaFiscal: notaFiscais){
            System.out.println("___________________________");
            notaFiscal.emitir();
            System.out.println("___________________________");
        }
    }

}
