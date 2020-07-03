package br.com.companyName.account.controller;

import br.com.companyName.account.domain.enums.TipoConta;
import br.com.companyName.account.domain.response.ExtratoContaResponse;
import br.com.companyName.account.service.ExtratoContaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.time.LocalDateTime;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@CrossOrigin
@Validated
@Api(value = "Api's de extrato de conta corrente ou poupança", produces = APPLICATION_JSON_UTF8_VALUE)
public class ExtratoContaController {

    @Autowired
    private ExtratoContaService accountService;

    @ApiOperation(value = "Extrato de conta corrente ou poupança", nickname = "getExtratoConta")
    @RequestMapping(value = "/conta/extrato/{accountType}", method = GET, produces = APPLICATION_JSON_UTF8_VALUE)
    public ExtratoContaResponse getExtratoConta(
            @RequestParam(required = true)
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
                    LocalDateTime startDate,
            @RequestParam(required = true)
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
                    LocalDateTime endDate,
            @PathVariable TipoConta accountType
    ) throws IOException {
        return accountService.getExtratoConta(accountType, startDate, endDate);
    }
}
