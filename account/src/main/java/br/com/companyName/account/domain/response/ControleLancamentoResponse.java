package br.com.companyName.account.domain.response;

import br.com.companyName.account.domain.mother.ApiObject;
import br.com.companyName.account.domain.utils.ZonedDateTimeDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.ZonedDateTime;

public class ControleLancamentoResponse extends ApiObject {

    public LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;

    public DomicilioBancarioResponse dadosDomicilioBancario;

    public String dataEfetivaLancamento;
    public String dataLancamentoContaCorrenteCliente;
    public Long numeroEvento;
    public String descricaoGrupoPagamento;
    public Integer codigoIdentificadorUnico;
    public String nomeBanco;
    public Integer quantidadeLancamentoRemessa;
    public String numeroRaizCNPJ;
    public String numeroSufixoCNPJ;
    public String valorLancamentoRemessa;

    @JsonDeserialize(using = ZonedDateTimeDeserializer.class)
    public ZonedDateTime dateLancamentoContaCorrenteCliente;

    @JsonDeserialize(using = ZonedDateTimeDeserializer.class)
    public ZonedDateTime dateEfetivaLancamento;

    public LancamentoContaCorrenteCliente getLancamentoContaCorrenteCliente() {
        return lancamentoContaCorrenteCliente;
    }

    public void setLancamentoContaCorrenteCliente(LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente) {
        this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
    }

    public String getDataEfetivaLancamento() {
        return dataEfetivaLancamento;
    }

    public void setDataEfetivaLancamento(String dataEfetivaLancamento) {
        this.dataEfetivaLancamento = dataEfetivaLancamento;
    }

    public String getDataLancamentoContaCorrenteCliente() {
        return dataLancamentoContaCorrenteCliente;
    }

    public void setDataLancamentoContaCorrenteCliente(String dataLancamentoContaCorrenteCliente) {
        this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
    }

    public Long getNumeroEvento() {
        return numeroEvento;
    }

    public void setNumeroEvento(Long numeroEvento) {
        this.numeroEvento = numeroEvento;
    }

    public String getDescricaoGrupoPagamento() {
        return descricaoGrupoPagamento;
    }

    public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
        this.descricaoGrupoPagamento = descricaoGrupoPagamento;
    }

    public Integer getCodigoIdentificadorUnico() {
        return codigoIdentificadorUnico;
    }

    public void setCodigoIdentificadorUnico(Integer codigoIdentificadorUnico) {
        this.codigoIdentificadorUnico = codigoIdentificadorUnico;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public Integer getQuantidadeLancamentoRemessa() {
        return quantidadeLancamentoRemessa;
    }

    public void setQuantidadeLancamentoRemessa(Integer quantidadeLancamentoRemessa) {
        this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
    }

    public String getNumeroRaizCNPJ() {
        return numeroRaizCNPJ;
    }

    public void setNumeroRaizCNPJ(String numeroRaizCNPJ) {
        this.numeroRaizCNPJ = numeroRaizCNPJ;
    }

    public String getNumeroSufixoCNPJ() {
        return numeroSufixoCNPJ;
    }

    public void setNumeroSufixoCNPJ(String numeroSufixoCNPJ) {
        this.numeroSufixoCNPJ = numeroSufixoCNPJ;
    }

    public String getValorLancamentoRemessa() {
        return valorLancamentoRemessa;
    }

    public void setValorLancamentoRemessa(String valorLancamentoRemessa) {
        this.valorLancamentoRemessa = valorLancamentoRemessa;
    }

    public DomicilioBancarioResponse getDadosDomicilioBancario() {
        return dadosDomicilioBancario;
    }

    public void setDadosDomicilioBancario(DomicilioBancarioResponse dadosDomicilioBancario) {
        this.dadosDomicilioBancario = dadosDomicilioBancario;
    }

    public ZonedDateTime getDateLancamentoContaCorrenteCliente() {
        return dateLancamentoContaCorrenteCliente;
    }

    public void setDateLancamentoContaCorrenteCliente(ZonedDateTime dateLancamentoContaCorrenteCliente) {
        this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
    }

    public ZonedDateTime getDateEfetivaLancamento() {
        return dateEfetivaLancamento;
    }

    public void setDateEfetivaLancamento(ZonedDateTime dateEfetivaLancamento) {
        this.dateEfetivaLancamento = dateEfetivaLancamento;
    }

    @Override
    public String toString() {
        return "ControleLancamentoResponse{" +
                "lancamentoContaCorrenteCliente=" + lancamentoContaCorrenteCliente +
                ", dadosDomicilioBancario=" + dadosDomicilioBancario +
                ", dataEfetivaLancamento='" + dataEfetivaLancamento + '\'' +
                ", dataLancamentoContaCorrenteCliente='" + dataLancamentoContaCorrenteCliente + '\'' +
                ", numeroEvento=" + numeroEvento +
                ", descricaoGrupoPagamento='" + descricaoGrupoPagamento + '\'' +
                ", codigoIdentificadorUnico=" + codigoIdentificadorUnico +
                ", nomeBanco='" + nomeBanco + '\'' +
                ", quantidadeLancamentoRemessa=" + quantidadeLancamentoRemessa +
                ", numeroRaizCNPJ='" + numeroRaizCNPJ + '\'' +
                ", numeroSufixoCNPJ='" + numeroSufixoCNPJ + '\'' +
                ", valorLancamentoRemessa='" + valorLancamentoRemessa + '\'' +
                ", dateLancamentoContaCorrenteCliente=" + dateLancamentoContaCorrenteCliente +
                ", dateEfetivaLancamento=" + dateEfetivaLancamento +
                '}';
    }
}
