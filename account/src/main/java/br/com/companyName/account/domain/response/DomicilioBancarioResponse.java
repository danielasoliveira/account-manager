package br.com.companyName.account.domain.response;

import br.com.companyName.account.domain.mother.ApiObject;

public class DomicilioBancarioResponse extends ApiObject {
    public Long codigoBanco;
    public Long numeroAgencia;
    public String numeroContaCorrente;

    public Long getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(Long codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public Long getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(Long numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    public void setNumeroContaCorrente(String numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
    }

    @Override
    public String toString() {
        return "DomicilioBancarioResponse{" +
                "codigoBanco=" + codigoBanco +
                ", numeroAgencia=" + numeroAgencia +
                ", numeroContaCorrente='" + numeroContaCorrente + '\'' +
                '}';
    }
}
