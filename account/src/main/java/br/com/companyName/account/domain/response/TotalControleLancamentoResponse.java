package br.com.companyName.account.domain.response;

import br.com.companyName.account.domain.mother.ApiObject;

public class TotalControleLancamentoResponse extends ApiObject {
    public Long quantidadeLancamentos;
    public Long quantidadeRemessas;
    public Double valorLancamentos;

    public Long getQuantidadeLancamentos() {
        return quantidadeLancamentos;
    }

    public void setQuantidadeLancamentos(Long quantidadeLancamentos) {
        this.quantidadeLancamentos = quantidadeLancamentos;
    }

    public Long getQuantidadeRemessas() {
        return quantidadeRemessas;
    }

    public void setQuantidadeRemessas(Long quantidadeRemessas) {
        this.quantidadeRemessas = quantidadeRemessas;
    }

    public Double getValorLancamentos() {
        return valorLancamentos;
    }

    public void setValorLancamentos(Double valorLancamentos) {
        this.valorLancamentos = valorLancamentos;
    }

    @Override
    public String toString() {
        return "TotalControleLancamentoResponse{" +
                "quantidadeLancamentos=" + quantidadeLancamentos +
                ", quantidadeRemessas=" + quantidadeRemessas +
                ", valorLancamentos=" + valorLancamentos +
                '}';
    }
}
