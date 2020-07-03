package br.com.companyName.account.domain.response;

import br.com.companyName.account.domain.mother.ApiObject;

public class LancamentoContaCorrenteCliente extends ApiObject {

    public Long numeroRemessaBanco;
    public String nomeSituacaoRemessa;
    public DomicilioBancarioResponse dadosDomicilioBancario;
    public String nomeTipoOperacao;

    public Long getNumeroRemessaBanco() {
        return numeroRemessaBanco;
    }

    public void setNumeroRemessaBanco(Long numeroRemessaBanco) {
        this.numeroRemessaBanco = numeroRemessaBanco;
    }

    public String getNomeSituacaoRemessa() {
        return nomeSituacaoRemessa;
    }

    public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
        this.nomeSituacaoRemessa = nomeSituacaoRemessa;
    }



    public String getNomeTipoOperacao() {
        return nomeTipoOperacao;
    }

    public void setNomeTipoOperacao(String nomeTipoOperacao) {
        this.nomeTipoOperacao = nomeTipoOperacao;
    }

    public DomicilioBancarioResponse getDadosDomicilioBancario() {
        return dadosDomicilioBancario;
    }

    public void setDadosDomicilioBancario(DomicilioBancarioResponse dadosDomicilioBancario) {
        this.dadosDomicilioBancario = dadosDomicilioBancario;
    }

    @Override
    public String toString() {
        return "LancamentoContaCorrenteCliente{" +
                "numeroRemessaBanco=" + numeroRemessaBanco +
                ", nomeSituacaoRemessa='" + nomeSituacaoRemessa + '\'' +
                ", dadosDomicilioBancario=" + dadosDomicilioBancario +
                ", nomeTipoOperacao='" + nomeTipoOperacao + '\'' +
                '}';
    }
}
