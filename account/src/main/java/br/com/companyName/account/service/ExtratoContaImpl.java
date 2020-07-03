package br.com.companyName.account.service;

import br.com.companyName.account.domain.enums.TipoConta;
import br.com.companyName.account.domain.response.ExtratoContaResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

@Service
@Transactional("transactionManager")
public class ExtratoContaImpl implements ExtratoContaService {

    @Override
    public ExtratoContaResponse getExtratoConta(TipoConta accountType, LocalDateTime startDate, LocalDateTime endDate) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        ExtratoContaResponse accountStatementResponse = objectMapper.readValue(new File("C:\\projetos\\cielo\\repository\\lancamento-conta-legado.json"), ExtratoContaResponse.class);
        return accountStatementResponse;
    }
}
