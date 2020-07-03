package br.com.companyName.account.service;

import br.com.companyName.account.domain.enums.TipoConta;
import br.com.companyName.account.domain.response.ExtratoContaResponse;

import java.io.IOException;
import java.time.LocalDateTime;

public interface ExtratoContaService {
    ExtratoContaResponse getExtratoConta(TipoConta accountType, LocalDateTime startDate, LocalDateTime endDate) throws IOException;
}
