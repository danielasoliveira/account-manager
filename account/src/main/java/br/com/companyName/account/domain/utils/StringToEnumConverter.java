package br.com.companyName.account.domain.utils;

import br.com.companyName.account.domain.enums.TipoConta;
import org.springframework.core.convert.converter.Converter;

public class StringToEnumConverter implements Converter<String, TipoConta> {
    @Override
    public TipoConta convert(String source) {
        return TipoConta.valueOf(source.toUpperCase());
    }
}
