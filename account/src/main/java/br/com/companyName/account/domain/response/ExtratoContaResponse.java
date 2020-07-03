package br.com.companyName.account.domain.response;

import br.com.companyName.account.domain.mother.ApiObject;

import java.util.List;

public class ExtratoContaResponse extends ApiObject {

    public TotalControleLancamentoResponse totalControleLancamento;
    public List<ControleLancamentoResponse> listaControleLancamento;

    public Integer indice;
    public Integer tamanhoPagina;
    public Integer totalElements;

    public TotalControleLancamentoResponse getTotalControleLancamento() {
        return totalControleLancamento;
    }

    public void setTotalControleLancamento(TotalControleLancamentoResponse totalControleLancamento) {
        this.totalControleLancamento = totalControleLancamento;
    }

    public List<ControleLancamentoResponse> getListaControleLancamento() {
        return listaControleLancamento;
    }

    public void setListaControleLancamento(List<ControleLancamentoResponse> listaControleLancamento) {
        this.listaControleLancamento = listaControleLancamento;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    public Integer getTamanhoPagina() {
        return tamanhoPagina;
    }

    public void setTamanhoPagina(Integer tamanhoPagina) {
        this.tamanhoPagina = tamanhoPagina;
    }

    public Integer getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
    }

    @Override
    public String toString() {
        return "ExtratoContaResponse{" +
                "totalControleLancamento=" + totalControleLancamento +
                ", listaControleLancamento=" + listaControleLancamento +
                ", indice=" + indice +
                ", tamanhoPagina=" + tamanhoPagina +
                ", totalElements=" + totalElements +
                '}';
    }
}
